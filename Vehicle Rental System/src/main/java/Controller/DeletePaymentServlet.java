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


@WebServlet("/DeletePaymentServlet")
public class DeletePaymentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String pid = request.getParameter("pid");
		boolean isTrue;
		
		isTrue = PaymentDBUtil.deletePayment(pid);
		
		if (isTrue == true) {
			RequestDispatcher dispatcher = request.getRequestDispatcher("insertpayment.jsp");
			dispatcher.forward(request, response);
		}
		else {
			List<payment> payDetails = PaymentDBUtil.getPaymentDetails(pid);
			request.setAttribute("payDetails", payDetails);
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("paymentdetails.jsp");
			dispatcher.forward(request, response);
		}
	}

}
