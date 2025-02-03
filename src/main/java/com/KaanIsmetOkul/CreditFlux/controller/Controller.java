package com.KaanIsmetOkul.CreditFlux.controller;

import com.KaanIsmetOkul.CreditFlux.entity.User;
import com.KaanIsmetOkul.CreditFlux.exceptionHandling.ResourceNotFound;
import com.KaanIsmetOkul.CreditFlux.repository.UserRepository;
import com.KaanIsmetOkul.CreditFlux.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("api/v1/")
public class Controller {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @PostMapping("/users")
    public ResponseEntity<User> saveUser(@RequestBody User user) {
        User savedUser = userService.saveUser(user);
        return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
    }

    @GetMapping("/users{id}")
    public ResponseEntity<User> getUser(@PathVariable UUID id) {
        User user = userRepository.findById(id).orElseThrow(
                () -> new ResourceNotFound("Unable to find user: " + id)
        );
        return ResponseEntity.ok(user);
    }

}
