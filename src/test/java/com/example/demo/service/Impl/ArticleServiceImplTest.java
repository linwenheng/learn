package com.example.demo.service.Impl;

import com.example.demo.service.ArticleService;
import org.junit.jupiter.api.Test;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;

public class ArticleServiceImplTest {
    @Resource
    private ArticleService articleService;

    @Test
    public void test(){
        System.out.println(articleService.selectAll());
    }
}