package com.bridgelabz.greetingapp1.entity;

import lombok.*;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Getter
@Setter
@AllArgsConstructor
@Table (name = "Greeting_Table")
public class Greeting {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;
    private String message;

//    public Greeting() {
//
//    }

        public Greeting() {
               this.message = getMessage();
        }

}
