package com.org.realestate.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.realestate.entity.Review;
import com.org.realestate.repository.ReviewRepository;

@Service
public class ReviewService {

	 @Autowired
	    private ReviewRepository reviewRepository;

	    public List<Review> findAll() {
	        return reviewRepository.findAll();
	    }

	    public Optional<Review> findById(Long id) {
	        return reviewRepository.findById(id);
	    }

	    public Review save(Review review) {
	        return reviewRepository.save(review);
	    }

	    public void deleteById(Long id) {
	        reviewRepository.deleteById(id);
	    }
}
