package com.apiSekoalh.controllers;

import com.apiSekoalh.dto.ResponseData;
import com.apiSekoalh.models.GuruModel;
import com.apiSekoalh.repository.GuruRepository;
import java.util.*;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GuruController {

  @Autowired
  GuruRepository gururepository;

  @GetMapping("/guru/list")
  public Map<Map, String> Siswa() {
    Map map = new HashMap<String, String>();
    map.put("listdata", "listdata");
    map.put("get", "listdata");
    return map;
  }

  @GetMapping("/data/guru")
  public List<GuruModel> ListGuru() {
    List<GuruModel> guru = gururepository.findAll();
    return guru;
  }

  @PostMapping("/data/save")
  public ResponseEntity<ResponseData<GuruModel>> Insert(
    @Valid @RequestBody GuruModel gurureq,
    Errors errors
  ) {
    ResponseData<GuruModel> responseData = new ResponseData<>();
    if (errors.hasErrors()) {
      for (ObjectError error : errors.getAllErrors()) {
        responseData.getMessages().add(error.getDefaultMessage());
      }
      responseData.setStatus(false);
      responseData.setPayload(null);

      return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(responseData);
    }
    responseData.setStatus(true);
    responseData.setPayload(gururepository.save(gurureq));
    String[] array = { "insert", gurureq.toString() };
    return ResponseEntity.ok(responseData);
  }

  @PutMapping("/update/guru")
  public String UpdateGuru() {
    return null;
  }
}
