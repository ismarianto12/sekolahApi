package com.apiSekoalh.controllers;

import com.apiSekoalh.models.LoginModel;
import com.apiSekoalh.repository.LoginRepository;
import java.util.*;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

// import org.springframework.web.bind.annotation.Request;
@RestController
@ControllerAdvice
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

  @GetMapping("/api/foos")
  @ResponseBody
  public String getFoos(@RequestParam String id) {
    return "ID: " + id;
  }

  @ModelAttribute
  public void addAttributes(Model model) {
    model.addAttribute("msg", "Welcome to the Netherlands!");
  }

  private Map<Long, LoginModel> employeeMap = new HashMap<>();

  @RequestMapping(value = "/addLogin", method = RequestMethod.POST)
  public String submit(
    ModelMap model,
    @ModelAttribute("login") LoginModel loginmodel,
    BindingResult result
  ) {
    if (result.hasErrors()) {
      return "error";
    }
    // loginmodel.setAttribute("username", loginmodel.getUsername());
    // loginmodel.setAttribute("password", loginmodel.getPassword());
    employeeMap.put(loginmodel.getId(), loginmodel);
    loginrepository.save(loginmodel);
    // return "employeeView";
    return "Data berhasil di simpan";
  }
  public List<LoginModel> Update(LoginModel login){
    return loginrepository.Update(loginmodel)
  }

}
