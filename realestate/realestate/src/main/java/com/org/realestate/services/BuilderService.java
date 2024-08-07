package com.org.realestate.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.realestate.entity.Builder;
import com.org.realestate.repository.BuilderRepository;

@Service
public class BuilderService {

	@Autowired
    private BuilderRepository builderRepository;

    public List<Builder> findAll() {
        return builderRepository.findAll();
    }

    public Optional<Builder> findById(Long id) {
        return builderRepository.findById(id);
    }

    public Builder save(Builder builder) {
        return builderRepository.save(builder);
    }

    public void deleteById(Long id) {
        builderRepository.deleteById(id);
    }

}
