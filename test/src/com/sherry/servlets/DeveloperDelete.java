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
 * Servlet implementation class DeveloperDelete
 */
@WebServlet(
		urlPatterns = { "/DeveloperDelete/*" }, 
		initParams = { 
				@WebInitParam(name = "data-source", value = "jdbc/faultdb")
		})
public class DeveloperDelete extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private DataSource _ds = null;     
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeveloperDelete() {
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
		String args[]=Convertors.SplitRequestPath(request);
		System.out.println(args.length);
		String Userid = args[2];
		//String idFault =request.getParameter("idfault");
		UserModels usermodel = new UserModels();
		usermodel.setDatasource(_ds);
		String forward;
		try {
			boolean b=usermodel.deleteUser(Userid);
			if(b) {
				HttpSession session=request.getSession(true);
				session.setAttribute("userid",Userid);
				System.out.println(session);
				forward="/Developerdeleted.jsp";
				RequestDispatcher dispatcher=request.getRequestDispatcher(forward);
				dispatcher.forward(request,response);
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

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
