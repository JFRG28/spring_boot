package com.example.library.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.library.Model.Books;
import com.example.library.RepoBooks.RepoBooks;
import com.example.library.Service.I_ServiceBook;
import com.example.library.Service.ServiceBook;

import java.lang.foreign.Linker.Option;
import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


 

@RestController
@RequestMapping("/api/library")

public class ControllerLibrary {
/*
    private final ServiceBook serviceBook;
    private final RepoBooks repoBooks;

    public ControllerLibrary(ServiceBook serviceBook, RepoBooks repoBooks) {
        this.serviceBook = serviceBook;
        this.repoBooks = repoBooks;
    }

    @GetMapping("/{title}")
    public String getBook(@PathVariable String title) {
        return serviceBook.findBookByTitle(title);
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
*/
    @GetMapping("/clone")
    public String testClone() {
        Books originalBook = new Books(4L, "1984", "George Orwell", java.time.LocalDate.of(1949, 6, 8));
        Books clonedBook = originalBook.clone();
        return "Original Book: " + originalBook.toString() + ", Cloned Book: " + clonedBook.toString();
    }

    private final I_ServiceBook i_ServiceBook;

    public ControllerLibrary(I_ServiceBook i_ServiceBook) {
        this.i_ServiceBook = i_ServiceBook;
    }

    @GetMapping("/list")
    public List<Books> list() {
        return i_ServiceBook.getAllBookTitles();
    }
    

    @GetMapping("/{id}")
    public ResponseEntity<Books> getBookTitleById(@PathVariable long id) {
        Optional<Books> book = i_ServiceBook.getBookTitleById(id);
        return book.map(ResponseEntity::ok)
                   .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping("path")
    public ResponseEntity<Books> create(@RequestBody Books book) {
        i_ServiceBook.addBook(book);
        return ResponseEntity.ok(book);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable long id) {
        i_ServiceBook.removeBookById(id);
        return ResponseEntity.noContent().build();
    }
    
    
}
