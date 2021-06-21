package com.haberi.LibrarySystem.LibrarySystem.Service;

import com.haberi.LibrarySystem.LibrarySystem.entity.Writer;

public interface WriterService {
    Writer save(Writer writer);

    Writer findById(long id);
}
