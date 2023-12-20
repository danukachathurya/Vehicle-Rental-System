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

import Dao.PaymentDBUtil;
import Model.payment;

@WebServlet("/CardServlet")
public class CardServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
         
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		String cardno = request.getParameter("cardno");
		String cardtype = request.getParameter("cardtype");
		boolean isTrue;
		
		isTrue = PaymentDBUtil.validate(cardno, cardtype);
		
		if(isTrue == true) {
			List<payment> payDetails = PaymentDBUtil.getPayment(cardno);
			request.setAttribute("payDetails", payDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("paymentdetails.jsp");
			dis.forward(request, response);
		}
		else {
			out.println("<script type='text/javascript'>");
			out.println("alert('Your cardno or cardtype is incorrect');");
			out.println("location='carddetails.jsp'");
			out.println("</script>");
		}
	}

}
