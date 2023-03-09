package com.apiSekoalh.controllers;

import java.util.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GuruController {

  @GetMapping("/guru/list")
  public Map<Map, String> Siswa() {
    Map map = new HashMap<String, String>();
    map.put("listdata", "listdata");
    map.put("get", "listdata");
    return map;
  }
}
