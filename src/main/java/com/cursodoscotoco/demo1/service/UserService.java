package com.cursodoscotoco.demo1.service;

import com.cursodoscotoco.demo1.domain.User;
import com.cursodoscotoco.demo1.dto.UserDTO;
import com.cursodoscotoco.demo1.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class UserService {

  private UserRepository userRepository;

  public User save(UserDTO user) {
    User newUser = user.toDomain();
    userRepository.save(newUser);
    return newUser;
  }

  public List<User> findAll(){
    return userRepository.findAll();
  }
}
