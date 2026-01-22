package com.example.hibernate.hibernate;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.hibernate.hibernate.Entities.EntArticle;
import com.example.hibernate.hibernate.Repository.RepoArticles;

@SpringBootApplication
public class HibernateApplication implements CommandLineRunner  {

	@Autowired
	private RepoArticles repoArticles;

	public static void main(String[] args) {
		SpringApplication.run(HibernateApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Hibernate Application is running");
		List <EntArticle> articles = repoArticles.findAll();
		articles.stream().forEach(System.out::println);
	}
}
