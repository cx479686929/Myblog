package com.cx.mylogserver.mysqlHelper.serverimpl;

import com.cx.mylogserver.mysqlHelper.Mapper.IdeaMapper;
import com.cx.mylogserver.mysqlHelper.model.Ideas;
import com.cx.mylogserver.mysqlHelper.service.IdeasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class IdeasServiceImpl implements IdeasService {
    @Autowired
    private IdeaMapper ideaMapper;
    @Override
    public List<Ideas> getIdeasList() {
        List<Ideas> ideas= null;
        try {
            ideas = ideaMapper.getIdeasList();
            return ideas;
        } catch (Exception e) {
           throw  e;
        }

    }
}
