package com.org.realestate.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.realestate.entity.Users;
import com.org.realestate.exception.CustomeException;
import com.org.realestate.repository.UserRepository;

@Service
public class UserService {

	@Autowired
    private UserRepository userRepository;

    public List<Users> findAll() {
        return userRepository.findAll();
    }

    public Users findById(Long id) {
        return userRepository.findById(id).orElseThrow(()->new CustomeException("User not found"));
    }

    public Users save(Users user) {
        return userRepository.save(user);
    }

    public void deleteById(Long id) {
    	Users  usersRef=findById(id);
    	if(usersRef!=null)
        userRepository.deleteById(id);
    	else {
			throw new CustomeException("unable to delete user");
		}
    }
}
