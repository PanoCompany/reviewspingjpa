package com.phamdngoc.reviews;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReviewRepo extends JpaRepository<ReviewEntity, Integer> {
    List<ReviewEntity> findAllByProductId(int id);
}
