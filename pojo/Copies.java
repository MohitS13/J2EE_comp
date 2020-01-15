package com.app.pojo;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="copies")
public class Copies {
	private Integer id;
	private int rack;
	private BookStatus status;
	private Book book;
	
	public Copies() {
		
	}

	public Copies( int rack, BookStatus status) {
		this.rack = rack;
		this.status = status;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}

	@ManyToOne
	@JoinColumn(name="bookid")
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}

	
	
	public int getRack() {
		return rack;
	}
	public void setRack(int rack) {
		this.rack = rack;
	}

	
	@Enumerated(EnumType.STRING)
	public BookStatus getStatus() {
		return status;
	}
	public void setStatus(BookStatus status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "BookCopy [id=" + id + ", bookId=" + book + ", rack=" + rack + ", status=" + status + "]";
	}

}
