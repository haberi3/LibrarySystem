package com.haberi.LibrarySystem.LibrarySystem.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "writers")
@Data
@ToString(exclude = "books")
@NoArgsConstructor
@AllArgsConstructor
public class Writer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "writer_id")
    private Long writerId;

    @Column(name = "first_name")
    @NotBlank(message = "The author's first name should be at least 1 character long")
    private String firstName;

    @Column(name = "last_name")
    @NotBlank(message = "The author's last name should be at least 1 character long")
    private String lastName;

    @ManyToMany(mappedBy = "writers")
    @JsonIgnoreProperties("writers")
    private List<Book> books = new ArrayList<>();
}
