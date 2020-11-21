package com.cursodoscotoco.demo1.dto;

import com.cursodoscotoco.demo1.domain.User;
import lombok.Data;

@Data
public class UserDTO {
    private String name;
    private String city;

    public User toDomain(){
        User user = new User();
        user.setName(this.name);
        user.setCity(this.city);
        return  user;
    }
}
