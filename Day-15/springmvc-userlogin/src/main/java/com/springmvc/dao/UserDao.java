package com.springmvc.dao;

import com.springmvc.model.Login;
import com.springmvc.model.User;

public interface UserDao {

	int register(User user);

	User validateUser(Login login);
}
