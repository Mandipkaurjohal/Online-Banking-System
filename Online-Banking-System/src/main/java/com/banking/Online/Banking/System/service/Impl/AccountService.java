package com.banking.Online.Banking.System.service.Impl;

import com.banking.Online.Banking.System.dto.AccountDTO;

import java.util.List;

public interface AccountService {
     AccountDTO createAccount(AccountDTO accountDTO);
     List<AccountDTO> getAllAccount();
     AccountDTO getAccountById(Long id);
     AccountDTO updateAccount(Long id,AccountDTO accountDTO);
void deleteAccount(Long id);
 List<AccountDTO> getAccountByUserId(Long userId);
}
