package com.example.hibernate.hibernate.Controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.hibernate.hibernate.DTOs.DTOArticle;
import com.example.hibernate.hibernate.Services.ServArticle;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/api/articles")

public class CtrlArticle {

    @Autowired
    private ServArticle servArticle;

    @GetMapping("/all")
    public List<DTOArticle> getAllArticles() {
        return servArticle.getAllArticles();
    }
    
/*
Commented to use ServArticle.java to comply with best practices.
    private RepoArticles repoArticles;
*/
//    @GetMapping
/*
// Returns Entities instead of DTOs. Bad practice because it exposes internal details to the client. Better to use DTOs.
/*
    @GetMapping
    public List<EntArticle> getAllArticles() {
        return (List<EntArticle>) repoArticles.findAll();
    }
*/
/*
// Returns DTOs instead of Entities. Good practice because it hides internal details from the client and only exposes what is necessary.
// Moved method to ServArticle.java to comply with best practices.
    public List<DTOArticle> getAllArticles() {
        return repoArticles.findAll().stream().map(MapArticle::toDTO).collect(Collectors.toList());
    }
*/
}
