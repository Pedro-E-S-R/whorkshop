package com.aprendendo.course.service;


import com.aprendendo.course.entities.OrderItem;
import com.aprendendo.course.repositeries.OrderItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;


@Component
public class OrderItemService {

	@Autowired
	private OrderItemRepository repository;


	public List<OrderItem> findAll(){
		return repository.findAll();
	}
	public OrderItem findById(Long id) {
		Optional<OrderItem> obj = repository.findById(id);
		return obj.get();
	}

}

