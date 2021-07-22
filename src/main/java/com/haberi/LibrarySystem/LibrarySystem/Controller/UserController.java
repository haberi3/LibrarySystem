package com.haberi.LibrarySystem.LibrarySystem.Controller;

import com.haberi.LibrarySystem.LibrarySystem.Service.UserServiceImpl;
import com.haberi.LibrarySystem.LibrarySystem.entity.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/user/")
public class UserController {

    UserServiceImpl userService;

    public UserController(UserServiceImpl userService) {
        this.userService = userService;
    }

//    @PostMapping("save")
//    public String saveUser(@Valid @RequestBody User user){
//        userService.saveUser(user);
//        return "Successful registration";
//    }
}
