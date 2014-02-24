package com.sherry.models;

import java.util.LinkedList;





import javax.sql.DataSource;





import java.sql.*;

import com.sherry.stores.*;
public class FaultModels {
	private DataSource _ds = null;
	public FaultModels(){


	}


	public void setDatasource(DataSource _ds){
		this._ds=_ds;
		System.out.println("Set Data Source in Model"+_ds.toString());
	}


    public LinkedList<FaultsStores> getFaults(){
		LinkedList<FaultsStores> psl = new LinkedList<FaultsStores>();
		Connection Conn;
		FaultsStores ps = null;
		ResultSet rs = null;
		try {
			Conn = _ds.getConnection();
		} catch (Exception et) {


			System.out.println("No Connection in Faults Model");
			return null;
		}
		
		PreparedStatement pmst = null;
		Statement stmt = null;
		String sqlQuery = "select * from fault";
		System.out.println("Faults Query " + sqlQuery);
		try {
			try {
				// pmst = Conn.prepareStatement(sqlQuery);
				stmt = Conn.createStatement();
			} catch (Exception et) {
				System.out.println("Can't create prepare statement");
				return null;
			}
			System.out.println("Created prepare");
			try {
				// rs=pmst.executeQuery();
				rs = stmt.executeQuery(sqlQuery);
			} catch (Exception et) {
				System.out.println("Can not execut query " + et);
				return null;
			}
			System.out.println("Statement executed");
			if (rs.wasNull()) {
				System.out.println("result set was null");
			} else {
				System.out.println("Well it wasn't null");
			}
			while (rs.next()) {
				System.out.println("Getting RS");
				ps = new FaultsStores();
				ps.setIdfault(rs.getString("idfault"));
				ps.setSummary(rs.getString("summary"));
				ps.setDetails(rs.getString("details"));
				ps.setSeverity(rs.getString("severity"));
				ps.setIdreporter(rs.getString("idreporter"));
				ps.setIddeveloper(rs.getString("iddeveloper"));
				ps.setIdadmin(rs.getString("idadmin"));
				psl.add(ps);
			}
		} catch (Exception ex) {
			System.out.println("Opps, error in query " + ex);
			return null;
		}

		try {
			Conn.close();
		} catch (Exception ex) {
			return null;
		}
		return psl;

	}
    
    public LinkedList<FaultsStores> getFaultById(int idfault){
		LinkedList<FaultsStores> psl = new LinkedList<FaultsStores>();
		Connection Conn;
		FaultsStores ps = null;
		ResultSet rs = null;
		try {
			Conn = _ds.getConnection();
		} catch (Exception et) {


			System.out.println("No Connection in Faults Model");
			return null;
		}
		
		PreparedStatement pmst = null;
		Statement stmt = null;
		String sqlQuery = "select * from fault where idfault=" + idfault;
		System.out.println("Faults Query " + sqlQuery);
		try {
			try {
				// pmst = Conn.prepareStatement(sqlQuery);
				stmt = Conn.createStatement();
			} catch (Exception et) {
				System.out.println("Can't create prepare statement");
				return null;
			}
			System.out.println("Created prepare");
			try {
				// rs=pmst.executeQuery();
				rs = stmt.executeQuery(sqlQuery);
			} catch (Exception et) {
				System.out.println("Can not execut query " + et);
				return null;
			}
			System.out.println("Statement executed");
			if (rs.wasNull()) {
				System.out.println("result set was null");
			} else {
				System.out.println("Well it wasn't null");
			}
			while (rs.next()) {
				System.out.println("Getting RS");
				ps = new FaultsStores();
				ps.setIdfault(rs.getString("idfault"));
				ps.setSummary(rs.getString("summary"));
				ps.setDetails(rs.getString("details"));
				ps.setSeverity(rs.getString("severity"));
				ps.setIdreporter(rs.getString("idreporter"));
				ps.setIddeveloper(rs.getString("iddeveloper"));
				ps.setIdadmin(rs.getString("idadmin"));
				psl.add(ps);
			}
		} catch (Exception ex) {
			System.out.println("Opps, error in query " + ex);
			return null;
		}

		try {
			Conn.close();
		} catch (Exception ex) {
			return null;
		}
		return psl;

	}
    
