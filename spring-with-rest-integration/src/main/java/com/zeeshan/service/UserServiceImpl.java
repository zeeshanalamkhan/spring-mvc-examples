package com.zeeshan.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.zeeshan.domain.User;

@Service(value = "service")
public class UserServiceImpl implements UserService {

	public static Map<Integer, User> usersData = new HashMap<Integer, User>();

	@Override
	public boolean add(User user) {
		System.out.println("UserServiceImpl.add()");

		if (usersData.containsKey(user.getUserId())) {
			return false;
		} else {
			usersData.put(user.getUserId(), user);
			return true;
		}
	}

	@Override
	public User get(String uid) {
		System.out.println(usersData);
		if (usersData.containsKey(Integer.parseInt(uid))) {
			return usersData.get(Integer.parseInt(uid));
		}
		return null;
	}

	@Override
	public boolean update(User user, String uid) {
		if (usersData.containsKey(Integer.parseInt(uid))) {
			usersData.put(Integer.parseInt(uid), user);
			return true;
		}
		return false;
	}

	@Override
	public boolean delete(String uid) {
		if (usersData.containsKey(Integer.parseInt(uid))) {
			usersData.remove(usersData.get(Integer.parseInt(uid)));
			return true;
		}
		return false;
	}
}