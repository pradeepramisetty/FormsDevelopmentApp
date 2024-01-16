package com.rpk.studtls;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class StudentRegistratin {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="sId")
	private Integer sId;
	
	private String sName;
	private String sGender;
	private Integer sAge;
	private String sAdrs;
	private long sPhno;
	
	public Integer getsId() {
		return sId;
	}
	public void setsId(Integer sId) {
		this.sId = sId;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public String getsGender() {
		return sGender;
	}
	public void setsGender(String sGender) {
		this.sGender = sGender;
	}
	public Integer getsAge() {
		return sAge;
	}
	public void setsAge(Integer sAge) {
		this.sAge = sAge;
	}
	public String getsAdrs() {
		return sAdrs;
	}
	public void setsAdrs(String sAdrs) {
		this.sAdrs = sAdrs;
	}
	public long getsPhno() {
		return sPhno;
	}
	public void setsPhno(long sPhno) {
		this.sPhno = sPhno;
	}
	
	@Override
	public String toString() {
		return "StudentRegistratin [sId=" + sId + ", sName=" + sName + ", sGender=" + sGender + ", sAge=" + sAge
				+ ", sAdrs=" + sAdrs + ", sPhno=" + sPhno + "]";
	}
	
	
}
