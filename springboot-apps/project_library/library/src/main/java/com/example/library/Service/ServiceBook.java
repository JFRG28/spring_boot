package com.example.library.Service;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import com.example.library.Model.Books;
import com.example.library.RepoBooks.I_RepoBooks;

@Service
public class ServiceBook implements I_ServiceBook {

    private final I_RepoBooks i_RepoBooks;

    public ServiceBook(I_RepoBooks i_RepoBooks) {
        this.i_RepoBooks = i_RepoBooks;
    }

    @Override
    public List<Books> getAllBookTitles() {
        return i_RepoBooks.findAll();
    }

    @Override
    public Optional<Books> getBookTitleById(long id) {
        return i_RepoBooks.findId(id);
    }

    @Override
    public Books addBook(Books book) {
        i_RepoBooks.save(book);
        return book;
    }

    @Override
    public void removeBookById(long id) {
        i_RepoBooks.deleteById(id);
    }

    @Override
    public String findBookByTitle(String title) {
        boolean found = i_RepoBooks.findAll().stream()
                .anyMatch(book -> book.getTitle()!=null && book.getTitle().equalsIgnoreCase(title));
        return found ? "Book found" : "Book not found";
    }
/* 
    public String findBook(String title) {
        if ("El Quijote".equalsIgnoreCase(title)) {
            return "Book found";
        }   else {
                return "Book not found";
        }
    }
*/
}
