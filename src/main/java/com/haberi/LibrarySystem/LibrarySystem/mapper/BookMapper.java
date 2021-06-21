package com.haberi.LibrarySystem.LibrarySystem.mapper;

import com.haberi.LibrarySystem.LibrarySystem.DTO.BookDto;
import com.haberi.LibrarySystem.LibrarySystem.DTO.WriterDto;
import com.haberi.LibrarySystem.LibrarySystem.entity.Book;
import com.haberi.LibrarySystem.LibrarySystem.entity.Writer;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface BookMapper {
    BookMapper INSTANCE = Mappers.getMapper(BookMapper.class);

    Book bookDtoToBook(BookDto bookDto);

    BookDto bookToBookDto(Book book);

    Writer writerDtoToWriter(WriterDto writerDto);

    WriterDto writersToWriterDto(Writer writer);


}
