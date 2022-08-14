package com.example.SmallWebapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.example.SmallWebapp.UserRegister;

import antlr.collections.List;


public interface UserRepo extends JpaRepository<UserRegister, Long> {
	@Query(" from UserRegister where UName=:userName")
	List selectRecordByName(@Param("userName")String name);

}
