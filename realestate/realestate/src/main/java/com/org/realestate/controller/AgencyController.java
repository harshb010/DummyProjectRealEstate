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

import com.org.realestate.entity.Agency;
import com.org.realestate.services.AgencyService;

@RestController
@RequestMapping("/agency")
public class AgencyController {

    @Autowired
    private AgencyService agencyService;

    @GetMapping
    public List<Agency> getAllAgencies() {
        return agencyService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Agency> getAgencyById(@PathVariable Long id) {
        return agencyService.findById(id);
    }

    @PostMapping
    public Agency createAgency(@RequestBody Agency agency) {
        return agencyService.save(agency);
    }

    @PutMapping("/{id}")
    public Agency updateAgency(@PathVariable Long id, @RequestBody Agency agency) {
        agency.setAgencyId(id);
        return agencyService.save(agency);
    }

    @DeleteMapping("/{id}")
    public void deleteAgency(@PathVariable Long id) {
        agencyService.deleteById(id);
    }

}
