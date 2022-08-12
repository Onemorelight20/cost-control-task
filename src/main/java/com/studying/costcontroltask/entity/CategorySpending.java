package com.studying.costcontroltask.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class CategorySpending {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String categoryName;

    private int moneySpent;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    public CategorySpending(){

    }

    public CategorySpending(String categoryName, int moneySpent, User user){
        this.categoryName = categoryName;
        this.moneySpent = moneySpent;
        this.user = user;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public int getMoneySpent() {
        return moneySpent;
    }

    public void setMoneySpent(int moneySpent) {
        this.moneySpent = moneySpent;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CategorySpending that = (CategorySpending) o;
        return moneySpent == that.moneySpent && Objects.equals(id, that.id) && Objects.equals(categoryName, that.categoryName) && Objects.equals(user, that.user);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, categoryName, moneySpent, user);
    }
}
