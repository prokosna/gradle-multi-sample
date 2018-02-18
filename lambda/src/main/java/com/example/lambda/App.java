package com.example.lambda;

import com.example.domain.model.SampleId;
import lombok.val;

public class App {
  public static void main(String[] args) {
    val a = new SampleId("hoge");
    System.out.println(a.getId());
  }
}
