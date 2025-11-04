package com.banking.Online.Banking.System.repository;

import com.banking.Online.Banking.System.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long>{

}
