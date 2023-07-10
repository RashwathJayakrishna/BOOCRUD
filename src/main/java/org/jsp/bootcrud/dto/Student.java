package org.jsp.bootcrud.dto;


import java.sql.Date;
import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@Data
@ToString
@Entity
public class Student {

	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private int id;
	
	private int physics;
	private int maths;
	private int chemistry;
	private int total;
	@NotNull(message = "please enter the name should not be null")
	private String name;
	private  String result;
//	@Pattern
	private long mobile;
	private double percentage;
//	private int age;
	@CreationTimestamp
	@Column(name="created_at" , nullable = false,updatable = false)
	private LocalDateTime createdAt;
	@UpdateTimestamp
	@Column(name = "update_at")
	private LocalDateTime updateAt;
	@Email
	private String email;
	//	public final int getAge() {
//		return age;
//	}
//	public final void setAge(int age) {
//		this.age = age;
//	}
	
	public final int getId() {
		return id;
	}
	public final String getEmail() {
		return email;
	}
	public final void setEmail(String email) {
		this.email = email;
	}
	public final LocalDateTime getCreatedAt() {
		return createdAt;
	}
	public final void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}
	public final LocalDateTime getUpdateAt() {
		return updateAt;
	}
	public final void setUpdateAt(LocalDateTime updateAt) {
		this.updateAt = updateAt;
	}
	public final void setId(int id) {
		this.id = id;
	}
	public final int getPhysics() {
		return physics;
	}
	public final void setPhysics(int physics) {
		this.physics = physics;
	}
	public final int getMaths() {
		return maths;
	}
	public final void setMaths(int maths) {
		this.maths = maths;
	}
	public final int getChemistry() {
		return chemistry;
	}
	public final void setChemistry(int chemistry) {
		this.chemistry = chemistry;
	}
	public final int getTotal() {
		return total;
	}
	public final void setTotal(int total) {
		this.total = total;
	}
	public final String getName() {
		return name;
	}
	public final void setName(String name) {
		this.name = name;
	}
	public final String getResult() {
		return result;
	}
	public final void setResult(String result) {
		this.result = result;
	}
	public final long getMobile() {
		return mobile;
	}
	public final void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public final double getPercentage() {
		return percentage;
	}
	public final void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	
	
}
