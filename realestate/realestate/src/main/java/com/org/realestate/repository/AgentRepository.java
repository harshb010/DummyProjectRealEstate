package com.org.realestate.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.org.realestate.entity.Agent;

public interface AgentRepository extends JpaRepository<Agent, Long> {

}