    public LinkedList<FaultsStores> getFaultByAId(int idadmin){
		LinkedList<FaultsStores> psl = new LinkedList<FaultsStores>();
		Connection Conn;
		FaultsStores ps = null;
		ResultSet rs = null;
		try {
			Conn = _ds.getConnection();
		} catch (Exception et) {


			System.out.println("No Connection in Faults Model");
			return null;
		}
		
		PreparedStatement pmst = null;
		Statement stmt = null;
		String sqlQuery = "select * from fault where idadmin=" + idadmin;
		System.out.println("Faults Query " + sqlQuery);
		try {
			try {
				// pmst = Conn.prepareStatement(sqlQuery);
				stmt = Conn.createStatement();
			} catch (Exception et) {
				System.out.println("Can't create prepare statement");
				return null;
			}
			System.out.println("Created prepare");
			try {
				// rs=pmst.executeQuery();
				rs = stmt.executeQuery(sqlQuery);
			} catch (Exception et) {
				System.out.println("Can not execut query " + et);
				return null;
			}
			System.out.println("Statement executed");
			if (rs.wasNull()) {
				System.out.println("result set was null");
			} else {
				System.out.println("Well it wasn't null");
			}
			while (rs.next()) {
				System.out.println("Getting RS");
				ps = new FaultsStores();
				ps.setIdfault(rs.getString("idfault"));
				ps.setSummary(rs.getString("summary"));
				ps.setDetails(rs.getString("details"));
				ps.setSeverity(rs.getString("severity"));
				ps.setIdreporter(rs.getString("idreporter"));
				ps.setIddeveloper(rs.getString("iddeveloper"));
				psl.add(ps);
			}
		} catch (Exception ex) {
			System.out.println("Opps, error in query " + ex);
			return null;
		}

		try {
			Conn.close();
		} catch (Exception ex) {
			return null;
		}
		return psl;

	}
    
    public LinkedList<FaultsStores> getFaultByDId(int iddeveloper){
		LinkedList<FaultsStores> psl = new LinkedList<FaultsStores>();
		Connection Conn;
		FaultsStores ps = null;
		ResultSet rs = null;
		try {
			Conn = _ds.getConnection();
		} catch (Exception et) {


			System.out.println("No Connection in Faults Model");
			return null;
		}
		
		PreparedStatement pmst = null;
		Statement stmt = null;
		String sqlQuery = "select * from fault where iddeveloper=" + iddeveloper;
		System.out.println("Faults Query " + sqlQuery);
		try {
			try {
				// pmst = Conn.prepareStatement(sqlQuery);
				stmt = Conn.createStatement();
			} catch (Exception et) {
				System.out.println("Can't create prepare statement");
				return null;
			}
			System.out.println("Created prepare");
			try {
				// rs=pmst.executeQuery();
				rs = stmt.executeQuery(sqlQuery);
			} catch (Exception et) {
				System.out.println("Can not execut query " + et);
				return null;
			}
			System.out.println("Statement executed");
			if (rs.wasNull()) {
				System.out.println("result set was null");
			} else {
				System.out.println("Well it wasn't null");
			}
			while (rs.next()) {
				System.out.println("Getting RS");
				ps = new FaultsStores();
				ps.setIdfault(rs.getString("idfault"));
				ps.setSummary(rs.getString("summary"));
				ps.setDetails(rs.getString("details"));
				ps.setSeverity(rs.getString("severity"));
				ps.setIdreporter(rs.getString("idreporter"));
				ps.setIddeveloper(rs.getString("iddeveloper"));
				psl.add(ps);
			}
		} catch (Exception ex) {
			System.out.println("Opps, error in query " + ex);
			return null;
		}

		try {
			Conn.close();
		} catch (Exception ex) {
			return null;
		}
		return psl;

	}
    
    
    public LinkedList<FaultsStores> getFaultByRId(int idreporter){
		LinkedList<FaultsStores> psl = new LinkedList<FaultsStores>();
		Connection Conn;
		FaultsStores ps = null;
		ResultSet rs = null;
		try {
			Conn = _ds.getConnection();
		} catch (Exception et) {


			System.out.println("No Connection in Faults Model");
			return null;
		}
		
		PreparedStatement pmst = null;
		Statement stmt = null;
		String sqlQuery = "select * from fault where idreporter=" + idreporter;
		System.out.println("Faults Query " + sqlQuery);
		try {
			try {
				// pmst = Conn.prepareStatement(sqlQuery);
				stmt = Conn.createStatement();
			} catch (Exception et) {
				System.out.println("Can't create prepare statement");
				return null;
			}
			System.out.println("Created prepare");
			try {
				// rs=pmst.executeQuery();
				rs = stmt.executeQuery(sqlQuery);
			} catch (Exception et) {
				System.out.println("Can not execut query " + et);
				return null;
			}
			System.out.println("Statement executed");
			if (rs.wasNull()) {
				System.out.println("result set was null");
			} else {
				System.out.println("Well it wasn't null");
			}
			while (rs.next()) {
				System.out.println("Getting RS");
				ps = new FaultsStores();
				ps.setIdfault(rs.getString("idfault"));
				ps.setSummary(rs.getString("summary"));
				ps.setDetails(rs.getString("details"));
				ps.setSeverity(rs.getString("severity"));
				ps.setIdreporter(rs.getString("idreporter"));
				ps.setIddeveloper(rs.getString("iddeveloper"));
				psl.add(ps);
			}
		} catch (Exception ex) {
			System.out.println("Opps, error in query " + ex);
			return null;
		}

		try {
			Conn.close();
		} catch (Exception ex) {
			return null;
		}
		return psl;

	}
    
    
    public boolean addFault(String summary,String details, String severity, String idreporter,String iddeveloper,String idadmin)throws SQLException,ClassNotFoundException {
		Connection Conn = null;
//		UserStores ps = null;
//		ResultSet rs = null;
		try {
			System.out.println(_ds);
			Conn = _ds.getConnection();
		} catch (Exception et) {


			System.out.println("No Connection in User Model");
			//return null;
		}
		PreparedStatement pmst = null;
		String sqlQuery = "INSERT INTO `fault` (`summary`,`details`,`severity`,`idreporter`,`iddeveloper`,`idadmin`) VALUES (?,?,?,?,?,?);";
		System.out.println("User Query " + sqlQuery);
		System.out.println(Conn);
		pmst = Conn.prepareStatement(sqlQuery);
	//	ResultSet resultSet = pmst.executeQuery(query);
		pmst.setString(1,summary);
		pmst.setString(2,details);
		pmst.setString(3,severity);
		pmst.setString(4,idreporter);
		pmst.setString(5,iddeveloper);
		pmst.setString(6,idadmin);
		pmst.executeUpdate();
		pmst.close();
		Conn.close();	
		return true;
	}
    
