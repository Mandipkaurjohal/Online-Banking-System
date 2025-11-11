package com.banking.Online.Banking.System.runner;

import com.banking.Online.Banking.System.entity.User;
import com.banking.Online.Banking.System.repository.UserRepository;
import jakarta.persistence.Column;
import lombok.Builder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component


public class DataLoader implements CommandLineRunner {

  private final UserRepository userRepository;


    public DataLoader(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        if(userRepository.count()==0){
            User admin= User.builder().name("Admin").email("admin@outlook.com").role("admin").phoneNumber("99999")
                    .build();
            User customer= User.builder().name("customer").email("customer@outlook.com").role("customer").phoneNumber("11111")
                    .build();
            System.out.println(" admin saved"+ userRepository.save(admin));
            System.out.println("customer saved"+userRepository.save(customer));


        }

    }
}
