package com.project.service;

import com.project.presistence.domain.SimanisMstUser;

import java.util.List;

/**
 * @author Raskzor
 */
public interface UserService {

    List<SimanisMstUser> getAllUsers();

    SimanisMstUser getUserById(int id);
}
