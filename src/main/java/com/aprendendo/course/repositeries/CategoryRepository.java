package com.aprendendo.course.repositeries;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aprendendo.course.entities.Category;
import com.aprendendo.course.entities.User;


public interface CategoryRepository extends JpaRepository<Category, Long>{

}
