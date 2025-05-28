package de.club.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "USERS", uniqueConstraints = {})
public class User {

    private String firstName;
    private String lastName;

    @Column(name = "EMAIL", unique = true)
    private String email;

    private String password;

    @Id
    private Long id;

    public User() {

    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
