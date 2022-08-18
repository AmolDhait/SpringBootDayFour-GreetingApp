package com.bridgelabz.greetingapp1.controller;


import com.bridgelabz.greetingapp1.entity.Greeting;
import com.bridgelabz.greetingapp1.entity.User;
import com.bridgelabz.greetingapp1.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/greeting")
public class GreetingController {
    @Autowired
    GreetingService greetingService;
//    private static final String template = "Hello,%s %s!";
//    private final AtomicLong counter = new AtomicLong();

      @GetMapping("/hello")
    public Greeting greetingMessage(@RequestParam (required = false,defaultValue ="") String firstName, String lastName)
    {
//        return new Greeting(counter.incrementAndGet(), String.format(template,firstName,lastName))
        User user = new User();
        user.setFirstName(firstName);
        user.setLastName(lastName);
        return greetingService.addGreeting(user);
    }

    @GetMapping("/getid/{id}")
    public Greeting greetingID(@PathVariable Long id){

          return greetingService.getGreetingByID(id);
    }

    @GetMapping("/getAll")
    public List<Greeting> getAll(){
          return greetingService.getAll();
    }

    @PutMapping("/update/{id}")
    public Greeting updateGreetingById(@PathVariable Long id, @RequestParam String name){
          return greetingService.updateGreetingById(id, name);
    }

    @DeleteMapping("/delete/{id}")
    public List<Greeting> deleteGreetingById(@PathVariable Long id){
          return greetingService.deleteGreetingById(id);
    }
}
