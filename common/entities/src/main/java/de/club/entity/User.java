package de.club.entity;

import de.club.UserRole;
import jakarta.persistence.*;

import java.util.Date;
@Entity
@Table(name = "USERS", uniqueConstraints = {})
public class User {

    @Column(name = "FIRSTNAME")
    private String firstName;

    @Column(name = "LASTNAME")
    private String lastName;

    @Column(name = "EMAIL", unique = true)
    private String email;


    @Column(name = "PASSWORD")
    private String password;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "MEMBER_NUMBER", unique = true)
    private long memberNumber;

    @Temporal(TemporalType.DATE)
    @Column(name = "dateOfBirthday")
    private Date dateOfBirthday;

    @Column(name = "profession")
    private String profession;

    @Enumerated(EnumType.STRING)
    @JoinColumn(name = "UserRole")
    private UserRole role;


    @Column(name = "phone_number")
    private long phoneNumber;
    public User() {

    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public long getMemberNumber() {
        return memberNumber;
    }

    public void setMemberNumber(long memberNumber) {
        this.memberNumber = memberNumber;
    }

    public Date getDateOfBirthday() {
        return dateOfBirthday;
    }

    public void setDateOfBirthday(Date dateOfBirthday) {
        this.dateOfBirthday = dateOfBirthday;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public UserRole getRole() {
        return role;
    }

    public void setRole(UserRole role) {
        this.role = role;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }



}
