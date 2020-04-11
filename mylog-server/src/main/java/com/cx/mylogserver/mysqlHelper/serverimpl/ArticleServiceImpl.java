package com.cx.mylogserver.mysqlHelper.serverimpl;

import com.cx.mylogserver.mysqlHelper.Mapper.ArticleMapper;
import com.cx.mylogserver.mysqlHelper.model.Articles;
import com.cx.mylogserver.mysqlHelper.service.ArticlesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class ArticleServiceImpl implements ArticlesService {
    @Autowired
    private ArticleMapper atricleMapper;
    @Override
    public List<Articles> getArticlesList() {
        List<Articles> articles= null;
        try {
            articles = atricleMapper.getArticlesList();
            return articles;
        } catch (Exception e) {
            throw  e;
        }
    }
}
