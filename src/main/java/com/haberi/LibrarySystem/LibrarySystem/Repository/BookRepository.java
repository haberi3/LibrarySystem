package com.haberi.LibrarySystem.LibrarySystem.Repository;

import com.haberi.LibrarySystem.LibrarySystem.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book,Long> {

    Book findById(long id);
}
