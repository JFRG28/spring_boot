package com.example.hibernate.hibernate.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "articles")

public class EntArticle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String articleName;
    private Double price;
    private Integer quantity;

    @Override
    public String toString() {
        return "EntArticle{" +
                "id=" + id + 
                ", articleName='" + articleName + '\'' +
                ", price=" + price + 
                ", quantity=" + quantity + 
                '}';
    };
}
