package com.example.hibernate.hibernate.Services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.hibernate.hibernate.DTOs.DTOArticle;
import com.example.hibernate.hibernate.Entities.EntArticle;
import com.example.hibernate.hibernate.Mappers.MapArticle;
import com.example.hibernate.hibernate.Repository.RepoArticles;

@Service

public class SrvArticle {

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

    public DTOArticle srv_updateArticle(Long paramId, DTOArticle paramDtoArticle) {
        Optional<EntArticle> existsOptionalArticle = repoArticles.findById(paramId);

        if (existsOptionalArticle.isPresent()){
            EntArticle entArticle = existsOptionalArticle.get();

            entArticle.setArticleName(paramDtoArticle.getArticleName());
            entArticle.setPrice(paramDtoArticle.getPrice());
            entArticle.setQuantity(paramDtoArticle.getQuantity());
            
            EntArticle updateArticle = repoArticles.save(entArticle);
            
            return MapArticle.toDTO(updateArticle);
        } else {
            throw new RuntimeException("Article not found. ID: "+paramId);
        }
    }

    public String srv_deleteArticle(Long paramId) {
        if (repoArticles.existsById(paramId)) {
            repoArticles.deleteById(paramId);
            
            return "Article deleted successfully";
        } else {
            throw new RuntimeException("Article not found. ID: "+paramId);
        }
    }
}