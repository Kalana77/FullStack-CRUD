package com.example.fullstackcurd.controller;

import com.example.fullstackcurd.dto.requestDTO.UserSaveRequestDTO;
import com.example.fullstackcurd.dto.responseDTO.UserSaveResponseDTO;
import com.example.fullstackcurd.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000")
@RequestMapping("api/v1/CURD")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping(path = "/addUser")
    public String saveUser(@RequestBody UserSaveRequestDTO userSaveRequestDTO){
        String id = userService.addUser(userSaveRequestDTO);
        return id;
    }

    @GetMapping(path = "/getUser")
    public List <UserSaveResponseDTO> getUser(){
        List <UserSaveResponseDTO> userSaveResponseDTO = userService.getUser();
        return  userSaveResponseDTO;
    }

}
