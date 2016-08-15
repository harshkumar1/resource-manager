package edu.psu.sweng568.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.psu.sweng568.models.LoginInfo;
import edu.psu.sweng568.models.User;
import edu.psu.sweng568.repositories.UserRepository;

@Service
public class UserService
{
    @Autowired
    private UserRepository userRepository;

    public Iterable<User> getAllUsers()
    {
        return userRepository.findAll();
    }

    public User getUserById(Integer userId)
    {
        return userRepository.findOne(userId);
    }

    public User saveUser(User user)
    {
        return userRepository.save(user);
    }

    public User findUserWithLoginCredential(LoginInfo loginInfo)
    {
        return userRepository.findByUsernameAndPassword(loginInfo.getUsername(), loginInfo.getPassword());
    }
}
