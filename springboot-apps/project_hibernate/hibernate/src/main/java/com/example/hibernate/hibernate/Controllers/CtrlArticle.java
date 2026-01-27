package com.example.hibernate.hibernate.Controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.hibernate.hibernate.DTOs.DTOArticle;
import com.example.hibernate.hibernate.Services.SrvArticle;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
@RequestMapping("/api/articles")

public class CtrlArticle {

    @Autowired
    private SrvArticle servArticle;

    @GetMapping("/all")
    public List<DTOArticle> getAllArticles() {
        return servArticle.srv_getAllArticles();
    }

    @PostMapping("/insertArticle")
    public DTOArticle insertArticle(@RequestBody DTOArticle paramDTO) {
        return servArticle.srv_insertArticle(paramDTO);
    }

    @PutMapping("updateArticle/{paramId}")
    public DTOArticle updateArticle(@PathVariable Long paramId, @RequestBody DTOArticle paramDTO) {
        return servArticle.srv_updateArticle(paramId, paramDTO);
    }

    @DeleteMapping("deleteArticle/{paramId}")
    public String deleteArticle(@PathVariable Long paramId) {
        return  servArticle.srv_deleteArticle(paramId);
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
