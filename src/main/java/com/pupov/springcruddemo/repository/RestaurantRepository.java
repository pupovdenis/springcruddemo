package com.pupov.springcruddemo.repository;

import com.pupov.springcruddemo.model.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 * @author Pupov
 */
public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {
}
