package com.laptrinhjavaweb.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "new") 
public class NewEntity extends BaseEntity {
	//@id means not null and key primary key
	//long will convert to BIGINT in SQL
	//@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	//private long id;
	
	//name is to name the column in db
	@Column(name = "title")
	private String title;
	
	@Column(name = "thumnail")
	private String thumnail;
	
	@Column(name = "shortdescription", columnDefinition = "TEXT")
	private String shortDescription;
	
	//String will only convert to VARCHAR(255) in SQL
	//columnDefinition = "TEXT" will create TEXT in SQL
	@Column(name = "content", columnDefinition = "TEXT")
	private String content;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getThumnail() {
		return thumnail;
	}

	public void setThumnail(String thumnail) {
		this.thumnail = thumnail;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	

}
