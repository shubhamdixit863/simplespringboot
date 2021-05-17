package com.example.demo.services;

import com.example.demo.entity.User;
import com.example.demo.respositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User createUSer(String email,String password)
    {
     User user=new User();
     user.setEmail(email);
     user.setPassword(password);
      return userRepository.save(user);
    }
}
