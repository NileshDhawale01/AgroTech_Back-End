package com.agrotech.agro.pojo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "AgroUser")
public class AgroUser {

	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private long contact;
	private String village;
	private String username;
	private String password;
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getContact() {
		return contact;
	}
	public void setContact(long contact) {
		this.contact = contact;
	}
	public String getVillage() {
		return village;
	}
	public void setVillage(String village) {
		this.village = village;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "AgroUser [id=" + id + ", name=" + name + ", contact=" + contact + ", village=" + village + ", username="
				+ username + ", password=" + password + "]";
	}
	
	
}
