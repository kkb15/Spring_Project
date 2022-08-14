package com.example.SmallWebapp;

import java.util.Arrays;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="tbl_reg")
public class UserRegister {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long UID;
	private String UName;
	private String EmailId;
	private String password;
	private byte Gender;
	private String Hobby[];
	public String getUName() {
		return UName;
	}
	public void setUName(String uName) {
		UName = uName;
	}
	public String getEmailId() {
		return EmailId;
	}
	public void setEmailId(String emailId) {
		EmailId = emailId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public byte getGender() {
		return Gender;
	}
	public void setGender(byte gender) {
		Gender = gender;
	}
	public String[] getHobby() {
		return Hobby;
	}
	public void setHobby(String[] hobby) {
		Hobby = hobby;
	}
	@Override
	public String toString() {
		return "UserRegister [UName=" + UName + ", EmailId=" + EmailId + ", password=" + password + ", Gender=" + Gender
				+ ", Hobby=" + Arrays.toString(Hobby) + "]";
	}
	
	

}
