package com.haberi.LibrarySystem.LibrarySystem.Repository;

import com.haberi.LibrarySystem.LibrarySystem.entity.Writer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WriterRepository extends JpaRepository<Writer, Long> {
    Writer save(Writer writer);

    Writer findById(long id);
}
