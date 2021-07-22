package com.haberi.LibrarySystem.LibrarySystem.DTO;


import com.haberi.LibrarySystem.LibrarySystem.Validators.ValidEmail;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {

    @ValidEmail
    @NotBlank
    private String email;

    @NotBlank
    private String password;

    @NotBlank(message = "The username must be at least 1 character long")
    private String username;
}
