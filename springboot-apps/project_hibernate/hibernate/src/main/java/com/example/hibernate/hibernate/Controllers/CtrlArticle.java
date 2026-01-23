package com.example.hibernate.hibernate.Controllers;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.hibernate.hibernate.DTOs.DTOArticle;
import com.example.hibernate.hibernate.Mappers.MapArticle;
import com.example.hibernate.hibernate.Repository.RepoArticles;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/api/articles")

public class CtrlArticle {

    @Autowired
    private RepoArticles repoArticles;

    @GetMapping
/*
// Returns Entities instead of DTOs. Bad practice because it exposes internal details to the client. Better to use DTOs.
/*
    @GetMapping
    public List<EntArticle> getAllArticles() {
        return (List<EntArticle>) repoArticles.findAll();
    }
*/
// Returns DTOs instead of Entities. Good practice because it hides internal details from the client and only exposes what is necessary.
    public List<DTOArticle> getAllArticles() {
        return repoArticles.findAll().stream().map(MapArticle::toDTO).collect(Collectors.toList());
    }
}
