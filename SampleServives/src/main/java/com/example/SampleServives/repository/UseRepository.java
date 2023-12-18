package com.example.SampleServives.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.SampleServives.models.Users;

@Repository
public interface UseRepository extends JpaRepository<Users, Long>{
	
	 List<Users> findAll();
	//findByEmail(String email);

	//Users findById(Long id);

}
