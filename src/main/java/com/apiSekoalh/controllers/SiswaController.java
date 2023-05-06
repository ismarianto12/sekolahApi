package com.apiSekoalh.controllers;

import com.apiSekoalh.dto.ResponseData;
import com.apiSekoalh.models.SiswaModel;
import com.apiSekoalh.repository.SiswaRepository;
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
public class SiswaController {

  @Autowired
  SiswaRepository siswarepository;

  @GetMapping("/api/siswa")
  public List<SiswaModel> DataSiswa() {
    List<SiswaModel> siswa = siswarepository.findAll();
    Map map = new HashMap<Map, String>();
    return siswa;
  }

  @PostMapping("/api/siswa")
  public ResponseEntity<ResponseData<SiswaModel>> Insert(
    @Valid @RequestBody SiswaModel siswareq,
    Errors errors
  ) {
    ResponseData<SiswaModel> responseData = new ResponseData<>();
    if (errors.hasErrors()) {
      for (ObjectError error : errors.getAllErrors()) {
        responseData.getMessages().add(error.getDefaultMessage());
      }
      responseData.setStatus(false);
      responseData.setPayload(null);

      return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(responseData);
    }
    responseData.setStatus(true);
    // responseData.setHttpstatus(true);
    responseData.setPayload(siswarepository.save(siswareq));

    String[] array = { "status", siswareq.toString() };
    return ResponseEntity.ok(responseData);
  }

  @PutMapping("/api/siswa")
  public String SiswaUpdate() {
    return null;
  }

  @PostMapping("/api/siswa/destroy")
  public String SiswaDestroy() {
    return "Destroy Siswa";
  }
}
