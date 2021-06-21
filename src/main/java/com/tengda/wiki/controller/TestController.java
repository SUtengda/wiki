package com.tengda.wiki.controller;

import com.tengda.wiki.domain.Test;
import com.tengda.wiki.service.TestService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class TestController {
  @Resource
  private TestService testService;
  // read from config file, if no value, take TEST
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

  @GetMapping ("/test/list")
  public List<Test> list() {
    return testService.list();
  }

}
