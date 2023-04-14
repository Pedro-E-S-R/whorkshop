package com.aprendendo.course.repositeries;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aprendendo.course.entities.User;


public interface UserRepository extends JpaRepository<User, Long>{

}
