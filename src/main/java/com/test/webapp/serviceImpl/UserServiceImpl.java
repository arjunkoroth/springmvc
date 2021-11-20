package com.test.webapp.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.webapp.beans.User;
import com.test.webapp.dao.UserDao;
import com.test.webapp.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDao userDao;

	@Override
	public boolean registerUser(User user) {
		return userDao.registerUser(user);
	}
}
