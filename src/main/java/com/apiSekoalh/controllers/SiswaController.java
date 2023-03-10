package com.apiSekoalh.controllers;

import com.apiSekoalh.models.SiswaModel;
import com.apiSekoalh.repository.SiswaRepository;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SiswaController {

  @Autowired
  SiswaRepository siswarepository;

  @GetMapping("/api/siswa")
  public List<SiswaModel> DataSiswa() {
    List<SiswaModel> siswa = siswarepository.findAll();
    Map map = new HashMap<Map, String>();
    // List<SiswaModel> namaSiswa = map.put("dataSiswa", siswa);
    return siswa;
  }

  @PostMapping("/api/siswa")
  public String Insert() {
    return null;
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
