package model;

public class User {
	private int id;
	private String uname,email,upass;
	
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User( String uname, String email, String upass) {
		this.uname = uname;
		this.email = email;
		this.upass = upass;
	}
	
	public User(int id, String uname, String email, String upass) {
		super();
		this.id = id;
		this.uname = uname;
		this.email = email;
		this.upass = upass;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUpass() {
		return upass;
	}
	public void setUpass(String upass) {
		this.upass = upass;
	}
	
	
	

}
