package com.run.presistence.controller;

import com.run.presistence.domain.SimanisMstUser;
import com.run.presistence.repository.SimanisMstUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * @author 59410
 */

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private SimanisMstUserRepository simanisMstUserRepository;

    @GetMapping
    public List<SimanisMstUser> findAllUsers(){
        return simanisMstUserRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<SimanisMstUser> findUserById(@PathVariable(value = "id") long id) {
        int i = (int) id;
        Optional<SimanisMstUser> user = simanisMstUserRepository.findById(i);
        return user.map(simanisMstUser -> ResponseEntity.ok().body(simanisMstUser)).orElseGet(() -> ResponseEntity.notFound().build());
        // Implement
    }

    @PostMapping
    public SimanisMstUser saveUser(@Validated @RequestBody SimanisMstUser user) {
        // Implement
        return simanisMstUserRepository.save(user);
    }
}
