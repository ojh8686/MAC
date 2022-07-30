package com.mac.demo.model;

import java.sql.Date;

import org.springframework.stereotype.Component;

@Component
public class User {

	private int numMac;     //번호
	private String nameMac; //이름
	private java.sql.Date birthMac; //생년월일
	private String idMac; //아이디
	private String pwMac;  //비밀번호
	private String phoneNumMac;  //전화번호
	private String nickNameMac; //닉네임
	private String genderMac; //성별
	private String cityMac; //시
	private String townMac; //구
	private String villageMac; //동
	private String emailMac; //이메일
	private int managerMac; //관리자권환 유무
	
	
	public int getNumMac() {
		return numMac;
	}
	public void setNumMac(int numMac) {
		this.numMac = numMac;
	}
	public String getNameMac() {
		return nameMac;
	}
	public void setNameMac(String nameMac) {
		this.nameMac = nameMac;
	}
	
	public java.sql.Date getBirthMac() {
		return birthMac;
	}
	public void setBirthMac(java.sql.Date birthMac) {
		this.birthMac = birthMac;
	}
	public String getIdMac() {
		return idMac;
	}
	public void setIdMac(String idMac) {
		this.idMac = idMac;
	}
	public String getPwMac() {
		return pwMac;
	}
	public void setPwMac(String pwMac) {
		this.pwMac = pwMac;
	}
	public String getPhoneNumMac() {
		return phoneNumMac;
	}
	public void setPhoneNumMac(String phoneNumMac) {
		this.phoneNumMac = phoneNumMac;
	}
	public String getNickNameMac() {
		return nickNameMac;
	}
	public void setNickNameMac(String nickNameMac) {
		this.nickNameMac = nickNameMac;
	}
	public String getGenderMac() {
		return genderMac;
	}
	public void setGenderMac(String genderMac) {
		this.genderMac = genderMac;
	}
	public String getCityMac() {
		return cityMac;
	}
	public void setCityMac(String cityMac) {
		this.cityMac = cityMac;
	}
	public String getTownMac() {
		return townMac;
	}
	public void setTownMac(String townMac) {
		this.townMac = townMac;
	}
	public String getVillageMac() {
		return villageMac;
	}
	public void setVillageMac(String villageMac) {
		this.villageMac = villageMac;
	}
	public String getEmailMac() {
		return emailMac;
	}
	public void setEmailMac(String emailMac) {
		this.emailMac = emailMac;
	}
	public int getManagerMac() {
		return managerMac;
	}
	public void setManagerMac(int managerMac) {
		this.managerMac = managerMac;
	}
}