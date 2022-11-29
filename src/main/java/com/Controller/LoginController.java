package com.Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.DAO.UserDAO;
import com.Entity.Users;
@WebServlet(urlPatterns = { "/LoginController" })
public class LoginController extends HttpServlet{

	private static final long serialVersionUID = 114145753183079163L;
	
	public static final String SUCCESS = "HomeController";
    public static final String ERROR = "views/invalid.jsp";
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			request.getRequestDispatcher("views/loginPage.jsp").forward(request, response);

	    }
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=UTF-8");
		HttpSession session = req.getSession(true);
        String url = ERROR;
        try {
            String username = req.getParameter("txtUsername");
            String password = req.getParameter("txtPassword");
            
            UserDAO dao = new UserDAO();
            Users user = dao.checkLogin(username, password);
            if (user != null) {
                session.setAttribute("USER", user);
                url = SUCCESS;
                resp.sendRedirect(url);
            }
            else {
            	System.out.println("\n\nlogin user null\n");
            }
        } catch (Exception e) {
            log("error at login servlet: " + e.toString());
            
        } 
	}
    
    
}
