package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Model.DBConnect;
import Model.payment;

public class PaymentDBUtil {
	
	private static boolean isSuccess;
    private static Connection con = null;
    private static Statement stmt = null;
    private static ResultSet rs = null;

    public static boolean validate(String cardno, String cardtype) {
        try (Connection con = DBConnect.getConnection();
             PreparedStatement pstmt = con.prepareStatement("select * from payment where cardno=? and cardtype=?")) {

            pstmt.setString(1, cardno);
            pstmt.setString(2, cardtype);
            rs = pstmt.executeQuery();

            isSuccess = rs.next();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return isSuccess;
    }

    public static List<payment> getPayment(String cardno) {
        List<payment> payments = new ArrayList<>();

        try (Connection con = DBConnect.getConnection();
             PreparedStatement pstmt = con.prepareStatement("select * from payment where cardno=?")) {

            pstmt.setString(1, cardno);
            rs = pstmt.executeQuery();

            while (rs.next()) {
                int pid = rs.getInt(1);
                String cusid = rs.getString(2);
                String cusname = rs.getString(3);
                String amount = rs.getString(4);
                String cardno1 = rs.getString(5);
                String cardtype = rs.getString(6);

                payment pay = new payment(pid, cusid, cusname, amount, cardno1, cardtype);
                payments.add(pay);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return payments;
    }

    public static boolean insertpayment(String cusname, String cusid, String amount, String cardno, String cardtype) {
        isSuccess = false;
        try (Connection con = DBConnect.getConnection();
             PreparedStatement pstmt = con.prepareStatement("insert into payment values (0,?,?,?,?,?)")) {

            pstmt.setString(1, cusname);
            pstmt.setString(2, cusid);
            pstmt.setString(3, amount);
            pstmt.setString(4, cardno);
            pstmt.setString(5, cardtype);

            int rs = pstmt.executeUpdate();
            isSuccess = rs > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return isSuccess;
    }

public static boolean updatepayment(String pid, String cusname, String cusid, String amount, String cardno, String cardtype) {
	
	try {
		con = DBConnect.getConnection();
		stmt = con.createStatement();
		String sql = "update payment set cusname='"+cusname+"',cusid='"+cusid+"',amount='"+amount+"',cardno='"+cardno+"',cardtype='"+cardtype+"'"
		              + "where pid='"+pid+"'";
		
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

public static List<payment> getPaymentDetails(String Id){
	
	int convertedID = Integer.parseInt(Id);
	
	ArrayList<payment> pay = new ArrayList<>();
	
	try {
		
		con = DBConnect.getConnection();
		stmt = con.createStatement();
		String sql = "select * from payment where pid='"+convertedID+"'";
		rs = stmt.executeQuery(sql);
		
		while(rs.next()) {
			int pid = rs.getInt(1);
			String cusid = rs.getString(2);
			String cusname = rs.getString(3);
			String amount = rs.getString(4);
			String cardno = rs.getString(5);
			String cardtype = rs.getString(6);
			
			payment p = new payment(pid,cusid,cusname,amount,cardno,cardtype);
			pay.add(p);
		}
		
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	
	return pay;
}

public static boolean deletePayment(String pid){
	
	int convId = Integer.parseInt(pid);
	
	try {
		
		con = DBConnect.getConnection();
		stmt = con.createStatement();
		String sql = "delete from payment where pid='"+convId+"'";
		int r = stmt.executeUpdate(sql);
		
		if (r > 0) {
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

}
