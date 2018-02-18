package com.example.consumer.rest;

import com.example.domain.model.SampleId;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Resource {

  @GetMapping("/")
  public SampleId post(@RequestParam String hoge) {
    return new SampleId(hoge);
  }
}
