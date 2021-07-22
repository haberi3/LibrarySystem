package com.haberi.LibrarySystem.LibrarySystem.mapper;

import com.haberi.LibrarySystem.LibrarySystem.DTO.UserDto;
import com.haberi.LibrarySystem.LibrarySystem.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    User userDtoToUser(UserDto userDto);

    UserDto userToUserDto(User user);
}
