package com.example.library.RepoBooks;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Repository;
import com.example.library.Model.Books;

@Repository

public class RepoBooks {

    private final List<Books> books = new ArrayList<>();

    public RepoBooks() {
        books.add(new Books(1L, "El Quijote", "Miguel de Cervantes", LocalDate.of(1605, 1, 16)));
        books.add(new Books(2L, "Cien Años de Soledad", "Gabriel García Márquez", LocalDate.of(1967, 5, 30)));
        books.add(new Books(3L, "La Sombra del Viento", "Carlos Ruiz Zafón", LocalDate.of(2001, 4, 12)));
    }

    public List<Books> findAll() {
        return books;
    }

    public Optional<Books> findId(long idBook) {
        return books.stream()
                .filter(books1 -> books1.getId() == idBook)
                .findFirst();
    }
}
