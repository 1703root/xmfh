package com.tedu.mapper;

import com.tedu.pojo.User;
import com.tedu.pojo.UserInfo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

import static javax.swing.text.html.HTML.Tag.P;

/**
 * Created by LYJ on 2017/3/19.
 */
@Component("userMapper")
public interface UserMapper {
    //查询全部用户信息

	//通过username和passord查询用户
	public User findByUsernameAndPassword(@Param("username") String username, @Param("password") String password);

	//保存用户信息到用户表
	@Insert("insert into user_p(user_id,username,password,create_time) values(#{id},#{username},#{password},#{time})")
	public void saveUserByUsernameAndPassword(@Param("id") String id,
                                              @Param("username") String username,
                                              @Param("password") String password, @Param("time") Date time);

	//保存用户信息到用户扩展表
	@Insert("insert into user_info_p(user_info_id,create_time) values(#{id},#{time})")
	void saveUserInfoByUsernameAndPassword(@Param("id") String id, @Param("time") Date time);

	//根据用户id查询用户信息
	public User findUserByUserId(String userId);

	//保存用户信息
	public void saveUser(User user);

	//保存用户扩展信息
	public void saveUserInfo(UserInfo userInfo);
}
