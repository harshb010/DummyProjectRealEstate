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

import com.org.realestate.entity.Builder;
import com.org.realestate.services.BuilderService;

@RestController
@RequestMapping("/builder")
public class BuilderController {

    @Autowired
    private BuilderService builderService;

    @GetMapping
    public List<Builder> getAllBuilders() {
        return builderService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Builder> getBuilderById(@PathVariable Long id) {
        return builderService.findById(id);
    }

    @PostMapping
    public Builder createBuilder(@RequestBody Builder builder) {
        return builderService.save(builder);
    }

    @PutMapping("/{id}")
    public Builder updateBuilder(@PathVariable Long id, @RequestBody Builder builder) {
        builder.setBuilderId(id);
        return builderService.save(builder);
    }

    @DeleteMapping("/{id}")
    public void deleteBuilder(@PathVariable Long id) {
        builderService.deleteById(id);
    }

}
