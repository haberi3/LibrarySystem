package com.haberi.LibrarySystem.LibrarySystem.Controller;

import com.haberi.LibrarySystem.LibrarySystem.DTO.UserDto;
import com.haberi.LibrarySystem.LibrarySystem.Service.UserServiceImpl;
import com.haberi.LibrarySystem.LibrarySystem.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

@Controller
public class RegistrationController {

    final UserServiceImpl userService;

    public RegistrationController(UserServiceImpl userService) {
        this.userService = userService;
    }

    @GetMapping("/registration")
    public String showRegistrationForm(WebRequest request, Model model) {
        UserDto userDto = new UserDto();
        model.addAttribute("user", userDto);
        return "registration";
    }

    @PostMapping("/registration")
    public ModelAndView registerUserAccount(@ModelAttribute("user") @Valid UserDto userDto,
                                            HttpServletRequest request, Errors errors) {
        ModelAndView mav = new ModelAndView();
        try {
            User registered = userService.registerNewUser(userDto);
        } catch (IllegalArgumentException iae) {
            mav.addObject("message", "An account for that email already exists.");
            return mav;
        }

        return new ModelAndView("successRegister", "user",userDto);
    }
}
