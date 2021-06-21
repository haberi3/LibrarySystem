package com.haberi.LibrarySystem.LibrarySystem.Repository;

import com.haberi.LibrarySystem.LibrarySystem.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User save(User user);

    String deleteById(long id);

    User findById(long id);

    List<User> findAll();
}
