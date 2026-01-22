package com.example.hibernate.hibernate.Repository;

import com.example.hibernate.hibernate.Entities.EntArticle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepoArticles extends JpaRepository<EntArticle, Long> {

    

}
