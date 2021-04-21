package com.test.app.models.form;

import lombok.Data;

@Data
public class UserForm {
    private String userName;
    private String email;
    private String password;
    private String confirmPassword;
}
