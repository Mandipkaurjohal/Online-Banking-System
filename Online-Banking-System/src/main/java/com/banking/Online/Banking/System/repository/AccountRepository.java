package com.banking.Online.Banking.System.repository;

import com.banking.Online.Banking.System.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AccountRepository extends JpaRepository<Account,Long> {
    List<Account> findByUserId(Long userId);
}
