package com.app.pojo;

import java.sql.Timestamp;

import javax.persistence.*;

@Entity
@Table(name="payments")
public class Payments {

	private Integer id;
	private double amount;
	private PayType type;
	private Timestamp transactionTime;
	private Timestamp nextpaymentDueDate;
	private Users user;
	
	public Payments() {
		// TODO Auto-generated constructor stub
	}
	
	public Payments(double amount, PayType type, Timestamp txTime, Timestamp dueDate) {
		super();
		this.amount = amount;
		this.type = type;
		this.transactionTime = txTime;
		this.nextpaymentDueDate = dueDate;
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	@Column(name = "amount", columnDefinition = "double(5,2)")
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	@Enumerated(EnumType.STRING)
	@Column(name="type")
	public PayType getType() {
		return type;
	}
	public void setType(PayType type) {
		this.type = type;
	}


	@Column(name="transaction_time")
	public Timestamp getTransactionTime() {
		return transactionTime;
	}
	public void setTransactionTime(Timestamp txTime) {
		this.transactionTime = txTime;
	}
	
	
	
	@Column(name="nextpayment_duedate")
	public Timestamp getNextpaymentDueDate() {
		return nextpaymentDueDate;
	}
	public void setNextpaymentDueDate(Timestamp dueDate) {
		this.nextpaymentDueDate = dueDate;
	}
	
	@ManyToOne
	@JoinColumn(name="userid")
	public Users getUser() {
		return user;
	}
	public void setUser(Users user) {
		this.user = user;
	}
	
	
	@Override
	public String toString() {
		return "Payments [id=" + id + ", amount=" + amount + ", type=" + type + ", txTime=" + transactionTime + ", dueDate="
				+ nextpaymentDueDate + "]";
	}
	
	
	
	

}
