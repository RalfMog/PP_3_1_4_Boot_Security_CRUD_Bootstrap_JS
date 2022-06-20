package ru.kata.spring.boot_security.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.kata.spring.boot_security.demo.dao.UserRepository;
import ru.kata.spring.boot_security.demo.model.Role;
import ru.kata.spring.boot_security.demo.model.User;
import ru.kata.spring.boot_security.demo.service.UserService;

import java.util.List;
import java.util.Set;

@Controller
@RequestMapping("/admin")
public class MainController {

    private final UserService userService;
    private final UserRepository userRepository;

    @Autowired
    public MainController(UserService userService,
                          UserRepository userRepository) {
        this.userRepository = userRepository;
        this.userService = userService;
    }

    @GetMapping("/{id}")
    public String allUser(@PathVariable Long id, Model model) {
        model.addAttribute("user", userService.getById(id));
        return "admin";
    }

    @GetMapping()
    public String showAllUsers(Model model, @AuthenticationPrincipal User user) {
        List<User> users = userService.findAll();
        Set<Role> listRoles = userService.getAllRoles();
        model.addAttribute("users", users);
        model.addAttribute("userObj", new User());
        model.addAttribute("listRoles", listRoles);
        model.addAttribute("userRep", userRepository.findByUsername(user.getUsername()));
        return "admin";
    }
}
