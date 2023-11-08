package com.dtoexample.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dtoexample.model.User;

public interface UserRepository extends JpaRepository <User,Long>{

}
