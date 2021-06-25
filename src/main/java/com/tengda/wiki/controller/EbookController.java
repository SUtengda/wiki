package com.tengda.wiki.controller;

import com.tengda.wiki.req.EbookReq;
import com.tengda.wiki.resp.CommonResp;
import com.tengda.wiki.resp.EbookResp;
import com.tengda.wiki.service.EbookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/ebook")
public class EbookController {
  @Resource
  private EbookService ebookService;

//  @GetMapping ("/list")
//  public List<Ebook> list() {
//    return ebookService.list();
//  }
  @GetMapping ("/list")
  public CommonResp list(EbookReq req) {
    CommonResp<List<EbookResp>>  resp = new CommonResp<>();
    List<EbookResp> list = ebookService.list(req);
    resp.setContent(list);
    return resp;
  }


}
