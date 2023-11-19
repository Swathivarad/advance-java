package one_one_uni.dto;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Passport {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private long pass_Num;
	private String country;
	private Date validity;
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
	public long getPass_Num() {
		return pass_Num;
	}
	public void setPass_Num(long pass_Num) {
		this.pass_Num = pass_Num;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Date getValidity() {
		return validity;
	}
	public void setValidity(Date validity) {
		this.validity = validity;
	}
	public Passport(String name, long pass_Num, String country, Date validity) {
		super();
		this.name = name;
		this.pass_Num = pass_Num;
		this.country = country;
		this.validity = validity;
	}
	public Passport() {
		super();
	}
	@Override
	public String toString() {
		return "Passport [id=" + id + ", name=" + name + ", pass_Num=" + pass_Num + ", country=" + country
				+ ", validity=" + validity + "]";
	}
	
	
	
}
