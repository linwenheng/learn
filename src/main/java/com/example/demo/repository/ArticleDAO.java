package com.example.demo.repository;

import com.example.demo.pojo.articleDO.ArticleDO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArticleDAO extends JpaRepository<ArticleDO,Long> {
    List<ArticleDO> selectAll();
}
