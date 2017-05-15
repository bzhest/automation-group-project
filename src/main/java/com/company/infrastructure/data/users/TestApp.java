package com.company.infrastructure.data.users;

import com.company.infrastructure.data.api.UserDataMapper;

/**
 * Created by Andrey on 02.05.2017.
 */
public class TestApp {
    public static void main(String[] args) {
        UserDataMapper udm = new FileUserDataMapper();
        User user = udm.getUserByUserName("user4");
        login(user);


        DataBaseDataMapper udm1 = new DataBaseDataMapper();
        User user2 = udm1.getUserByUserName("vasia");
        login(user2);
        //udm1.insert();





        /*User user3 = db.getUserByEmail("Andrey");
        login(user3);*/

    }

    public static void login(User user) {
        System.out.println("Logging user: " + user.getUserName());
        System.out.println("Enter email: " + user.getEmail());
        System.out.println("Logging password: " + user.getPassword());
    }
}
