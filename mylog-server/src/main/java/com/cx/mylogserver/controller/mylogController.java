package com.cx.mylogserver.controller;

import com.cx.mylogserver.mysqlHelper.serverimpl.ArticleServiceImpl;
import com.cx.mylogserver.mysqlHelper.serverimpl.IdeasServiceImpl;
import com.cx.mylogserver.mysqlHelper.serverimpl.PhotosServiceImpl;
import com.cx.mylogserver.mysqlHelper.service.IdeasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@CrossOrigin(origins = "*")
public class mylogController {
    @Autowired
    private ArticleServiceImpl articleService;
    @Autowired
    private IdeasServiceImpl ideasService;
    @Autowired
    private PhotosServiceImpl photosService;

    @RequestMapping("/getAllPhotos")
    public Map<String,Object> getAllphotos(){
        Map<String, Object> map = new HashMap<>();
        map.put("code","200");
        map.put("photos",photosService.getphotoList());
        return map;
    }
    @RequestMapping("/getAllIdeas")
    public String getAllIdeas(){
        return ideasService.getIdeasList().toString();
    }
    @RequestMapping("/getAllArticles")
    public String getAllArticles(){
        return articleService.getArticlesList().toString();
    }
}
