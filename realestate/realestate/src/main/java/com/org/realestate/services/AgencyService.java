package com.org.realestate.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.realestate.entity.Agency;
import com.org.realestate.repository.AgencyRepository;

@Service
public class AgencyService {

	@Autowired
    private AgencyRepository agencyRepository;

    public List<Agency> findAll() {
        return agencyRepository.findAll();
    }

    public Optional<Agency> findById(Long id) {
        return agencyRepository.findById(id);
    }

    public Agency save(Agency agency) {
        return agencyRepository.save(agency);
    }

    public void deleteById(Long id) {
        agencyRepository.deleteById(id);
    }
}
