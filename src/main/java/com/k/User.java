package com.k;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "password", nullable = false)
    private String password;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
    private List<UserRole> roles;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public List<UserRole> getRoles() {
        return roles;
    }

    public void setRoles(List<UserRole> roles) {
        this.roles = roles;
    }
}
