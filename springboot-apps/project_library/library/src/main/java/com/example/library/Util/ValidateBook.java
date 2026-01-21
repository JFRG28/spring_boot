package com.example.library.Util;

import org.springframework.stereotype.Component;
import com.example.library.Model.Books;

@Component

public class ValidateBook {

    public Books book;
    
    public boolean isValidTitle() {
        return book.getTitle() != null && !book.getTitle().isEmpty();
    }

}
