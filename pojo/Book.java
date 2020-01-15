package com.app.pojo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="books")
public class Book {
	private Integer id;
	private String name;
	private String author;
	private String subject;
	private double price;
	private String isbn;
	private List<Copies> copyList = new ArrayList<>();
	
	public Book() {
	}

	public Book(String name, String author, String subject, double price, String isbn) {
		super();
		this.name = name;
		this.author = author;
		this.subject = subject;
		this.price = price;
		this.isbn = isbn;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}

	@Column(length=20)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Column(length=20)
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}

	@Column(length=20)
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}

	@Column(name = "amount", columnDefinition = "double(5,2)")
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

	@Column(length=20)
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	
	@OneToMany(mappedBy="book",cascade=CascadeType.ALL,orphanRemoval=true)
	public List<Copies> getCopyList() {
		return copyList;
	}
	public void setCopyList(List<Copies> copyList) {
		this.copyList = copyList;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", author=" + author + ", subject=" + subject + ", price=" + price
				+ ", isbn=" + isbn + "]";
	}
	
	
	
}