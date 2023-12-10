package Dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Model.Customer;
import Model.DBConnect;

public class CustomerDBUtil {
	
	private static boolean isSuccess;
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
	
	public static List<Customer> validate(String userName, String password) {
		
		ArrayList<Customer> cus = new ArrayList<>();
		
		//validate
		
		try {
			con = DBConnect.getConnection(); // call DBConnect class
			stmt = con.createStatement();
			String sql = "select * from customer where userName='"+userName+"' and password='"+password+"'"; // write query			
			rs = stmt.executeQuery(sql); // for run sql query
			
			if(rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String email = rs.getString(3);
				String mobileNo = rs.getString(4);
				String username = rs.getString(5);
				String password1 = rs.getString(6);
				
				//create customer object
				Customer c = new Customer(id, name, email, mobileNo, username, password1);
				
				//pass arraylist object to customer object
				cus.add(c);
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return cus;
		
	}
	
public static boolean updatecustomer(String id, String name, String email, String mobileNo, String userName, String password) {
    	
    	try {
    		
    		con = DBConnect.getConnection();
    		stmt = con.createStatement();
    		String sql = "update customer set name='"+name+"',email='"+email+"',mobileNo='"+mobileNo+"',userName='"+userName+"',password='"+password+"'"
    				+ "where id='"+id+"'";
    		int rs = stmt.executeUpdate(sql);
    		
    		if(rs > 0) {
    			isSuccess = true;
    		}
    		else {
    			isSuccess = false;
    		}
    		
    	}
    	catch(Exception e) {
    		e.printStackTrace();
    	}
    	
    	return isSuccess;
    }

public static List<Customer> getCustomerDetails(String id) {
	
	int convId = Integer.parseInt(id);
	
	ArrayList<Customer> customer = new ArrayList<>();
	
	try {
		
		con = DBConnect.getConnection();
		stmt = con.createStatement();
		String sql = "select * from customer where id='"+convId+"'";
		rs = stmt.executeQuery(sql);
		
		while (rs.next()) {
			int id1 = rs.getInt(1);
			String name = rs.getString(2);
			String email = rs.getString(3);
			String phone = rs.getString(4);
			String username = rs.getString(5);
			String password = rs.getString(6);
			
			Customer cus = new Customer(id1,name,email,phone,username,password);
			customer.add(cus);
		}
		
	} catch (Exception e) {
		
	}
	
	return customer;	
}

public static boolean deleteCustomer(String id) {
		
		int convId = Integer.parseInt(id);
		
		try {
			
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "delete from customer where id='"+convId+"'";
			int rs = stmt.executeUpdate(sql);
			
			if(rs > 0) {
				isSuccess = true;
			}
			else {
				isSuccess = false;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	
		return isSuccess;	
	}

		
}


