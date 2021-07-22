package com.haberi.LibrarySystem.LibrarySystem.Service;

import com.haberi.LibrarySystem.LibrarySystem.DTO.UserDto;
import com.haberi.LibrarySystem.LibrarySystem.entity.User;

public interface UserService {

    User saveUser(User user);

    User registerNewUser(UserDto userDto);
}
