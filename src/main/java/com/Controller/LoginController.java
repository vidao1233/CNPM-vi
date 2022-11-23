package com.Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.DAO.UserDAO;
import com.Entity.Users;

public class LoginController extends HttpServlet{

	private static final long serialVersionUID = 114145753183079163L;
	
	public static final String SUCCESS = "default.jsp";
    public static final String ERROR = "invalid.jsp";
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 response.setContentType("text/html;charset=UTF-8");
	        HttpSession session = request.getSession(true);
	        String url = ERROR;
	        try {
	            String userID = request.getParameter("txtUserID");
	            String password = request.getParameter("txtPassword");
	            UserDAO dao = new UserDAO();
	            Users user = dao.checkLogin(userID, password);
	            if (user != null) {
	                session.setAttribute("USER", user);
	                url = SUCCESS;
	            }
	        } catch (Exception e) {
	            log("error at login servlet: " + e.toString());
	        } finally {
	            response.sendRedirect(url);
	        }
	    }
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}
    
    
}
