package com.haberi.LibrarySystem.LibrarySystem.Service;

import com.haberi.LibrarySystem.LibrarySystem.Repository.WriterRepository;
import com.haberi.LibrarySystem.LibrarySystem.entity.Writer;
import org.springframework.stereotype.Service;

@Service
public class WriterServiceImpl implements WriterService{

    private final WriterRepository writerRepository;

    public WriterServiceImpl(WriterRepository writerRepository){
        this.writerRepository = writerRepository;
    }

    @Override
    public Writer save(Writer writer) {
        return writerRepository.save(writer);
    }

    @Override
    public Writer findById(long id) {
        return writerRepository.findById(id);
    }
}
