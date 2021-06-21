package com.haberi.LibrarySystem.LibrarySystem.Service;

import com.haberi.LibrarySystem.LibrarySystem.DTO.BookDto;
import com.haberi.LibrarySystem.LibrarySystem.entity.Book;

public interface AdminBookService {
    Book saveBook(Book book);

    Book findBookById(long id);

    BookDto oneBookToBookDto(long id);
}
