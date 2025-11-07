package com.banking.Online.Banking.System.service.Impl;

import com.banking.Online.Banking.System.dto.UserDTO;
import com.banking.Online.Banking.System.entity.User;
import com.banking.Online.Banking.System.exception.ResourcesNotFoundException;
import com.banking.Online.Banking.System.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    UserRepository userRepository;


    @Override
    public UserDTO createUser(UserDTO userDTO) {
        try{
            User user =new User();
            user.setName(userDTO.getName());
            user.setEmail(userDTO.getEmail());
            user.setPhoneNumber(user.getPhoneNumber());
            user.setRole(userDTO.getRole());
            User savedUser = userRepository.save(user);
            return userDTO;
    }
    catch(Exception e )
        {
            throw new RuntimeException("Failed to create new user"+e.getMessage());
        }


    }
// search specific user by ID
    @Override
    public UserDTO getUserById(Long id) {
        User user = userRepository.findById(id).orElseThrow(()-> new ResourcesNotFoundException("User now found with id"+id));
return new UserDTO(user.getId(), user.getName(), user.getEmail(), user.getPhoneNumber(), user.getRole());

    }

    @Override
    public List<UserDTO> getAlluser() {
        return userRepository.findAll().stream()
                .map(user -> new UserDTO(user.getId(), user.getName(), user.getEmail(), user.getRole(), user.getPhoneNumber()))
                .collect(Collectors.toList());

    }

    @Override
    public UserDTO updateUser(Long id, UserDTO userDTO) {
        try {
           User user = userRepository.findById(id).orElseThrow(()->new ResourcesNotFoundException("User not find : "+id));
        user.setName(userDTO.getName());
        user.setEmail(user.getEmail());
        user.setRole(user.getRole());
        user.setPhoneNumber(user.getPhoneNumber());
        return userDTO;
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    @Override
    public void deleteUser(Long id) {
        User user = userRepository.findById(id).orElseThrow(() -> new ResourcesNotFoundException("user not find :" + id));

userRepository.delete(user);
    }
}
