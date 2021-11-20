package com.test.webapp.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.test.webapp.beans.User;
import com.test.webapp.dao.UserDao;

@Repository
public class UserRepository implements UserDao{

	@Autowired
	private JdbcTemplate jdbcTemplte;
	
	@Override
	public boolean registerUser(User user) {
		String sql = "INSERT INTO user_registration(name,email,phone) VALUES(?,?,?)";
		int i = jdbcTemplte.update(sql, new Object[] {user.getName(),user.getEmail(),user.getPhone()});
		if(i>0)
			return true;
		return false;
	}
}
