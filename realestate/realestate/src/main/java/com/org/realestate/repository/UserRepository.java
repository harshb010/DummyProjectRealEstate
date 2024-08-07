package com.org.realestate.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.org.realestate.entity.Users;

public interface UserRepository extends JpaRepository<Users, Long> {

}
