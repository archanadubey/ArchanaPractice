package com.example.SampleServives.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.SampleServives.models.Users;

@Repository
public interface UserRepository extends JpaRepository<Users, Long>{
	List<Users> findAll();
	//Users findByEmail(String email);

}
