package Model;

public class vehicle {
	private int id;
	private String vehicleType;
	private String vehicleName;
	private String owner;
	private String mobileNumber;
	private String registrationNumber;
	private String color;
	private String seats;
	private String manufacturedYear;
	private String price;
	
	public vehicle(int id, String vehicleType, String vehicleName, String owner, String mobileNumber,
			String registrationNumber, String color, String seats, String manufacturedYear, String price) {
		super();
		this.id = id;
		this.vehicleType = vehicleType;
		this.vehicleName = vehicleName;
		this.owner = owner;
		this.mobileNumber = mobileNumber;
		this.registrationNumber = registrationNumber;
		this.color = color;
		this.seats = seats;
		this.manufacturedYear = manufacturedYear;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public String getVehicleType() {
		return vehicleType;
	}

	public String getVehicleName() {
		return vehicleName;
	}

	public String getOwner() {
		return owner;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public String getRegistrationNumber() {
		return registrationNumber;
	}

	public String getColor() {
		return color;
	}
	
	public String getSeats() {
		return seats;
	}

	public String getManufacturedYear() {
		return manufacturedYear;
	}	
	
	public String Price() {
		return price;
	}
	
}
