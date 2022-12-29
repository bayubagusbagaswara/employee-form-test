package com.bayu.employee.controller;

import com.bayu.employee.model.User;
import com.bayu.employee.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    // handle to register user (create a new user)

    @GetMapping("/show-form-add-user")
    public String showFormAddUser(Model model) {
        model.addAttribute("title", "Add User");
        model.addAttribute("user", new User());

        // tampilkan html form add user
        return "show_form_add_user";
    }

    @PostMapping("/do-add-user")
    public String addUser() {

        return "do_add_user";
    }

}
