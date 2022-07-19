package com.appln.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.appln.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	

}
