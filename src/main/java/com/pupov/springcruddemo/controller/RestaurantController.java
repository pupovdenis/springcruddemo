package com.pupov.springcruddemo.controller;

import com.pupov.springcruddemo.model.Restaurant;
import com.pupov.springcruddemo.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

/**
 * @author Pupov
 */

@Controller
public class RestaurantController {

    private final RestaurantService restaurantService;

    @Autowired
    public RestaurantController(RestaurantService restaurantService) {
        this.restaurantService = restaurantService;
    }

    @GetMapping("/restaurants")
    public String findAll(Model model) {
        List<Restaurant> restaurants = restaurantService.findAll();
        model.addAttribute("restaurants", restaurants);
        return "restaurant-list";
    }

    @GetMapping("/restaurant-create")
    public String createRestaurantForm(Restaurant restaurant) {
        return "restaurant-create";
    }

    @PostMapping("/restaurant-create")
    public String createRestaurant(Restaurant restaurant) {
        restaurantService.saveRestaurant(restaurant);
        return "redirect:/restaurants";
    }

    @GetMapping("restaurant-delete/{id}")
    public String deleteRestaurant (@PathVariable("id") Long id) {
        restaurantService.deleteById(id);
        return "redirect:/restaurants";
    }

    @GetMapping("restaurant-update/{id}")
    public String updateRestaurantForm(@PathVariable("id") Long id, Model model) {
        Restaurant restaurant = restaurantService.findById(id);
        model.addAttribute("restaurant",restaurant);
        return "/restaurant-update";
    }

    @PostMapping("/restaurant-update")
    public String updateRestaurant(Restaurant restaurant) {
        restaurantService.saveRestaurant(restaurant);
        return "redirect:/restaurants";
    }
}
