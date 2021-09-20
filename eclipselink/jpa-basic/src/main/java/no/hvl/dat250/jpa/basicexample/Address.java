package no.hvl.dat250.jpa.basicexample;

import javax.persistence.*;
import java.util.*;

@Entity
public class Address {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;

    private String street;
    private int number;

    @ManyToMany(mappedBy ="addresses")
    private Set<Person> people = new HashSet<>();


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    private Set<Person> getPeople() {
        return people;
    }

    private void getPeople(Set<Person> people) {
        this.people = people;
    }
}
