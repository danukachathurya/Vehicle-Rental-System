package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.VehicleDBUtil;
import Model.vehicle;


@WebServlet("/ViewVehicleServlet")
public class ViewVehicleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		String registrationNumber = request.getParameter("registrationNumber");
		
		boolean isTrue;
		isTrue= VehicleDBUtil.getDetails(registrationNumber) ;
		
		if(isTrue== true) {
			List<vehicle> vehicleDetails = VehicleDBUtil.Validate() ;
			request.setAttribute("vehicleDetails", vehicleDetails) ;
			
			RequestDispatcher dis = request.getRequestDispatcher("vehicleDetails.jsp");
			dis.forward(request, response);
		}else {
			out.println("<script type='text/javascript'>");
			out.println("alert('It is not available');");
			out.println("location='entry.jsp'");
			out.println("</script>");
		}
	}

}
