package com.aprendendo.course.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.aprendendo.course.entities.OrderStatus;
import com.aprendendo.course.entities.User;
import com.aprendendo.course.entities.order;

import com.aprendendo.course.repositeries.UserRepository;
import com.aprendendo.course.repositeries.orderRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private orderRepository orderRepository;
	@Override
	public void run(String... args) throws Exception {
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456"); 
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456"); 
		
		
		order o1 = new order(null, Instant.parse("2019-06-20T19:53:07Z"),OrderStatus.DELIVERED, u1); 
		order o2 = new order(null, Instant.parse("2019-07-21T03:42:10Z"),OrderStatus.DELIVERED, u2); 
		order o3 = new order(null, Instant.parse("2019-07-22T15:21:22Z"),OrderStatus.DELIVERED, u1);
		
		userRepository.saveAll(Arrays.asList(u1,u2));
		orderRepository.saveAll(Arrays.asList(o1, o2, o3));
		
		
	}
	
	
	
}
