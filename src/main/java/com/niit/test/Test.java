package com.niit.test;

import com.niit.daoimpl.UserDAOImpl;
import com.niit.model.User;

public class Test 
  {
	 public static void main(String[] args)
	{
		 UserDAOImpl udi=new UserDAOImpl();
		User u=new User(123,"mohammad","nedariyamohd36@gmail.com","pass@123");
		udi.addUser(u);
	}
  }
