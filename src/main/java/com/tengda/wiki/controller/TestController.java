package com.tengda.wiki.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

  @GetMapping ("/hello")
  public String helloWorld() {
    return "Hello world !";
  }

  @PostMapping("/hello/post")
  public String helloPost(String name) {
    return "hello post" + name;
  }
}