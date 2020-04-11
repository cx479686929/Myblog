package com.cx.mylogserver.mysqlHelper.Mapper;

import com.cx.mylogserver.mysqlHelper.model.Ideas;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface IdeaMapper {
    @Select("select *from ideas")
    List<Ideas> getIdeasList();
}
