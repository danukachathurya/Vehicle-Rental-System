package Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.PaymentDBUtil;

@WebServlet("/PaymentInsertServlet")
public class PaymentInsertServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            String cusname = request.getParameter("cusname");
            String cusid = request.getParameter("cusid");
            String amount = request.getParameter("amount");
            String cardno = request.getParameter("cardno");
            String cardtype = request.getParameter("cardtype");

            boolean isSuccess = PaymentDBUtil.insertpayment(cusname, cusid, amount, cardno, cardtype);

            if (isSuccess) {
                RequestDispatcher dis = request.getRequestDispatcher("carddetails.jsp");
                dis.forward(request, response);
                System.out.println("1");
            } else {
                RequestDispatcher dis2 = request.getRequestDispatcher("insertpayment.jsp");
                dis2.forward(request, response);
                System.out.println("2");
            }
        } catch (Exception e) {
            e.printStackTrace();
            response.sendRedirect("error.jsp");
        }
    }
}
