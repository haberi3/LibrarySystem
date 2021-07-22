package com.haberi.LibrarySystem.LibrarySystem.Service;

import com.haberi.LibrarySystem.LibrarySystem.DTO.UserDto;
import com.haberi.LibrarySystem.LibrarySystem.Repository.RoleRepository;
import com.haberi.LibrarySystem.LibrarySystem.Repository.UserRepository;
import com.haberi.LibrarySystem.LibrarySystem.entity.User;
import com.haberi.LibrarySystem.LibrarySystem.mapper.UserMapper;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final RoleRepository roleRepository;
    private final PasswordEncoder passwordEncoder;

    public UserServiceImpl(UserRepository userRepository, RoleRepository roleRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public User saveUser(User user) {

        return userRepository.save(user);
    }

    @Override
    public User registerNewUser(UserDto userDto) {
        if (emailExists(userDto.getEmail())){
            throw new IllegalArgumentException("The email address " + userDto.getEmail() + " is already exists");
        }
        User user = UserMapper.INSTANCE.userDtoToUser(userDto);
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        user.setRoles(Arrays.asList(roleRepository.findByRoleName("USER")));
        return userRepository.save(user);
    }

    private boolean emailExists(String email){
        return userRepository.findByEmail(email) != null;
    }
}
