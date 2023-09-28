package com.phamdngoc.reviews.controller;

import com.phamdngoc.reviews.ReviewEntity;
import com.phamdngoc.reviews.ReviewRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reviews")
public class ReviewController {

    @Autowired
    ReviewRepo reviewRepo;

    @GetMapping("")
    public List<ReviewEntity> getAllReviews(){
        return reviewRepo.findAll();
    }

    @GetMapping("/{id}")
    public List<ReviewEntity> getReviewsById(@PathVariable int id){
        return reviewRepo.findAllByProductId(id);
    }


    @PostMapping("")
    public ReviewEntity addReviews(@RequestBody ReviewEntity review){
        return reviewRepo.save(review);
    }
}
