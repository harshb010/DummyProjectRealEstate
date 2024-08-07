package com.org.realestate.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.realestate.entity.Agent;
import com.org.realestate.repository.AgentRepository;

@Service
public class AgentService {

	 @Autowired
	    private AgentRepository agentRepository;

	    public List<Agent> findAll() {
	        return agentRepository.findAll();
	    }

	    public Optional<Agent> findById(Long id) {
	        return agentRepository.findById(id);
	    }

	    public Agent save(Agent agent) {
	        return agentRepository.save(agent);
	    }

	    public void deleteById(Long id) {
	        agentRepository.deleteById(id);
	    }

}
