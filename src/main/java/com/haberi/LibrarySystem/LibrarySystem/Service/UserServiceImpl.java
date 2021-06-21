package com.haberi.LibrarySystem.LibrarySystem.Service;

import com.haberi.LibrarySystem.LibrarySystem.Repository.UserRepository;
import com.haberi.LibrarySystem.LibrarySystem.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User saveUser(User user) {

        return userRepository.save(user);
    }

    @Override
    public String deleteUser(long id) {
        return null;
    }

    @Override
    public User findById(long id) {
        return null;
    }

    @Override
    public List<User> findAllUser() {
        return null;
    }
}
