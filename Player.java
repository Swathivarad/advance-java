package hibernate_2.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Player {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String name;
	private double strike_rate;
	private String country;
	private String role;
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
	public double getStrike_rate() {
		return strike_rate;
	}
	public void setStrike_rate(double strike_rate) {
		this.strike_rate = strike_rate;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "Player [id=" + id + ", name=" + name + ", strike_rate=" + strike_rate + ", country=" + country
				+ ", role=" + role + "]";
	}
	public Player( String name, double strike_rate, String country, String role) {
		super();
		this.name = name;
		this.strike_rate = strike_rate;
		this.country = country;
		this.role = role;
	}
	public Player() {
		super();
	}
	

}
