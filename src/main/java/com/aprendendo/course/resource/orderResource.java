package com.aprendendo.course.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aprendendo.course.entities.order;
import com.aprendendo.course.service.orderServices;

@RestController
@RequestMapping(value = "/orders")
public class orderResource {
	
	@Autowired
	private orderServices service;
	
	@GetMapping
	public ResponseEntity<List<order>> findAll(){
		List<order> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<order> findById(@PathVariable Long id){
		order obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	
}
