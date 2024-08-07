package com.org.realestate.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.org.realestate.entity.Agent;
import com.org.realestate.services.AgentService;

@RestController
@RequestMapping("/agent")
public class AgentController {

    @Autowired
    private AgentService agentService;

    @GetMapping
    public List<Agent> getAllAgents() {
        return agentService.findAll();
    }

    @PostMapping
    public Agent createAgent(@RequestBody Agent agent) {
        return agentService.save(agent);
    }
    
    @GetMapping("/{id}")
    public Optional<Agent> getAgentById(@PathVariable Long id) {
        return agentService.findById(id);
    }

    @PutMapping("/{id}")
    public Agent updateAgent(@PathVariable Long id, @RequestBody Agent agent) {
        agent.setAgentId(id);
        return agentService.save(agent);
    }

    @DeleteMapping("/{id}")
    public void deleteAgent(@PathVariable Long id) {
        agentService.deleteById(id);
    }

}
