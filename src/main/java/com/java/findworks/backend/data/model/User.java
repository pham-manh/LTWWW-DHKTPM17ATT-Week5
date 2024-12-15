package com.java.findworks.backend.data.model;

import java.util.Collection;

import jakarta.persistence.*;
import org.springframework.security.core.GrantedAuthority;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "user", schema = "works")
public abstract class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id", nullable = false)
    private Long id;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "phone", nullable = false)
    private String phone;

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "address", nullable = false)
    private Address address;

    @Column(name = "password", nullable = false)
    private String password;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private Role role;

    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }
}
