package com.foodie.fooddeliveryplatform.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.foodie.fooddeliveryplatform.entity.User;
import com.foodie.fooddeliveryplatform.model.UserModel;
import com.foodie.fooddeliveryplatform.repository.UserRepo;

@Service
public class UserService {

	@Autowired
	UserRepo userRepo;
	
	@Autowired
	ModelMapper modelMapper;

	public void saveUser(User user) {
		userRepo.save(user);
	}
	
	public UserModel getUserById(int userId)
	{
		User user = userRepo.findById(userId).get();
		UserModel userModel = modelMapper.map(user, UserModel.class);
		return userModel;
	}
	
	public int passwordUpadte(String passWord,String mail)
	{
		int passwordGetModify = 0;
		passwordGetModify = userRepo.updateUserPassword(passWord, mail);
		
		if(passwordGetModify==1)
		{
			passwordGetModify = 1;
		}
		
		else
		{
			System.out.println("Having some problem");
		}
		
		return passwordGetModify;
	}

}
