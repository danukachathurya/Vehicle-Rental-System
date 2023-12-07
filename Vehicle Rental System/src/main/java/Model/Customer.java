package Model;

public class Customer {	
	private int id;
	private String name;
	private String email;
	private String mobileNo;
	private String userName;
	private String password;
	
	public Customer(int id, String name, String email, String mobileNo, String userName, String password) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.mobileNo = mobileNo;
		this.userName = userName;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public String getmobileNo() {
		return mobileNo;
	}

	public String getUserName() {
		return userName;
	}

	public String getPassword() {
		return password;
	}
	
	
}
