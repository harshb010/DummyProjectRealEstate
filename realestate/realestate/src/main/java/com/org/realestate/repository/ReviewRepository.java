package com.org.realestate.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.org.realestate.entity.Review;

public interface ReviewRepository extends JpaRepository<Review, Long>{

}
