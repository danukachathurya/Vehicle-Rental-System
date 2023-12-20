package Controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.PaymentDBUtil;
import Model.payment;


@WebServlet("/UpdatePaymentServlet")
public class UpdatePaymentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String pid = request.getParameter("pid");
		String cusname = request.getParameter("cusname");
		String cusid = request.getParameter("cusid");
		String amount = request.getParameter("amount");
		String cardno = request.getParameter("cardno");
		String cardtype = request.getParameter("cardtype");
		
		boolean isTrue;
		
		isTrue = PaymentDBUtil.updatepayment(pid, cusname, cusid, amount, cardno, cardtype);
		
		if(isTrue == true) {
			List<payment> payDetails = PaymentDBUtil.getPayment(pid);
			request.setAttribute("payDetails", payDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("paymentdetails.jsp");
			dis.forward(request, response);
		}
		else {
			List<payment> payDetails = PaymentDBUtil.getPaymentDetails(pid);
			request.setAttribute("payDetails", payDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("paymentdetails.jsp");
			dis.forward(request, response);
		}
	}

}
