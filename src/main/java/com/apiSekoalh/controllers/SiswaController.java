package com.apiSekoalh.controllers;

import com.apiSekoalh.models.SiswaModel;
import com.apiSekoalh.repository.SiswaRepository;
import java.util.*;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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
  public ResponseEntity<?> Insert(@Valid @RequestBody SiswaModel siswareq) {
    siswarepository.save(siswareq);
    String[] array = { "status", siswareq.toString() };
    return ResponseEntity.ok(array);
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
