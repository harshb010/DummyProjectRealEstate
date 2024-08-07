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

import com.org.realestate.entity.Review;
import com.org.realestate.services.ReviewService;

@RestController
@RequestMapping("/api/reviews")
public class ReviewController {

    @Autowired
    private ReviewService reviewService;

    @GetMapping
    public List<Review> getAllReviews() {
        return reviewService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Review> getReviewById(@PathVariable Long id) {
        return reviewService.findById(id);
    }

    @PostMapping
    public Review createReview(@RequestBody Review review) {
        return reviewService.save(review);
    }

    @PutMapping("/{id}")
    public Review updateReview(@PathVariable Long id, @RequestBody Review review) {
        review.setReviewId(id);
        return reviewService.save(review);
    }

    @DeleteMapping("/{id}")
    public void deleteReview(@PathVariable Long id) {
        reviewService.deleteById(id);
    }
}
