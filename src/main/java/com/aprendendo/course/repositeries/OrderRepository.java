package com.aprendendo.course.repositeries;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aprendendo.course.entities.Order;

import java.util.List;


public interface OrderRepository extends JpaRepository<Order, Long>{

}
