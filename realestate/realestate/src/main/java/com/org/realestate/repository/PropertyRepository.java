package com.org.realestate.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.org.realestate.entity.Property;

public interface PropertyRepository extends JpaRepository<Property, Long> {

}
