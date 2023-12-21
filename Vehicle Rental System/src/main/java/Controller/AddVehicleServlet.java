package Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.VehicleDBUtil;


@WebServlet("/AddVehicleServlet")
public class AddVehicleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		String vehicleType = request.getParameter("vehicleType");
		String vehicleName = request.getParameter("vehicleName");
		String owner = request.getParameter("owner");
		String mobileNumber = request.getParameter("mobileNumber");
		String registrationNumber = request.getParameter("registrationNumber");
		String color = request.getParameter("color");
		String seats = request.getParameter("seats");
		String manufacturedYear = request.getParameter("manufacturedYear");
		String price = request.getParameter("price");
		
		boolean isTrue;
		
		isTrue = VehicleDBUtil.addVehicle(vehicleType, vehicleName, owner, mobileNumber, registrationNumber, color, seats, manufacturedYear, price);

		if(isTrue == true){			
			RequestDispatcher dis = request.getRequestDispatcher("view.jsp");
			dis.forward(request, response);
		}else {		
			out.println("<script type = 'text/javascript'>");
			out.println("alert('unsuccessful');");
			out.println("location='addItem.jsp'");
			out.println("</script>");
		}
		
	}

}
