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
    private String name;
    private String  email;
    private String password;
    private  String phoneNumber;
    private String role;

}
