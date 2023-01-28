package com.springboot.jpa;


import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.springboot.jpa.dao.UserRepository;
import com.springboot.jpa.models.User;

@SpringBootApplication
public class JpaApplication {

	public static void main(String[] args) {
		ApplicationContext context=	SpringApplication.run(JpaApplication.class, args);
		
		UserRepository userRepository = context.getBean(UserRepository.class);
		
		//CREATE 
		
		//for single instance 
		
//		User user =new User();
//		user.setCity("GOA");
//		user.setName("Ankit Sharma");
//		User u= userRepository.save(user);
//		System.out.println(u);
////		
////		//for multiple instance
//		
//		User user2=new User();
//		user2.setCity("DOON");
//		user2.setName("Aman");
//		
//		User user3=new User();
//		user3.setCity("J&K");
//		user3.setName("Bali");
//		
//		List<User> users =List.of(user2,user3);
//		Iterable<User> i =userRepository.saveAll(users);
//		
//		i.forEach(it ->{
//			System.out.println(it);
//		});
//		
//		
//		//UPDATE
//		
////		update the user data using its id
////		3 | J&K  | Bali
////		
//		 Optional<User> optional = userRepository.findById(3);
//		 User userUpdate =optional.get();
//		 userUpdate.setName("Urvashi bali");
//		 userRepository.save(userUpdate);
////		 
////			3 | J&K  | Urvashi Bali
//
//		
//		//READ 
//		
////		1. findById(int id) --> returning optional containing data
////		2. findAll()
//		Iterable<User> itr=userRepository.findAll();
//		itr.forEach(userRead->System.out.println(userRead));
//		
//		
//		//DELETE
//		
////		1. deletById(int id);
//		
//		userRepository.deleteById(3);
//		
////		2.deleteAll();
//		
//		userRepository.deleteAll();
//		
		
		List<User> username =userRepository.findByName("Bali");
		username.forEach(e->System.out.println(e));
		
		List<User> alluser=userRepository.getAllUsers();
		alluser.forEach(e->System.out.println(e));
		
		List<User> ans =userRepository.findByNameOrCity("Bali","DOON");
		ans.forEach(e->System.out.println(e));
		
	}

}
