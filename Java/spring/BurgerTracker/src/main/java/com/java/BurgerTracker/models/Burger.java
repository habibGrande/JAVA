package com.java.BurgerTracker.models;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;


@Entity
@Table(name="burgers")
public class Burger {
		@Id
 		@GeneratedValue(strategy = GenerationType.IDENTITY)
 		private Long id;
 		@NotNull
 	 	private String name;
 	 	@NotNull
 	 	private String restName;
 	 	@NotNull
 	 	@Min(value=0 , message="the rating should be 0-5")
 	 	@Max(value=5 ,message="the rating should be 0-5")
 	 	private Integer rate;
 	 	@NotNull
 	 	private String note;
	 	 
	 	@Column(updatable=false)
	    @DateTimeFormat(pattern="yyyy-MM-dd")
	    private Date createdAt;
	    @DateTimeFormat(pattern="yyyy-MM-dd")
	    private Date updatedAt;
	    
	    public Burger(){
	    	
	    }
	    public Burger(String name, String restName, Integer rate,String note) {
	    	this.name = name;
	    	this.restName = restName;
	    	this.note = note;
	    	this.rate = rate;	
	    }
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getRestName() {
			return restName;
		}
		public void setRestName(String restName) {
			this.restName = restName;
		}
		public Integer getRate() {
			return rate;
		}
		public void setRate(Integer rate) {
			this.rate = rate;
		}
		public String getNote() {
			return note;
		}
		public void setNote(String note) {
			this.note = note;
		}
		public Date getCreatedAt() {
			return createdAt;
		}
		public void setCreatedAt(Date createdAt) {
			this.createdAt = createdAt;
		}
		public Date getUpdatedAt() {
			return updatedAt;
		}
		public void setUpdatedAt(Date updatedAt) {
			this.updatedAt = updatedAt;
		}
	    
	    
	    
}
