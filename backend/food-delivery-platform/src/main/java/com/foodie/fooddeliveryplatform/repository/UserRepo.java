package com.foodie.fooddeliveryplatform.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.foodie.fooddeliveryplatform.entity.User;

import jakarta.transaction.Transactional;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {
	
	@Modifying
	@Transactional
	@Query("update User set password=:updatedPassword where email=:mailId")
	public int updateUserPassword(@Param("updatedPassword") String passWord,@Param("mailId") String mail);

}
