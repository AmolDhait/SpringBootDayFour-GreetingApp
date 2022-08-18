package com.bridgelabz.greetingapp1.service;

import com.bridgelabz.greetingapp1.entity.Greeting;
import com.bridgelabz.greetingapp1.entity.User;

import java.util.List;
import java.util.Optional;

public interface GreetingService {

    Greeting addGreeting (User user);

    Greeting getGreetingByID(Long id);
    List<Greeting> getAll();
    Greeting updateGreetingById(long id, String name);
    List<Greeting> deleteGreetingById(Long id);
}