    public boolean editFault(String idfault,String summary,String details,String severity,String idreporter,String iddeveloper)throws SQLException,ClassNotFoundException {
		Connection Conn = null;
//		UserStores ps = null;
//		ResultSet rs = null;
		try {
			System.out.println(_ds);
			Conn = _ds.getConnection();
		} catch (Exception et) {


			System.out.println("No Connection in User Model");
			//return null;
		}
		PreparedStatement pmst = null;
		String sqlQuery = "UPDATE fault SET summary = ?,details = ?,severity = ?,idreporter = ?, iddeveloper = ? where idfault = ?;";
		//String sqlQuery = "INSERT INTO `user` (`name`,`email`,`identity`) VALUES (?,?,?);";
		 System.out.println("Your idfault is" + idfault);
		 System.out.println("Your summary is " + summary); 
		 System.out.println("Your details is"+ details);
		 System.out.println("Your severity is"+ severity);
		 System.out.println("Your idreporter is"+ idreporter);
		 System.out.println("Your iddeveloper is"+ iddeveloper);
	     System.out.println("Query: "+sqlQuery);
		//String query =  "SELECT * FROM user";
		
		//System.out.println("User Query " + sqlQuery);
		System.out.println(Conn);
		pmst = Conn.prepareStatement(sqlQuery);
	//	ResultSet resultSet = pmst.executeQuery(query);
	    pmst.setString(1,summary);
	    pmst.setString(2,details);
		pmst.setString(3,severity);
		pmst.setString(4,idreporter);
		pmst.setString(5,iddeveloper);
	    pmst.setString(6,idfault);
		pmst.executeUpdate();
		pmst.close();
		Conn.close();	
		return true;
	}
    
    public boolean deleteAFault(int idadmin)throws SQLException,ClassNotFoundException {
		Connection Conn = null;
//		UserStores ps = null;
//		ResultSet rs = null;
		try {
			System.out.println(_ds);
			Conn = _ds.getConnection();
		} catch (Exception et) {


			System.out.println("No Connection in User Model");
			//return null;
		}
		PreparedStatement pmst = null;
		//String sqlQuery = "DELETE from fault WHERE idfault =" + idfault;
		String sqlQuery = "DELETE from fault WHERE idadmin = ?;";
		System.out.println("User Query " + sqlQuery);
		System.out.println(Conn);
		pmst = Conn.prepareStatement(sqlQuery);
	//	ResultSet resultSet = pmst.executeQuery(query);
		pmst.setInt(1,idadmin);
		pmst.executeUpdate();
		pmst.close();
		Conn.close();	
		return true;
	}
    
    public boolean deleteFault(int idfault)throws SQLException,ClassNotFoundException {
		Connection Conn = null;
//		UserStores ps = null;
//		ResultSet rs = null;
		try {
			System.out.println(_ds);
			Conn = _ds.getConnection();
		} catch (Exception et) {


			System.out.println("No Connection in User Model");
			//return null;
		}
		PreparedStatement pmst = null;
		//String sqlQuery = "DELETE from fault WHERE idfault =" + idfault;
		String sqlQuery = "DELETE from fault WHERE idfault = ?;";
		System.out.println("User Query " + sqlQuery);
		System.out.println(Conn);
		pmst = Conn.prepareStatement(sqlQuery);
	//	ResultSet resultSet = pmst.executeQuery(query);
		pmst.setInt(1,idfault);
		pmst.executeUpdate();
		pmst.close();
		Conn.close();	
		return true;
	}
    
}
