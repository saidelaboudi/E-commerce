package com.ecommerce.service;

import com.ecommerce.model.User;

import java.util.List;

public interface UserService {
    public User addUser(User user);
    public User getUser(Long id);
    public List<User> getAllUsers();
    public void deleteUser(Long id);
    public void editProfile(User user , Long id);
    public User getUserByUsername(String username);
}
