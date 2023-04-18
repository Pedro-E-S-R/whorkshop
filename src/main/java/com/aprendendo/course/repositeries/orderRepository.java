package com.aprendendo.course.repositeries;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aprendendo.course.entities.order;


public interface orderRepository extends JpaRepository<order, Long>{

}
