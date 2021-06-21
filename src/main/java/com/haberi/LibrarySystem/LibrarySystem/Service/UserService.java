package com.haberi.LibrarySystem.LibrarySystem.Service;

import com.haberi.LibrarySystem.LibrarySystem.entity.User;

import java.util.List;

public interface UserService {

    User saveUser(User user);

    String deleteUser(long id);

    User findById(long id);

    List<User> findAllUser();
}
