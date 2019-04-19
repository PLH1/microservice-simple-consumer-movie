package com.itmuchlearn.microservicesimpleconsumermovie.Controller;

import com.itmuchlearn.microservicesimpleconsumermovie.daomian.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @describe:
 * @outhor 潘立欢
 * @create 2019-04-19 11:18
 */
@RequestMapping("/movies")
@RestController
public class MovieController {
    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/users/{id}")
    public User findById(@PathVariable Long id) {
        return this.restTemplate.getForObject("http://localhost:8000/users/{id}", User.class, id);
    }
}
