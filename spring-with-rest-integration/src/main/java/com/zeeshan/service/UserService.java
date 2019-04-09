package com.zeeshan.service;

import com.zeeshan.domain.User;

public interface UserService {

	public boolean add(User user);
	public User get(String uid);
	public boolean update(User user, String uid);
	public boolean delete(String uid);
}
