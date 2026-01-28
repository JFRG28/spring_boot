package com.example.hibernate.hibernate.Repository;

import java.util.Optional;
import com.example.hibernate.hibernate.Entities.EntUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepoUsers extends JpaRepository<EntUser, Long> {

    Optional<EntUser> findByUsername(String paramUsername);    

}
