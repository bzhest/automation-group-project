package com.company.infrastructure.data.users;

import com.company.infrastructure.data.api.UserDataMapper;
import com.company.infrastructure.data.exceptions.UserNotFoundException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by SYSTEM on 08.05.2017.
 */
public class DataBaseDataMapper implements UserDataMapper {


    //---------------------------------------------------------------------------------------------------------------
    //В конструкторе производится подключение к Базе Данных + считываются данные базы в список users


    private List<User> users = new ArrayList<>();
    private Connection co;




    //В конструкторе производится подключение к Базе Данных

    public DataBaseDataMapper() {
        try {
            //Иниациализация необходимого драйвера (указываю имя пакета)
            Class.forName("org.sqlite.JDBC");
            co = DriverManager.getConnection("jdbc:sqlite:E:\\SQLite\\users.db"); //("jdbc:sqlite:E:\\SQLite\\users.db")
            System.out.println("Connected");

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        try {
            Statement statement = co.createStatement();
            String query = "SELECT name, email, password FROM users";
            ResultSet rs = statement.executeQuery(query);

            while (rs.next()) {
                String name = rs.getString("name");
                String email = rs.getString("email");
                String password = rs.getString("password");
                System.out.println(name + "\t| " + email + "\t| " + password + "\t| ");
                users.add(new User(name, email, password));
            }
            rs.close();
            statement.close();

        }catch(Exception ex){
            System.out.println(ex.getMessage());

        }
    }


    public void close() {
        try {
            co.close();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

//---------------------------------------------------------------------------------------------------------

    public void insert() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input user name: ");
        String name = scanner.next();
        System.out.println("Input user email: ");
        String email = scanner.next();
        System.out.println("Input user password: ");
        String password = scanner.next();

        String query = "INSERT INTO users (name,email,password)" +
                " VALUES ('" + name + "', '" + email + "', '" + password + "');";
        //Для запроса к базе данных используется Statement
        try {
            Statement st = co.createStatement();
            st.executeUpdate(query);
            System.out.println("Row was added");
            st.close();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }


    @Override
    public User getUserByUserName(String username) {

        for(User u: users){
            if(u.getUserName().equals(username)){
                return u;
            }
        }
        throw new UserNotFoundException("User wasn't found in DB by name");
    }

    @Override
    public User getUserByEmail(String email) {

        for(User u: users){
            if(u.getEmail().equals(email)){
                return u;
            }
        }
        throw new UserNotFoundException("User wasn't found in DB by email");
    }
}

/*CREATE TABLE users(
        NAME VARCHAR(50),
        EMAIL VARCHAR(50),
        PASSWORD VARCHAR(50));

INSERT INTO users(NAME, EMAIL, PASSWORD)
VALUES ('Andrey', 'test_1@dxloo.com', '123');

        INSERT INTO users(NAME, EMAIL, PASSWORD)
        VALUES ('Lena', 'test_2@dxloo.com', '1234');

<<<<<<< HEAD



=======
        INSERT INTO users(NAME, EMAIL, PASSWORD)
        VALUES ('Olga', 'test_3@dxloo.com', '12345');*/
