package com.example.hibernate.hibernate.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "articles")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class EntArticle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "article_name")
    private String articleName;
    @Column(name = "price")
    private Double price;
    @Column(name = "quantity")
    private Integer quantity;

/*
    To display the object in a readable format in the console or in any other output medium, you can override
    @Override
    public String toString() {
        return "EntArticle{" +
                "id=" + id + 
                ", articleName='" + articleName + '\'' +
                ", price=" + price + 
                ", quantity=" + quantity + 
                '}';
    };
 */

}
