package com.example.hibernate.hibernate.Services;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.hibernate.hibernate.DTOs.DTOArticle;
import com.example.hibernate.hibernate.Entities.EntArticle;
import com.example.hibernate.hibernate.Mappers.MapArticle;
import com.example.hibernate.hibernate.Repository.RepoArticles;

@Service

public class ServArticle {

    @Autowired
    private RepoArticles repoArticles;
    
    public List<DTOArticle> srv_getAllArticles() {
        return repoArticles.findAll().stream().map(MapArticle::toDTO).collect(Collectors.toList());
    }

    public DTOArticle srv_insertArticle(DTOArticle paramDtoArticle) {
        EntArticle entArticle = MapArticle.toEntity(paramDtoArticle);
        EntArticle saveArticle = repoArticles.save(entArticle);
        return MapArticle.toDTO(saveArticle);
    }

}
