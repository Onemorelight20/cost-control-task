package com.studying.costcontroltask.repository;

import com.studying.costcontroltask.entity.CategorySpending;
import com.studying.costcontroltask.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategorySpendingRepo extends JpaRepository<CategorySpending, Long> {
    List<CategorySpending> findByUser(User user);
}
