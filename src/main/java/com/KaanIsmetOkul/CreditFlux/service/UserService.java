package com.KaanIsmetOkul.CreditFlux.service;

import com.KaanIsmetOkul.CreditFlux.entity.User;
import com.KaanIsmetOkul.CreditFlux.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public User saveUser(User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return user;
    }
}
