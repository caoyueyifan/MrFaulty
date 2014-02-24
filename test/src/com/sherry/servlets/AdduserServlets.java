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
 * Servlet implementation class AdduserServlets
 */
@WebServlet(
		urlPatterns = { 
				"/AdduserServlets", 
				"/AdduserServlet/*"
		}, 
		initParams = { 
				@WebInitParam(name = "data-source", value = "jdbc/faultdb")
		})
public class AdduserServlets extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private DataSource _ds = null;  
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdduserServlets() {
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
		System.out.println("AdduserServlets.doPost()");
		String Name=request.getParameter("name");
		String Email=request.getParameter("email");
		String Password=request.getParameter("password");
		String Identity=request.getParameter("identity");
		UserModels usermodel = new UserModels();
		usermodel.setDatasource(_ds);
		request.getSession().getAttribute("name");
		request.getSession().getAttribute("email");
		request.getSession().getAttribute("password");
		request.getSession().getAttribute("identity");
		//request.getRequestDispatcher("Login.jsp").forward(request, response);
		String forward;
		try {
			boolean b=usermodel.addUser(Name,Email,Password,Identity);
			if(b) {
				HttpSession session=request.getSession(true);
				session.setAttribute("name",Name);
				session.setAttribute("email",Email);
				session.setAttribute("password", Password);
				session.setAttribute("identity", Identity);
				System.out.println(session);
				if (Identity.equals("Admin")){
					request.getRequestDispatcher("/Adminadded.jsp").forward(request,response);
				}
				else if(Identity.equals("Reporter")){
					request.getRequestDispatcher("/Reporteradded.jsp").forward(request,response);
				}
				else if(Identity.equals("Developer")){
					request.getRequestDispatcher("/Developeradded.jsp").forward(request,response);
				}
				/*forward="/UserAdded.jsp";
				RequestDispatcher dispatcher=request.getRequestDispatcher(forward);
				dispatcher.forward(request,response);*/
			}
			else{
				System.out.println("Error");
			}
					
		} catch (SQLException e){
			e.printStackTrace();
		}catch (ClassNotFoundException e){
			e.printStackTrace();
		}
		}
	}
/*		String authority="0";
		if(identity.equals("Admin")){
			authority="1";
		}
		if(identity.equals("Reporter")){
			authority="2";
		}
		if(identity.equals("Developer")){
			authority="3";
		}*/
	


