package com.example.db.config;

import com.example.db.service.UsersService;
import org.springframework.stereotype.Component;

/*
@Component
public class CustomUsernamePasswordAuthenticationProvider implements AuthenticationProvider {

    private final UsersService usersService;
    private final PasswordEncoder passwordEncoder;


    public CustomUsernamePasswordAuthenticationProvider(UsersService usersService, PasswordEncoder passwordEncoder) {
        this.usersService = usersService;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        String username = authentication.getName();
        String password = authentication.getCredentials().toString();

        if ("".equals(username) || "".equals(password)) {
            throw new BadCredentialsException("Invalid Credentials");
        }
        UserDetails userDetails = this.usersService.loadUserByUsername(username);
        if(passwordEncoder.matches(password,userDetails.getPassword()))
        {
            throw new BadCredentialsException("Invalid Credentials");
        }
        return new UsernamePasswordAuthenticationToken(userDetails,userDetails.getPassword(),
                userDetails.getAuthorities());

    }

    @Override
    public boolean supports(Class<?> aClass) {
        return aClass.equals(UsernamePasswordAuthenticationToken.class);
    }
}*/
