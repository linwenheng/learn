package com.example.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import javax.annotation.Resource;



@Slf4j
public class ArticleControllerTest {

    @Resource
    private ArticleController articleController;

    @Test
    public void test() {
        log.info(articleController.getAll().toString());
    }
}