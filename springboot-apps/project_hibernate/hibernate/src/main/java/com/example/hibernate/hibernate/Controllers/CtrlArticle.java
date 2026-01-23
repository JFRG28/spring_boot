package com.example.hibernate.hibernate.Controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.hibernate.hibernate.Entities.EntArticle;
import com.example.hibernate.hibernate.Repository.RepoArticles;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/api/articles")

public class CtrlArticle {

    @Autowired
    private RepoArticles repoArticles;

    @GetMapping
    public List<EntArticle> getAllArticles() {
        return (List<EntArticle>) repoArticles.findAll();
    }
}
