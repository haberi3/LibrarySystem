package com.haberi.LibrarySystem.LibrarySystem.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "books")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "book_id")
    private Long bookId;

    @Column(name = "title", nullable = false)
    @NotBlank(message = "The title should be at least 1 character long")
    private String title;

    @Column(name = "publisher", nullable = false)
    @NotBlank(message = "The publisher should be at least 1 character long")
    private String publisher;

    @Column(name = "isbn_number", unique = true)
    private Long isbnNumber;

    //Don't know yet what to validate on
    @Column(name = "year_of_publish")
    private Integer yearOfPublish;

    @Column(name = "language")
    @NotBlank(message = "The language should be at least 1 character long")
    private String language;

    @Column(name = "available_copy")
    private Integer availableCopy;

    @ManyToMany(cascade = {CascadeType.MERGE, CascadeType.DETACH, CascadeType.PERSIST,CascadeType.REFRESH})
    @JoinTable(
            name = "books_writers",
            joinColumns ={@JoinColumn(name = "book_id")},
            inverseJoinColumns = {@JoinColumn(name = "writer_id")}
    )
    @JsonIgnoreProperties("books")
    private List<Writer> writers = new ArrayList<>();

    @ElementCollection
    @CollectionTable(
            name = "book_category",
            joinColumns = @JoinColumn(name = "owner_book_id")
    )
    @Column(name = "category_name")
    private List<String> bookCategories = new ArrayList<>();

    @ManyToMany(mappedBy = "books")
    @JsonIgnore
    private List<Lending> lendingList = new ArrayList<>();
}
