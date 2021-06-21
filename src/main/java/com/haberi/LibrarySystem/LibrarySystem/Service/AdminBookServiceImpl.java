package com.haberi.LibrarySystem.LibrarySystem.Service;

import com.haberi.LibrarySystem.LibrarySystem.DTO.BookDto;
import com.haberi.LibrarySystem.LibrarySystem.Repository.BookRepository;
import com.haberi.LibrarySystem.LibrarySystem.entity.Book;
import com.haberi.LibrarySystem.LibrarySystem.mapper.BookMapper;
import org.springframework.stereotype.Service;


@Service
public class AdminBookServiceImpl implements AdminBookService {

    private final BookRepository bookRepository;


    public AdminBookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }


    public Book saveBook(Book book){
        return bookRepository.save(book);
    }

    public Book findBookById(long id){
        return bookRepository.findById(id);
    }


    //This is going to UserBookService class later
    public BookDto oneBookToBookDto(long id){
        Book book = bookRepository.findById(id);
        return BookMapper.INSTANCE.bookToBookDto(book);
    }
}
