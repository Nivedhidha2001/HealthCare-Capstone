package com.cisco.health.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cisco.health.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	User findById(Integer id);



}