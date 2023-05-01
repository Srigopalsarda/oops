package com.prog.entity;


import jakarta.persistence.*;
@Entity
@Table(name = "USER_DTLS")

public class UserDtls {
//     @Entity
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "FullName")
    private String FullName;
    private String Email;

    private String Password;
    private String role;




    public UserDtls(int id, String fullName, String email, String password, String role) {
        this.id = id;
        FullName = fullName;
        Email = email;
        Password = password;
        this.role = role;
    }

    public UserDtls() {

    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return FullName;
    }

    public void setFullName(String fullName) {
        FullName = fullName;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "UserDtls{" +
                "id=" + id +
                ", FullName='" + FullName + '\'' +
                ", Email='" + Email + '\'' +
                ", Password='" + Password + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}
