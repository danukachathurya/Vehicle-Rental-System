package Dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Model.DBConnect;
import Model.vehicle;

public class VehicleDBUtil {
	private static boolean isSuccess;
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
	
	// Retrive Payments
	public static List<vehicle> getAllPayment() {
		List<vehicle> vehicle = new ArrayList<>();
		
		try {
			con = DBConnect.getConnection();
            stmt = con.createStatement();
            String sql = "SELECT * FROM vehicle";
            rs = stmt.executeQuery(sql);
            
            while(rs.next()) {
            	int pid = rs.getInt(1);
            	String vehicleType = rs.getString(2);
            	String vehicleName = rs.getString(3);
            	String owner = rs.getString(4);
            	String mobileNumber = rs.getString(5);
            	String registrationNumber = rs.getString(6);
            	String color = rs.getString(7);
            	String seats = rs.getString(8);
            	String manufacturedYear = rs.getString(9);
            	String price = rs.getString(10);
            	
            	vehicle Vehicle = new vehicle(pid, vehicleType, vehicleName, owner, mobileNumber, registrationNumber, color, seats, manufacturedYear, price);
            	vehicle.add(Vehicle);
            }
            
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return vehicle;
		
	}
	
	//Insert vehicle
	public static boolean addVehicle(String vehicleType, String vehicleName, String owner, String mobileNumber, String registrationNumber, String color, String seats, String manufacturedYear, String price) {
		
		boolean isSuccess = true;
		
		try {
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "insert into vehicle values ('0','"+vehicleType+"','"+vehicleName+"','"+owner+"','"+mobileNumber+"','"+registrationNumber+"','"+color+"','"+seats+"','"+manufacturedYear+"','"+price+"')";
			int rs = stmt.executeUpdate(sql);
			
			if(rs > 0) {
				isSuccess = true;
			}
			else {
				isSuccess = false;
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return isSuccess;
	}
	
	//Validate
	
	public static List<vehicle> Validate() {
		
		ArrayList<vehicle> pay = new ArrayList<>();
		
		try {
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "select * from vehicle";
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				int pid = rs.getInt(1);
            	String vehicleType = rs.getString(2);
            	String vehicleName = rs.getString(3);
            	String owner = rs.getString(4);
            	String mobileNumber = rs.getString(5);
            	String registrationNumber = rs.getString(6);
            	String color = rs.getString(7);
            	String seats = rs.getString(8);
            	String manufacturedYear = rs.getString(9);
            	String price = rs.getString(10);
            	
            	vehicle Vehicle = new vehicle(pid, vehicleType, vehicleName, owner, mobileNumber, registrationNumber, color, seats, manufacturedYear, price);
            	pay.add(Vehicle); 
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return pay;
		
	}
	
	//update
	public static boolean updateVehicle(int id, String vehicleType, String vehicleName, String owner, String mobileNumber, String registrationNumber, String color, String seats, String manufacturedYear, String price) {
		boolean isSuccess = false;
		
		try {
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "update vehicle set vehicleType = '"+vehicleType+"', vehicleName = '"+vehicleName+"', owner = '"+owner+"', mobileNumber = '"+mobileNumber+"', color = '"+color+"', seats = '"+seats+"', manufacturedYear = '"+manufacturedYear+"', price = '"+price+"'" + " where id = '"+id+"'";
			int rs = stmt.executeUpdate(sql);
			
			if(rs > 0) {
				isSuccess = true;
			}else {
				isSuccess = false;
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return isSuccess;
		
	}
	
	//Delete
	public static boolean deleteVehicle(String id) {
		boolean isSuccess = false;
		int convertedid = Integer.parseInt(id);
		
		try {
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "delete from vehicle where id = '"+convertedid+"'";
			int r = stmt.executeUpdate(sql);
			
			if( r > 0 ) {
				isSuccess = true;
			}else {
				isSuccess = false;
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return isSuccess;
	}
	
}
