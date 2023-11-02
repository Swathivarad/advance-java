package student.dto;

public class studentdetails {
	private int id;
	private String name;
	private String email;
	private String password;
	private long phoneno;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public long getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(long phoneno) {
		this.phoneno = phoneno;
	}
	public studentdetails(int id, String name, String email, String password, long phoneno) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
		this.phoneno = phoneno;
	}
	@Override
	public String toString() {
		return "studentdetails [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password
				+ ", phoneno=" + phoneno + "]";
	}
	
	

}
