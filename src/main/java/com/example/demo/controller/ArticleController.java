package com.example.demo.controller;

import com.example.demo.pojo.articleDO.ArticleDO;
import com.example.demo.service.ArticleService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@Slf4j
@RequestMapping("/article")
@RestController
public class ArticleController {

    @Resource
    private ArticleService articleService;

    @RequestMapping(value = "/all",method = RequestMethod.GET)
    public List<ArticleDO> getAll(){
        return articleService.selectAll();
    }
}
