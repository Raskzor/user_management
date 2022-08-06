package com.project.controller;

import com.project.presistence.domain.SimanisMstUser;
import com.project.presistence.repository.SimanisMstUserRepository;
import com.project.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * @author Raskzor
 */

@SuppressWarnings("unused")
@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private SimanisMstUserRepository simanisMstUserRepository;

    @Autowired
    private UserService userService;

    @RequestMapping("/all")
    @GetMapping
    public List<SimanisMstUser> findAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/{id}")
    public ResponseEntity<SimanisMstUser> findUserById(@PathVariable(value = "id") long id) {
        SimanisMstUser user = userService.getUserById((int) id);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @PostMapping
    public SimanisMstUser saveUser(@Validated @RequestBody SimanisMstUser user) {
        return simanisMstUserRepository.save(user);
    }

    @GetMapping("/username/{id}")
    public String getUsername(@PathVariable(value = "id") long id) {
        int i = (int) id;
        Optional<SimanisMstUser> user = simanisMstUserRepository.findById(i);
        return user.get().getUsername();
    }
}
