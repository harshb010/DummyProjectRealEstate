package com.org.realestate.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpServerErrorException;

import com.org.realestate.entity.Users;
import com.org.realestate.exception.CustomeException;
import com.org.realestate.services.UserService;

@RestController
@RequestMapping("/user")
@CrossOrigin("*")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public List<Users> getAllUsers() {
        return userService.findAll();
    }
    
    @PostMapping
    public Users createUser(@RequestBody Users user) {
        return userService.save(user);
    }


    @GetMapping("/{id}")
    public ResponseEntity<?> getUserById(@PathVariable Long id) {
    	try {
        return  new ResponseEntity<>(userService.findById(id),HttpStatus.OK);
    	}catch (CustomeException e) {
    	return new ResponseEntity<>(e.getMessage(),HttpStatus.BAD_REQUEST);
    	}
    }

   
    @PutMapping("/{id}")
    public Users updateUser(Users updatedUser, Users existingUser) {
        updatedUser.setName(existingUser.getName());
        updatedUser.setPhoneNumber(existingUser.getPhoneNumber());
        updatedUser.setAddress(existingUser.getAddress());
        updatedUser.setEmail(existingUser.getEmail());
        updatedUser.setAppointments(existingUser.getAppointments());
        
        return userService.save(updatedUser);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id) {
        userService.deleteById(id);
    }

}
