package com.app.pojo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="users")
public class Users {

	private Integer id;
	private String name;
	private String email;
	private String phone;
	private String password;
	private Role role;
	private List<Payments> paymentList = new ArrayList<>();
	private List<IssueRecord> issurRecordList = new ArrayList<>();
	
	public Users() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Users(String name, String email, String phone, String password, Role role) {
		super();
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.password = password;
		this.role = role;
	}



	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	@Column(length=15)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Column(length=15,unique=true)
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Column(length=15)
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	@Column(length=15,nullable=false)
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Enumerated(EnumType.STRING)
	@Column(length=10)
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	
	@OneToMany(mappedBy="user",cascade=CascadeType.ALL,orphanRemoval=true)
	public List<Payments> getPaymentList() {
		return paymentList;
	}
	public void setPaymentList(List<Payments> paymentList) {
		this.paymentList = paymentList;
	}
	
	@OneToMany(mappedBy="memeber",cascade=CascadeType.ALL,orphanRemoval=true)
	public List<IssueRecord> getIssurRecordList() {
		return issurRecordList;
	}
	public void setIssurRecordList(List<IssueRecord> issurRecordList) {
		this.issurRecordList = issurRecordList;
	}


	@Override
	public String toString() {
		return "Users [id=" + id + ", name=" + name + ", email=" + email + ", phone=" + phone + ", role=" + role + "]";
	}
	
	
	
}
