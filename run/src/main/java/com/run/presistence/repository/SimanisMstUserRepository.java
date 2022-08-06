package com.run.presistence.repository;

import com.run.presistence.domain.SimanisMstUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SimanisMstUserRepository extends JpaRepository<SimanisMstUser, Integer> {

}