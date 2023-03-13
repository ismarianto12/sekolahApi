package com.apiSekoalh.controllers;

import com.apiSekoalh.models.GuruModel;
import com.apiSekoalh.repository.GuruRepository;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
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

  @PutMapping("/update/guru")
  public String UpdateGuru() {
    return null;
  }
}
