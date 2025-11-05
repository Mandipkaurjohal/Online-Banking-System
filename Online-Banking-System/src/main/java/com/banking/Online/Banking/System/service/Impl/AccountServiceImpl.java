package com.banking.Online.Banking.System.service.Impl;

import com.banking.Online.Banking.System.dto.AccountDTO;
import com.banking.Online.Banking.System.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    AccountRepository accountRepository;
    @Override
    public AccountDTO createAccount(AccountDTO accountDTO) {

        return null;
    }

    @Override
    public List<AccountDTO> getAllAccount() {
        return List.of();
    }

    @Override
    public AccountDTO getAccountById(Long id) {
        return null;
    }

    @Override
    public AccountDTO updateAccount(Long id, AccountDTO accountDTO) {
        return null;
    }

    @Override
    public void deleteAccount(Long id) {

    }

    @Override
    public List<AccountDTO> getAccountByUserId(Long userId) {
        return List.of();
    }
}
