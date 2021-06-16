package com.tengda.wiki.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
//  read from config file, if no value, take TEST
  @Value("${name: TEST}")
  private String testName;

  @GetMapping ("/hello")
  public String helloWorld() {
    return "Hello world !" + this.testName;
  }

  @PostMapping("/hello/post")
  public String helloPost(String name) {
    return "hello post" + name;
  }
}
