package com.apiSekoalh.controllers;

import java.util.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KelasController {

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
}
