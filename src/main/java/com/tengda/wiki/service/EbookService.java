package com.tengda.wiki.service;

import com.tengda.wiki.domain.Ebook;
import com.tengda.wiki.domain.EbookExample;
import com.tengda.wiki.mapper.EbookMapper;
import com.tengda.wiki.req.EbookReq;
import com.tengda.wiki.resp.EbookResp;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class EbookService {
  @Resource
  private EbookMapper ebookMapper;

  public List<EbookResp> list(EbookReq req) {
    EbookExample ebookExample = new EbookExample();
    EbookExample.Criteria criteria = ebookExample.createCriteria();
    criteria.andNameLike("%" + req.getName() + "%");
    List<Ebook> ebookList = ebookMapper.selectByExample(ebookExample);
    List<EbookResp> resqList = new ArrayList<>();
    for (Ebook ebook: ebookList) {
      EbookResp ebookResq = new EbookResp();
      BeanUtils.copyProperties(ebook,ebookResq);
      resqList.add(ebookResq);
    }
    return resqList;
  }
}
