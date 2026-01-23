package com.example.hibernate.hibernate.Mappers;

import com.example.hibernate.hibernate.DTOs.DTOArticle;
import com.example.hibernate.hibernate.Entities.EntArticle;

public class MapArticle {

    public static DTOArticle toDTO(EntArticle paramEntArticle) {
        return new DTOArticle(paramEntArticle.getId(), paramEntArticle.getArticleName(), paramEntArticle.getPrice(), paramEntArticle.getQuantity());

    }

    public static EntArticle toEntity(DTOArticle paramDTOArticle) {
        EntArticle entArticle = new EntArticle();
        entArticle.setId(paramDTOArticle.getId());
        entArticle.setArticleName(paramDTOArticle.getArticleName());
        entArticle.setPrice(paramDTOArticle.getPrice());
        entArticle.setQuantity(paramDTOArticle.getQuantity());
        return entArticle;
    }

}
