package com.app.pojo;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name="issuerecord")
public class IssueRecord {

	private Integer id;
	private Timestamp issueDate;
	private Timestamp returnDueDate;
	private Timestamp returnDate;
	private Double fineAmount;
	private Users memeber;
	private Copies copy;
	
	public IssueRecord() {
		// TODO Auto-generated constructor stub
	} 
	
	public IssueRecord(Timestamp issued, Timestamp returnDue, Timestamp returned, Double fine) {
		super();
		this.issueDate = issued;
		this.returnDueDate = returnDue;
		this.returnDate = returned;
		this.fineAmount = fine;
	}



	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	
	@Column(name="issue_date")
	public Timestamp getIssued() {
		return issueDate;
	}
	public void setIssued(Timestamp issued) {
		this.issueDate = issued;
	}
	

	@Column(name="return_duedate")
	public Timestamp getReturnDue() {
		return returnDueDate;
	}
	public void setReturnDue(Timestamp returnDue) {
		this.returnDueDate = returnDue;
	}
	

	@Column(name="return_date")
	public Timestamp getReturned() {
		return returnDate;
	}
	public void setReturned(Timestamp returned) {
		this.returnDate = returned;
	}
	
	@Column(name="fine_amount",columnDefinition="double(5,2)")
	public Double getFine() {
		return fineAmount;
	}
	public void setFine(Double fine) {
		this.fineAmount = fine;
	}
	
	@ManyToOne
	@JoinColumn(name="memeberid")
	public Users getMemeber() {
		return memeber;
	}
	public void setMemeber(Users memeber) {
		this.memeber = memeber;
	}
	
	@ManyToOne
	@JoinColumn(name="copyid")
	public Copies getCopy() {
		return copy;
	}
	public void setCopy(Copies copy) {
		this.copy = copy;
	}
	
	
	@Override
	public String toString() {
		return "IssueRecord [id=" + id + ", issued=" + issueDate + ", returnDue=" + returnDueDate + ", returned=" + returnDate
				+ ", fine=" + fineAmount + "]";
	}
	
	
}
