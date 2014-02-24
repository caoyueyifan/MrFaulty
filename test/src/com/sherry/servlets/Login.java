package com.sherry.servlets;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.LinkedList;












import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.sql.DataSource;












import com.sherry.lib.*;
import com.sherry.stores.*;
import com.sherry.models.*;


/**
 * Servlet implementation class Login
 */
@WebServlet(
		urlPatterns = { "/Login" }, 
		initParams = { 
				@WebInitParam(name = "data-source", value = "jdbc/faultdb")
		})
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private DataSource _ds = null;    
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		Dbutils db = new Dbutils();
		db.createSchema();
        _ds=db.assemble(config);
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		String identity = request.getParameter("identity");
		//String forward;
		UserModels usermodel = new UserModels();
		usermodel.setDatasource(_ds);
		try {
			boolean b=usermodel.login(name,password,identity);
			System.out.println(b);
			if(b) {
				HttpSession session=request.getSession(true);
				session.setAttribute("name",name);
				session.setAttribute("password", password);
				session.setAttribute("identity", identity);
				System.out.println(name);
				//forward="Main.jsp";
				if (identity.equals("Admin")){
					request.getRequestDispatcher("/AdminMain.jsp").forward(request,response);
				}
				else if(identity.equals("Reporter")){
					request.getRequestDispatcher("/ReporterMain1.jsp").forward(request,response);
				}
				else if(identity.equals("Developer")){
					request.getRequestDispatcher("/DeveloperMain1.jsp").forward(request,response);
				}
				
				//request.getRequestDispatcher("/Main.jsp").forward(request,response);
			//	RequestDispatcher dispatcher=request.getRequestDispatcher(forward);
			//	dispatcher.forward(request,response);
			}
			else{
				request.setAttribute("message", "Unknown username/password");
				request.getRequestDispatcher("/Login.jsp").forward(request,response);
				System.out.println("Error");
			}
					
		} catch (SQLException e){
			e.printStackTrace();
		}catch (ClassNotFoundException e){
			e.printStackTrace();
		}
	}

}
