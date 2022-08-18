package com.bridgelabz.greetingapp1.repository;

import com.bridgelabz.greetingapp1.entity.Greeting;
import com.bridgelabz.greetingapp1.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GreetingRepository extends JpaRepository<Greeting,Long> {
}
