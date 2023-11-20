package com.aprendendo.course.repositeries;

import com.aprendendo.course.entities.Order;
import com.aprendendo.course.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
