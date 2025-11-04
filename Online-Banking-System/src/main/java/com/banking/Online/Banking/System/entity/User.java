package com.banking.Online.Banking.System.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//it gonna create id number automatically
    private Long id ;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String  email;
    @Column(nullable = false)
    private String password;
    @Column(nullable = false)
    private  String phoneNumber;
    @Column(nullable = false)
    private String role;

}
