package com.tedu.service;

import com.tedu.pojo.User;

import java.util.List;

/**
 * Created by LYJ on 2017/3/19.
 */
public interface UserService {

	public User findByUsernameAndPassword(String name, String password);

	public void saveUserByUsernameAndPassword(String username, String password);

    public User findUserByUserId(String userId);

	public void saveUser(User user);
}
