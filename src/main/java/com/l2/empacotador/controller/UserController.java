package com.l2.empacotador.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.l2.empacotador.model.UserModel;

import org.springframework.web.bind.annotation.RequestBody;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@RequestMapping("/users")
public class UserController {

    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @PostMapping("/")
     public void create(@RequestBody UserModel userModel){
        System.out.println("Nome: " + userModel.getName());
        System.out.println("Username: " + userModel.getUsername());
        System.out.println("Senha: " + userModel.getPassword());
    }
    
}
