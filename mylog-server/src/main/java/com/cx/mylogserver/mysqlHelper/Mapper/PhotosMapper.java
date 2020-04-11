package com.cx.mylogserver.mysqlHelper.Mapper;

import com.cx.mylogserver.mysqlHelper.model.Photos;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface PhotosMapper {
    @Select("select * from photos")
    List<Photos> getphotoList();
}
