package many_one_uni.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String c_name;
	private String location;
	private String o_email;
	private String c_website;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getC_name() {
		return c_name;
	}
	public void setC_name(String c_name) {
		this.c_name = c_name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getO_email() {
		return o_email;
	}
	public void setO_email(String o_email) {
		this.o_email = o_email;
	}
	public String getC_website() {
		return c_website;
	}
	public void setC_website(String c_website) {
		this.c_website = c_website;
	}
	public Company(String c_name, String location, String o_email, String c_website) {
		super();
		this.c_name = c_name;
		this.location = location;
		this.o_email = o_email;
		this.c_website = c_website;
	}
	public Company() {
		super();
	}
	@Override
	public String toString() {
		return "Company [id=" + id + ", c_name=" + c_name + ", location=" + location + ", o_email=" + o_email
				+ ", c_website=" + c_website + "]";
	}
	
	
	
	
}
