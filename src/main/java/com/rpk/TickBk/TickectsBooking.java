package com.rpk.TickBk;

import java.util.Arrays;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class TickectsBooking {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="tId")
	private Integer tId;
	
	private String userName;
	private String userEmail;
	private Integer userAge;
	private Long userPhno;
	private String userGender;
	private String userBoarding;
	private String userDrop;
	private String userTime;
	private String[] userfood;
	private Double ticketCost;
	
	public Integer gettId() {
		return tId;
	}
	public void settId(Integer tId) {
		this.tId = tId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public Integer getUserAge() {
		return userAge;
	}
	public void setUserAge(Integer userAge) {
		this.userAge = userAge;
	}
	public Long getUserPhno() {
		return userPhno;
	}
	public void setUserPhno(Long userPhno) {
		this.userPhno = userPhno;
	}
	public String getUserGender() {
		return userGender;
	}
	public void setUserGender(String userGender) {
		this.userGender = userGender;
	}
	public String getUserBoarding() {
		return userBoarding;
	}
	public void setUserBoarding(String userBoarding) {
		this.userBoarding = userBoarding;
	}
	public String getUserDrop() {
		return userDrop;
	}
	public void setUserDrop(String userDrop) {
		this.userDrop = userDrop;
	}
	public String getUserTime() {
		return userTime;
	}
	public void setUserTime(String userTime) {
		this.userTime = userTime;
	}
	public String[] getUserfood() {
		return userfood;
	}
	public void setUserfood(String[] userfood) {
		this.userfood = userfood;
	}
	public Double getTicketCost() {
		return ticketCost;
	}
	public void setTicketCost(Double ticketCost) {
		this.ticketCost = ticketCost;
	}
	
	@Override
	public String toString() {
		return "TickectsBooking [tId=" + tId + ", userName=" + userName + ", userEmail=" + userEmail + ", userAge="
				+ userAge + ", userPhno=" + userPhno + ", userGender=" + userGender + ", userBoarding=" + userBoarding
				+ ", userDrop=" + userDrop + ", userTime=" + userTime + ", userfood=" + Arrays.toString(userfood)
				+ ", ticketCost=" + ticketCost + "]";
	}
	
	
}
