package com.cx.mylogserver.mysqlHelper.Mapper;

import com.cx.mylogserver.mysqlHelper.model.Articles;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface ArticleMapper {

    @Select("select * from articles")
    List<Articles>getArticlesList();
}
