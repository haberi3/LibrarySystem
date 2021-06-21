package com.haberi.LibrarySystem.LibrarySystem.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "lending")
@Data
public class Lending {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "lending_id")
    private Long lendingId;

    @Column(name = "lend_begin")
    private Date lendBegin;

    @Column(name = "lend_end")
    private Date lendEnd;

    @ManyToMany
    @JoinTable(
            name = "books_lendings",
            joinColumns = {@JoinColumn(name = "lending_id")},
            inverseJoinColumns = {@JoinColumn(name = "book_id")}
    )
    private List<Book> books = new ArrayList();

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
