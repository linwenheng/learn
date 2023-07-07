package com.example.demo.service;

import com.example.demo.pojo.articleDO.ArticleDO;

import java.util.List;

public interface ArticleService {
    List<ArticleDO> selectAll();
}
