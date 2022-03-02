
package com.example.db.controller;

import com.example.db.exceptions.InvalidUserCredentialsException;
import com.example.db.model.Users;
import com.example.db.service.UsersService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/login")
public class LoginController {

    private final UsersService usersService;

    public LoginController(UsersService usersService) {
        this.usersService = usersService;
    }


    @GetMapping
    public String getLoginPage(){
        return "login";
    }

    @PostMapping
    public String login(HttpServletRequest request, Model model){
        Users users = null;
        try{
            users = this.usersService.login(request.getParameter("username"),
                    request.getParameter("userPassword"));
            request.getSession().setAttribute("user",users);
            return "redirect:/home";
        }
        catch (InvalidUserCredentialsException exception)
        {
            model.addAttribute("hasError", true);
            model.addAttribute("error", exception.getMessage());
            return "login";
        }
    }

}
