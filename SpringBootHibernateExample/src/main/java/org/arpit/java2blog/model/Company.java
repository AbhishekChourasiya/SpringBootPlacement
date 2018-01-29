package org.arpit.java2blog.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="COMPANY")
public class Company {
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	
	@Column(name="companyName")
	String companyName; 

	@Column(name="email")
	String email;
	
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	

	
	@Column(name="Profile")
	private String Profile;
	
	@Column(name="JD")
	private String JD;
	
	
	@Column(name="CTC")
	private long CTC;

	
	public Company() {
		
	}


	public Company(int id,String email, String companyName, String profile, String JD, long CTC) {
		super();
		this.id = id;
		this.email=email;
		this.companyName = companyName;
		this.Profile = profile;
		this.JD = JD;
		this.CTC = CTC;
	}


	public String getProfile() {
		return Profile;
	}
	public void setProfile(String Profile) {
		this.Profile = Profile;
	}
	public String getJD() {
		return JD;
	}
	public void setJD(String JD) {
		this.JD = JD;
	}
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	


	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getJobProfile() {
		return Profile;
	}


	public void setJobProfile(String Profile) {
		this.Profile = Profile;
	}


	public String getJobDescription() {
		return JD;
	}


	public void setJobDescription(String jobDescription) {
		this.JD = jobDescription;
	}


	
	public long getCTC() {
		return CTC;
	}


	public void setCTC(long cTC) {
		CTC = cTC;
	}
	
	
}
