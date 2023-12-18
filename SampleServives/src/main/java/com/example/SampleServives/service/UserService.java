package com.example.SampleServives.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.SampleServives.models.Users;
import com.example.SampleServives.repository.UseRepository;

@Service
public class UserService {
	
	 private final UseRepository useRepository;
	 

	    public UserService(UseRepository useRepository) {
	        this.useRepository = useRepository;
	    }
	    
	    
	    
	    public List<Users> getAllUsers() {
	        return useRepository.findAll();
	    }



		public void saveUsers(Users users) {
			useRepository.save(users);
			
		}



		public Optional<Users> getUserById(Long id) {
			
			return this.useRepository.findById(id);
		}
		
//		 public void saveUser(User user) {
//		        userRepository.save(user);
//		    }
	

}
