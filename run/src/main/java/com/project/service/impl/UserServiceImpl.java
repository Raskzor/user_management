package com.project.service.impl;

import com.project.presistence.domain.SimanisMstUser;
import com.project.presistence.repository.SimanisMstUserRepository;
import com.project.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

/**
 * @author Raskzor
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    SimanisMstUserRepository simanisMstUserRepository;

    @Override
    public List<SimanisMstUser> getAllUsers() {
        return simanisMstUserRepository.findAll();
    }

    @Override
    public SimanisMstUser getUserById(int id) {
        Optional<SimanisMstUser> user = simanisMstUserRepository.findById(id);
        return user.get();
    }
}
