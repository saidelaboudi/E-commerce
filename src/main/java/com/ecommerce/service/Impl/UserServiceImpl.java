package com.ecommerce.service.Impl;

import com.ecommerce.model.User;
import com.ecommerce.repository.UserRepository;
import com.ecommerce.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Override
    public User addUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User getUser(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public void deleteUser(Long id) {
        User user = this.getUser(id);
        if(user!=null)
            userRepository.delete(user);
    }

    @Override
    public void editProfile(User user, Long id) {
        User user1 = this.getUser(id);
        user1.setEmail(user.getEmail());
        user1.setAddress(user.getAddress());
        user1.setFirstname(user.getFirstname());
        user1.setLastname(user.getLastname());
        userRepository.save(user1);
    }
}
