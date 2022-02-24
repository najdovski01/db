package com.example.db.controller;
import com.example.db.exceptions.InvalidArgumentsException;
import com.example.db.service.AuthService;
import com.example.db.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/register")
public class RegisterController {
    private final AuthService authService;
    private final UserService userService;

    public RegisterController(AuthService authService, UserService userService) {
        this.authService = authService;
        this.userService = userService;
    }

    @GetMapping
    public String getRegisterPage(@RequestParam(required = false) String error, Model model) {
        if(error != null && !error.isEmpty()) {
            model.addAttribute("hasError", true);
            model.addAttribute("error", error);
        }
        model.addAttribute("bodyContent","register");
        return "master-template";
    }
    @PostMapping
    public String register(@RequestParam(required = false) Integer user_id,
                           @RequestParam String user_name,
                           @RequestParam String surname,
                           @RequestParam String email,
                           @RequestParam String username,
                           @RequestParam String password){
        try{
            this.userService.register(user_id, user_name, surname, email, username, password);
            return "redirect:/login";
        } catch(InvalidArgumentsException exception){
            return "redirect:/register?error=" + exception.getMessage();
        }

    }

}