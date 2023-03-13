package com.apiSekoalh.controllers;

import com.apiSekoalh.models.LoginModel;
import com.apiSekoalh.repository.LoginRepository;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

  @Autowired
  LoginRepository loginrepository;

  @GetMapping("/login/data")
  public List<LoginModel> DataLogin() {
    List<LoginModel> login = loginrepository.findAll();
    return login;
  }

  @PostMapping("/login/insert")
  public List<LoginModel> Insert() {
    List<LoginModel> login = loginrepository.findAll();
    return login;
  }
}
