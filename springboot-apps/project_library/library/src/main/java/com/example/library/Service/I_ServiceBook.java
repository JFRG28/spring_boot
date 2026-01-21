package com.example.library.Service;

import java.util.List;
import java.util.Optional;
import com.example.library.Model.Books;

public interface I_ServiceBook {

    List<Books> getAllBookTitles();
    Optional<Books> getBookTitleById(long id);
    Books addBook(Books book);
    void removeBookById(long id);
    String findBookByTitle(String title);

}
