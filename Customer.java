package hibernate_demo.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer {
@Id
 private int id;
 private String name;
 private String email;
 private long phone;
 private String address;
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
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public long getPhone() {
	return phone;
}
public void setPhone(long phone) {
	this.phone = phone;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
@Override
public String toString() {
	return "Customer [id=" + id + ", name=" + name + ", email=" + email + ", phone=" + phone + ", address=" + address
			+ "]";
}
public Customer(int id, String name, String email, long phone, String address) {
	super();
	this.id = id;
	this.name = name;
	this.email = email;
	this.phone = phone;
	this.address = address;
}
public Customer() {
	super();
}
 
 
 
 
 
 
}
