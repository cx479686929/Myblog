package com.cx.mylogserver.mysqlHelper.service;

import com.cx.mylogserver.mysqlHelper.model.Photos;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface PhotosService {
    List<Photos> getphotoList();
}
