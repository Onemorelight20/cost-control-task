package com.studying.costcontroltask.service;

import com.studying.costcontroltask.entity.CategorySpending;
import com.studying.costcontroltask.entity.User;
import com.studying.costcontroltask.repository.CategorySpendingRepo;
import com.studying.costcontroltask.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategorySpendingService {

    private UserRepo userRepo;
    private CategorySpendingRepo categorySpendingRepo;

    @Autowired
    public CategorySpendingService(UserRepo userRepo, CategorySpendingRepo categorySpendingRepo){
        this.userRepo = userRepo;
        this.categorySpendingRepo = categorySpendingRepo;
    }

    public void save(CategorySpending categorySpending){
        categorySpendingRepo.save(categorySpending);
    }

    public List<CategorySpending> findByUser(User user){
        return categorySpendingRepo.findByUser(user);
    }

}
