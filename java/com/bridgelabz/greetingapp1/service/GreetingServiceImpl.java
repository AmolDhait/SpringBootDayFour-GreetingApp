package com.bridgelabz.greetingapp1.service;

import com.bridgelabz.greetingapp1.entity.Greeting;
import com.bridgelabz.greetingapp1.entity.User;
import com.bridgelabz.greetingapp1.repository.GreetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class GreetingServiceImpl implements GreetingService{
    @Autowired
    private GreetingRepository greetingRepository;

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @Override
    public Greeting addGreeting(User user) {

        String message = String.format(template,(user.toString().isEmpty()) ?  "hello" : user.toString());
        return greetingRepository.save(new Greeting(counter.incrementAndGet(),message));
    }

    @Override
    public Greeting getGreetingByID(Long id) {
        return greetingRepository.findById(id).get();
    }

    @Override
    public List<Greeting> getAll(){
        return greetingRepository.findAll();
    }

    @Override
    public Greeting updateGreetingById(long id, String name){
        Greeting greeting = greetingRepository.findById(id).get();
        greeting.setMessage(name);
        greetingRepository.save(greeting);
        return greeting;
    }

    @Override
    public  List<Greeting> deleteGreetingById(Long id)
    {
        greetingRepository.deleteById(id);
        return greetingRepository.findAll();
    }
}
