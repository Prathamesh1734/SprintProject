package com.cg.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user_details")
public class User {
	@Id
	private int id;
	private String user_name;
	private boolean anxiety;
	private boolean depression;
	private boolean stress;
	private int age;
	private float weight;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public boolean isAnxiety() {
		return anxiety;
	}
	public void setAnxiety(boolean anxiety) {
		this.anxiety = anxiety;
	}
	public boolean isDepression() {
		return depression;
	}
	public void setDepression(boolean depression) {
		this.depression = depression;
	}
	public boolean isStress() {
		return stress;
	}
	public void setStress(boolean stress) {
		this.stress = stress;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	
	public User() {
		super();
	}
	
	public User(int id, String user_name, boolean anxiety, boolean depression, boolean stress, int age, float weight) {
		super();
		this.id = id;
		this.user_name = user_name;
		this.anxiety = anxiety;
		this.depression = depression;
		this.stress = stress;
		this.age = age;
		this.weight = weight;
	}
	
	@Override
	public String toString() {
		return "User [id=" + id + ", user_name=" + user_name + ", anxiety=" + anxiety + ", depression=" + depression
				+ ", stress=" + stress + ", age=" + age + ", weight=" + weight + "]";
	}
	
	
}


