package com.company.infrastructure.data.users;

import com.company.infrastructure.data.api.UserDataMapper;
import com.company.infrastructure.data.exceptions.UserNotFoundException;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Andrey on 30.04.2017.
 */
public class FileUserDataMapper implements UserDataMapper {

    private List<User> users;

    public FileUserDataMapper() {
        users = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("users1.txt")));
            String strLine;
            while ((strLine = br.readLine()) != null) {
                users.add(new User(
                        strLine.split(",")[0],
                        strLine.split(",")[1],
                        strLine.split(",")[2]));
            }
            br.close();
        } catch (IOException ex) {

        }
    }

    @Override
    public User getUserByUserName(String username) throws UserNotFoundException {

        User user = null;
        for (User u : users) {
            if (u.getUserName().equals(username))
                return u;
        }
        if (user == null)
            throw new UserNotFoundException("User wasn't found by name");

        return user;

    }

    @Override
    public User getUserByEmail(String email) throws UserNotFoundException {

        User user = null;
        for (User u : users) {
            if (u.getEmail().equals(email))
                return u;
        }
        if(user ==null)
        throw new UserNotFoundException("User wasn't found by email");
        return user;
    }
}

// HW
// UserNotFoundException - написать эксепшн
//JDBC - почитать

/*CREATE TABLE users(
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    name VARCHAR(50),
    phone VARCHAR(50));

INSERT INTO users (name, phone)
VALUES ('Elena', '333');
INSERT INTO users (name, phone)
        VALUES ('Olga', '111');

        INSERT INTO users (name, phone)
        VALUES ('Olga', '111');

        INSERT INTO users (name, phone)
        VALUES ('Olga', '111');*/