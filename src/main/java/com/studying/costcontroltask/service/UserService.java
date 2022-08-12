package com.studying.costcontroltask.service;

import com.studying.costcontroltask.entity.User;
import com.studying.costcontroltask.repository.CategorySpendingRepo;
import com.studying.costcontroltask.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private UserRepo userRepo;
    private CategorySpendingRepo categorySpendingRepo;

    @Autowired
    public UserService(UserRepo userRepo, CategorySpendingRepo categorySpendingRepo){
        this.userRepo = userRepo;
        this.categorySpendingRepo = categorySpendingRepo;
    }

    public void save(User user){
        userRepo.save(user);
    }
}
