package com.banking.Online.Banking.System.service.Impl;

import com.banking.Online.Banking.System.dto.UserDTO;

import java.util.List;

public interface UserService {
UserDTO createUser(UserDTO userDTO);
UserDTO getUserById(Long id);
List<UserDTO> getAlluser();
UserDTO updateUser(Long id, UserDTO userDTO);
void deleteUser(Long id);
}

