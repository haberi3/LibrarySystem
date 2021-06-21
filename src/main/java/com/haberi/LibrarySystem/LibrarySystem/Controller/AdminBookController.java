package com.haberi.LibrarySystem.LibrarySystem.Controller;

import com.haberi.LibrarySystem.LibrarySystem.DTO.BookDto;
import com.haberi.LibrarySystem.LibrarySystem.Service.AdminBookServiceImpl;
import com.haberi.LibrarySystem.LibrarySystem.Service.WriterServiceImpl;
import com.haberi.LibrarySystem.LibrarySystem.entity.Book;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/admin/book/")
public class AdminBookController {

    private final AdminBookServiceImpl bookService;
    private final WriterServiceImpl writerService;

    public AdminBookController(AdminBookServiceImpl bookService, WriterServiceImpl writerService) {
        this.bookService = bookService;
        this.writerService = writerService;
    }

    @PostMapping("save")
    public ResponseEntity<Book> saveBook(@Valid @RequestBody Book book){
        Book savedBook = bookService.saveBook(book);
        return new ResponseEntity<Book>(savedBook, HttpStatus.CREATED);
    }

    @GetMapping("get")
    public Book getBook(long id){
        return bookService.findBookById(id);
    }

    //This is going to UserBookController class because they will communicate through DTOs
//    @GetMapping("/getDto")
//    public BookDto getBookDto(long id){
//        return bookService.oneBookToBookDto(id);
//    }

}
