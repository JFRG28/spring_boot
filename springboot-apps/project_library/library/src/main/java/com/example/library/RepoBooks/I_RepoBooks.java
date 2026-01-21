package com.example.library.RepoBooks;

import java.util.List;
import java.util.Optional;

import com.example.library.Model.Books;

public interface I_RepoBooks {

    List<Books> findAll();
    Optional<Books> findId(long id);
    void save(Books book);
    void deleteById(long id);    
}
