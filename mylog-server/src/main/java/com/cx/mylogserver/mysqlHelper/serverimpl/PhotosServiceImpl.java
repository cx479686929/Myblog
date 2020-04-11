package com.cx.mylogserver.mysqlHelper.serverimpl;

import com.cx.mylogserver.mysqlHelper.Mapper.PhotosMapper;
import com.cx.mylogserver.mysqlHelper.model.Photos;
import com.cx.mylogserver.mysqlHelper.service.PhotosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class PhotosServiceImpl implements PhotosService {
    @Autowired
    private PhotosMapper photosMapper;
    @Override
    public List<Photos> getphotoList() {
        List<Photos> photos= null;
        try {
            photos = photosMapper.getphotoList();
            return photos;
        } catch (Exception e) {
           throw  e;
        }


    }
}
