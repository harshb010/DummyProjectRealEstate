package com.org.realestate.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.realestate.entity.Property;
import com.org.realestate.repository.PropertyRepository;

@Service
public class PropertyService {

	 @Autowired
	    private PropertyRepository propertyRepository;

	    public List<Property> findAll() {
	        return propertyRepository.findAll();
	    }

	    public Optional<Property> findById(Long id) {
	        return propertyRepository.findById(id);
	    }

	    public Property save(Property property) {
	        return propertyRepository.save(property);
	    }

	    public void deleteById(Long id) {
	        propertyRepository.deleteById(id);
	    }
}
