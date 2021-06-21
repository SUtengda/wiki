package com.tengda.wiki.service;

import com.tengda.wiki.domain.Test;
import com.tengda.wiki.mapper.TestMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TestService {
  @Resource
  private TestMapper testMapper;

  public List<Test> list() {
    return testMapper.list();
  }
}
