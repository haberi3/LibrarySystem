package com.haberi.LibrarySystem.LibrarySystem.entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "users")
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long userId;

    @Column(name = "email", nullable = false, unique = true)
    @Email(message = "Please provide a valid email address")
    private String email;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "user_name", unique = true)
    @NotBlank(message = "The username must be at least 1 character long")
    private String username;

    @Column(name = "membership_number", nullable = false)
    private String membershipNumber;

    @Column(name = "is_membership_active")
    private Boolean isMembershipActive = false;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(
            name = "users_roles",
            joinColumns = {@JoinColumn(name = "user_id")},
            inverseJoinColumns = {@JoinColumn(name = "role_id")})
    private List<Role> roles = new ArrayList<>();

    @OneToMany(mappedBy = "user")
    private List<Lending> lendingList = new ArrayList();
}
