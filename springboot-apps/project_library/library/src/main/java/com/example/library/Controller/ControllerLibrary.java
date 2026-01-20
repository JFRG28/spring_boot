package com.example.library.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.library.Model.Books;
import com.example.library.RepoBooks.RepoBooks;
import com.example.library.Service.ServiceBook;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
 

@RestController
@RequestMapping("/api/library")

public class ControllerLibrary {
    private final ServiceBook serviceBook;
    private final RepoBooks repoBooks;

    public ControllerLibrary(ServiceBook serviceBook, RepoBooks repoBooks) {
        this.serviceBook = serviceBook;
        this.repoBooks = repoBooks;
    }

    @GetMapping("/{title}")
    public String getBook(@PathVariable String title) {
        return serviceBook.findBook(title);
    }

    @GetMapping("/allBooks")
    public List<Books> getAll() {
        return repoBooks.findAll();
    }

    @GetMapping("/bookById/{id}")
    public ResponseEntity<Books> getId(@PathVariable long id) {
        return repoBooks.findId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
    
    
    
}
