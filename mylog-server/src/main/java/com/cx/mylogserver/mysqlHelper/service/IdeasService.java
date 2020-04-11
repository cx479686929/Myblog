package com.cx.mylogserver.mysqlHelper.service;

import com.cx.mylogserver.mysqlHelper.model.Ideas;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface IdeasService {
    List<Ideas> getIdeasList();
}
