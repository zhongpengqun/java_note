package com.example.login.model;

import lombok.Data;

/**
 * Author: Davion
 * Date: 2019-10-9
 * Description:
 */
@Data
public class User {
    private Long id;
    private String username;
    private String password;
    private String token;
}
