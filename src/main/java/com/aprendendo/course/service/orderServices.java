package com.aprendendo.course.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.aprendendo.course.entities.order;
import com.aprendendo.course.repositeries.orderRepository;


@Component
public class orderServices {
	
	@Autowired
	private orderRepository repository;
	
	
	public List<order> findAll(){
		return repository.findAll();
	}
	public order findById(Long id) {
		Optional<order> obj = repository.findById(id);
		return obj.get();
	}
	
}

