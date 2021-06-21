package com.haberi.LibrarySystem.LibrarySystem.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookDto {

    private String title;

    private List<WriterDto> writers = new ArrayList<>();

    private String publisher;

    private Integer yearOfPublish;

    private String language;

    private Long isbnNumber;

}
