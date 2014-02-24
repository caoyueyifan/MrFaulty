package com.sherry.servlets;

import java.io.IOException;
import java.sql.SQLException;

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

import com.sherry.lib.Dbutils;
import com.sherry.models.FaultModels;

/**
 * Servlet implementation class EditfaultServlet
 */
@WebServlet(
		urlPatterns = { 
				"/EditfaultServlet", 
				"/EditfaultServlets/*"
		}, 
		initParams = { 
				@WebInitParam(name = "data-source", value = "jdbc/faultdb")
		})
public class EditfaultServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private DataSource _ds = null;   
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditfaultServlet() {
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
		System.out.println("EditfaultServlet.doPost()");
		String Faultid=request.getParameter("idfault");
		String Summary=request.getParameter("summary");
		String Details=request.getParameter("details");
		String Severity=request.getParameter("severity");
		String Reporterid=request.getParameter("idreporter");
		String Developerid=request.getParameter("iddeveloper");
		FaultModels faultmodel = new FaultModels();
		faultmodel.setDatasource(_ds);
		request.getSession().getAttribute("idfault");
		request.getSession().getAttribute("summary");
		request.getSession().getAttribute("details");
		request.getSession().getAttribute("severity");
		request.getSession().getAttribute("idreporter");
		request.getSession().getAttribute("iddeveloper");
		String forward;
		try {
			boolean b=faultmodel.editFault(Faultid,Summary,Details,Severity,Reporterid,Developerid);
			if(b) {
				HttpSession session=request.getSession(true);
				session.setAttribute("idfault",Faultid);
				session.setAttribute("summary",Summary);
				session.setAttribute("details",Details);
				session.setAttribute("severity", Severity);
				session.setAttribute("identity", Reporterid);
				session.setAttribute("identity", Developerid);
				System.out.println(session);
				forward="/Faultchanged.jsp";
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

}
