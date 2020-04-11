package com.cx.mylogserver.mysqlHelper.service;

import com.cx.mylogserver.mysqlHelper.model.Articles;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface ArticlesService {
    List<Articles> getArticlesList();
}
