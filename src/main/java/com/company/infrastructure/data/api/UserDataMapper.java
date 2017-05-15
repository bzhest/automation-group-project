package com.company.infrastructure.data.api;

import com.company.infrastructure.data.users.User;

/**
 * Created by Andrey on 30.04.2017.
 */
public interface UserDataMapper {
    User getUserByUserName(String username);

    User getUserByEmail(String email);
}
