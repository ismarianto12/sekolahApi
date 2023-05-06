package com.apiSekoalh.controllers;

import com.apiSekoalh.repository.KelasRepository;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KelasController {

  private String kelas;

  @Autowired
  @GetMapping("/list")
  public Map<Map, String> Siswa() {
    Map map = new HashMap<Map, String>();
    map.put("apiVersion", "v1");
    map.put("get", "listdata");
    return map;
  }

  @GetMapping("/store")
  public String StoreSiswa() {
    return null;
  }

  @PostMapping(value = "/kelas/insert")
  public KelasRepository InsertKelas(@RequestBody KelasRepository kelas) {
    // kelas = kelas.insert(kelas);
    return kelas;
  }
}
