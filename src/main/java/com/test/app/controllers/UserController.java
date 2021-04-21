package com.test.app.controllers;

import com.test.app.models.UserTable;
import com.test.app.models.form.UserForm;
import com.test.app.repositories.UserTableRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserTableRepository userTableRepository;

    UserController(UserTableRepository userTableRepository){
        this.userTableRepository = userTableRepository;
    }

    @PostMapping("")
    public UserTable register(@RequestBody UserForm userForm){
        UserTable userTable = new UserTable();

        if(userForm.getPassword().equals(userForm.getConfirmPassword())){
            userTable.setUserName(userForm.getUserName());
            userTable.setEmail(userForm.getEmail());
            userTable.setPassword(userForm.getPassword());

            return userTableRepository.save(userTable);
        }else {
            throw new RuntimeException("Password does not match");
        }
    }

    @GetMapping("")
    public List<UserTable> get(){
        return userTableRepository.findAll();
    }
}
