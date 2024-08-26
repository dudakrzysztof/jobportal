package com.github.dudakrzysztof.jobportal.services;

import com.github.dudakrzysztof.jobportal.entity.Users;
import com.github.dudakrzysztof.jobportal.repository.UsersRepository;
import com.github.dudakrzysztof.jobportal.util.CustomUserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class CustomUserDetailsService implements UserDetailsService {

    private final UsersRepository usersRepository;

    @Autowired
    public CustomUserDetailsService(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Users user = usersRepository.findByEmail(username).orElseThrow(() ->
                new UsernameNotFoundException("Could not found user"));
        return new CustomUserDetails(user);
    }
}
