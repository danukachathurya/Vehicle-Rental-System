package Controller;

import java.io.IOException;
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
		
		VehicleDBUtil.Validate();
		
		try {
			List<vehicle> vehicleDetails = VehicleDBUtil.Validate();
			request.setAttribute("vehicleDetails", vehicleDetails);
		} catch(Exception e){
			e.printStackTrace();
		}
		
		RequestDispatcher dis = request.getRequestDispatcher("vehicle.jsp");
		dis.forward(request, response);
	}

}
