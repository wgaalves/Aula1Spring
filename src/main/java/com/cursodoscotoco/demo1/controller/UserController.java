package com.cursodoscotoco.demo1.controller;

import com.cursodoscotoco.demo1.domain.User;
import com.cursodoscotoco.demo1.dto.UserDTO;
import com.cursodoscotoco.demo1.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@Controller
public class UserController {

  private UserService userService;

  @PostMapping(value = "/user", consumes = "application/json", produces = "application/json")
  public ResponseEntity<User> create(@Validated @RequestBody UserDTO userDTO) {
    User user = userService.save(userDTO);
    return ResponseEntity.status(HttpStatus.CREATED).body(user);
  }

  @GetMapping(value = "/user", consumes = "application/json", produces = "application/json")
  public ResponseEntity<List<User>> getAll() {

    return ResponseEntity.status(HttpStatus.OK).body(userService.findAll());
  }

  //Desafio Criar os metodos seguintes

  @PutMapping(value = "/user/{id}", consumes = "application/json", produces = "application/json")
  public ResponseEntity<UserDTO> update(
          @Validated @RequestBody UserDTO user, @PathVariable String id) {
    return ResponseEntity.status(HttpStatus.OK).body(new UserDTO());
  }

  @DeleteMapping(value = "/user/{id}", consumes = "application/json", produces = "application/json")
  public ResponseEntity<String> delete(@PathVariable String id) {
    return ResponseEntity.status(HttpStatus.ACCEPTED).body("");
  }

  @GetMapping(value = "/user/{id}", consumes = "application/json", produces = "application/json")
  public ResponseEntity<String> getOne() {
    return ResponseEntity.status(HttpStatus.OK).body("");
  }
}
