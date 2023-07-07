package com.example.demo.service.Impl;

import com.example.demo.pojo.articleDO.ArticleDO;
import com.example.demo.repository.ArticleDAO;
import com.example.demo.service.ArticleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ArticleServiceImpl implements ArticleService {

    @Resource
    private ArticleDAO articleDAO;

    @Override
    public List<ArticleDO> selectAll() {
        return articleDAO.selectAll();
    }
}
