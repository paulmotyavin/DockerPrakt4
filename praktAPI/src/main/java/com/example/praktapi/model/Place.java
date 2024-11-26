package com.example.praktapi.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "Places")
public class Place {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Size(min = 2, max = 70)
    private String name;

    @Size(min = 2, max = 150)
    private String address;

    @Size(min = 2, max = 50)
    private String contacts;

    public Place() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public @Size(min = 2, max = 70) String getName() {
        return name;
    }

    public void setName(@Size(min = 2, max = 70) String name) {
        this.name = name;
    }

    public @Size(min = 2, max = 150) String getAddress() {
        return address;
    }

    public void setAddress(@Size(min = 2, max = 150) String address) {
        this.address = address;
    }

    public @Size(min = 2, max = 50) String getContacts() {
        return contacts;
    }

    public void setContacts(@Size(min = 2, max = 50) String contacts) {
        this.contacts = contacts;
    }
}
