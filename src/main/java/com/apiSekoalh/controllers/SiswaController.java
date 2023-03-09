package com.apiSekoalh.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SiswaController {

  @GetMapping("/api/siswa")
  public String DataSiswa() {
    return "Mapping data siswa";
  }

  @PostMapping("/api/siswa")
  public String Insert() {
    return "Get Insert";
  }
}
