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

import com.org.realestate.entity.Property;
import com.org.realestate.services.PropertyService;

@RestController
@RequestMapping("/property")
public class PropertyController {

    @Autowired
    private PropertyService propertyService;

    @GetMapping
    public List<Property> getAllProperties() {
        return propertyService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Property> getPropertyById(@PathVariable Long id) {
        return propertyService.findById(id);
    }

    @PostMapping
    public Property createProperty(@RequestBody Property property) {
        return propertyService.save(property);
    }

    @PutMapping("/{id}")
    public Property updateProperty(@PathVariable Long id, @RequestBody Property property) {
        property.setPropertyId(id);
        return propertyService.save(property);
    }

    @DeleteMapping("/{id}")
    public void deleteProperty(@PathVariable Long id) {
        propertyService.deleteById(id);
    }

}
