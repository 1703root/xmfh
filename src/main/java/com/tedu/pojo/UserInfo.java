package com.tedu.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserInfo extends BaseEntity{

	@Id
	 private String userInfoId;
	 private String name;			//姓名
	 private Integer age;			//年龄
	 private String sex;			//性别
	 private String phone;			//电话
	 private String mail;			//邮箱
	 private String card;			//身份证号
	public String getUserInfoId() {
		return userInfoId;
	}
	public void setUserInfoId(String userInfoId) {
		this.userInfoId = userInfoId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getCard() {
		return card;
	}

	public void setCard(String card) {
		this.card = card;
	}

}
