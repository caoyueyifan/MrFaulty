package com.sherry.models;
import java.util.LinkedList;






import javax.sql.DataSource;







import java.sql.*;

import com.sherry.stores.*;
//import com.sherry.servlets.*;

public class UserModels {
	private DataSource _ds = null;
	public UserModels(){
	}
	public void setDatasource(DataSource _ds){
		this._ds=_ds;
		System.out.println("Set Data Source in Model"+_ds.toString());
	}
	 public LinkedList<UserStores> getUser(){
			LinkedList<UserStores> psl = new LinkedList<UserStores>();
			Connection Conn;
			UserStores ps = null;
			ResultSet rs = null;
			try {
				Conn = _ds.getConnection();
			} catch (Exception et) {


				System.out.println("No Connection in User Model");
				return null;
			}
//			PreparedStatement pmst = null;
			Statement stmt = null;
			String sqlQuery = "select * from user";
			System.out.println("User Query " + sqlQuery);
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
					ps = new UserStores();
					ps.setUserid(rs.getString("userid"));
					ps.setName(rs.getString("name"));
					ps.setEmail(rs.getString("email"));
					ps.setPassword(rs.getString("password"));
					ps.setIdentity(rs.getString("identity"));
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
	 
	 public LinkedList<UserStores> getReporter(){
			LinkedList<UserStores> psl = new LinkedList<UserStores>();
			Connection Conn;
			UserStores ps = null;
			ResultSet rs = null;
			try {
				Conn = _ds.getConnection();
			} catch (Exception et) {


				System.out.println("No Connection in User Model");
				return null;
			}
//			PreparedStatement pmst = null;
			Statement stmt = null;
			String sqlQuery = "select * from user where identity = 'reporter';";
			System.out.println("User Query " + sqlQuery);
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
					ps = new UserStores();
					ps.setUserid(rs.getString("userid"));
					ps.setName(rs.getString("name"));
					ps.setEmail(rs.getString("email"));
					ps.setPassword(rs.getString("password"));
					ps.setIdentity(rs.getString("identity"));
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
	 
	 public LinkedList<UserStores> getAdmin(){
			LinkedList<UserStores> psl = new LinkedList<UserStores>();
			Connection Conn;
			UserStores ps = null;
			ResultSet rs = null;
			try {
				Conn = _ds.getConnection();
			} catch (Exception et) {


				System.out.println("No Connection in User Model");
				return null;
			}
//			PreparedStatement pmst = null;
			Statement stmt = null;
			String sqlQuery = "select * from user where identity = 'Admin';";
			System.out.println("User Query " + sqlQuery);
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
					ps = new UserStores();
					ps.setUserid(rs.getString("userid"));
					ps.setName(rs.getString("name"));
					ps.setEmail(rs.getString("email"));
					ps.setPassword(rs.getString("password"));
					ps.setIdentity(rs.getString("identity"));
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
	 
	 
	 public LinkedList<UserStores> getDeveloper(){
			LinkedList<UserStores> psl = new LinkedList<UserStores>();
			Connection Conn;
			UserStores ps = null;
			ResultSet rs = null;
			try {
				Conn = _ds.getConnection();
			} catch (Exception et) {


				System.out.println("No Connection in User Model");
				return null;
			}
//			PreparedStatement pmst = null;
			Statement stmt = null;
			String sqlQuery = "select * from user where identity = 'Developer';";
			System.out.println("User Query " + sqlQuery);
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
					ps = new UserStores();
					ps.setUserid(rs.getString("userid"));
					ps.setName(rs.getString("name"));
					ps.setEmail(rs.getString("email"));
					ps.setPassword(rs.getString("password"));
					ps.setIdentity(rs.getString("identity"));
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
	 

	public boolean addUser(String name,String email, String password,String identity)throws SQLException,ClassNotFoundException {
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
		String sqlQuery = "INSERT INTO `user` (`name`,`email`,`password`,`identity`) VALUES (?,?,?,?);";
		
		//String query =  "SELECT * FROM user";
		
		//System.out.println("User Query " + sqlQuery);
		System.out.println(Conn);
		pmst = Conn.prepareStatement(sqlQuery);
	//	ResultSet resultSet = pmst.executeQuery(query);
		pmst.setString(1,name);
		pmst.setString(2,email);
		pmst.setString(3,password);
		pmst.setString(4,identity);
		pmst.executeUpdate();
		pmst.close();
		Conn.close();	
		return true;
	}
	public boolean login(String name, String password, String identity) throws SQLException,ClassNotFoundException{
		boolean result = false;
		Connection Conn = null;
//		UserStores ps = null;
		ResultSet rs = null;
		try {
			System.out.println(_ds);
			Conn = _ds.getConnection();
		} catch (Exception et) {


			System.out.println("No Connection in User Model");
			//return null;
		}
		PreparedStatement pmst = null;
//		Statement stmt = null;
		try {
//			String sqlQuery =  "select userid from user where name='?' AND password='?' AND identity='?'";
			String sqlQuery =  "select * from user where name = ? AND password = ? AND identity = ?";
			//stmt = Conn.prepareStatement(sqlQuery);
			pmst = Conn.prepareStatement(sqlQuery);
			 System.out.println("Your user name is " + name);          
		     System.out.println("Your password is " + password);
		     System.out.println("Your identity is " + identity);
		     System.out.println("Query: "+sqlQuery);
		     
		     pmst.setString(1, name);
		     pmst.setString(2, password);
		     pmst.setString(3, identity);
		     System.out.println(pmst);
		     rs = pmst.executeQuery();
		     
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		/* 
	     try {
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	     
		if(rs.next()) {
	    	 result = true;
	    	 String Name = rs.getString("name");
	    	 System.out.println("Welcome"+Name);
		}
		
//	     if (!rs.next()) {
//					System.out.println("Sorry, you are not a registered user!");
//	}
//	     else if(rs.next()){
//	    	 result = true;
//	    	 String Name =rs.getString(name);
//	    	 System.out.println("Welcome"+Name);
//	     }
	     pmst.close();
		 Conn.close();
	     return result;
	     }
	public boolean editUser(String userid,String name,String email,String password,String identity)throws SQLException,ClassNotFoundException {
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
		String sqlQuery = "UPDATE user SET name = ?,email = ?,password = ?, identity = ? where userid = ?;";
		//String sqlQuery = "INSERT INTO `user` (`name`,`email`,`identity`) VALUES (?,?,?);";
		System.out.println("Your userid is" + userid);
		 System.out.println("Your user name is " + name); 
		 System.out.println("Your email is"+ email);
		 System.out.println("Your password is"+ password);
	     System.out.println("Your identity is " + identity);
	     System.out.println("Query: "+sqlQuery);
		//String query =  "SELECT * FROM user";
		
		//System.out.println("User Query " + sqlQuery);
		System.out.println(Conn);
		pmst = Conn.prepareStatement(sqlQuery);
	//	ResultSet resultSet = pmst.executeQuery(query);
		//pmst.setString(1,userid);
		//pmst.setString(2,name);
		//pmst.setString(3,email);
		//pmst.setString(4, password);
		//pmst.setString(5,identity);
	    pmst.setString(1,name);
	    pmst.setString(2,email);
		pmst.setString(3,password);
	    pmst.setString(4,identity);
	    pmst.setString(5, userid);
		pmst.executeUpdate();
		pmst.close();
		Conn.close();	
		return true;
	}
	
	public boolean deleteUser(String userid)throws SQLException,ClassNotFoundException {
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
		String sqlQuery = "DELETE from user WHERE userid = ?;";
//		String sqlQuery = "INSERT INTO `user` (`name`,`email`,`password`,`identity`) VALUES (?,?,?,?);";
		
		//String query =  "SELECT * FROM user";
		
		//System.out.println("User Query " + sqlQuery);
		System.out.println(Conn);
		pmst = Conn.prepareStatement(sqlQuery);
	//	ResultSet resultSet = pmst.executeQuery(query);
		pmst.setString(1,userid);
		pmst.executeUpdate();
		pmst.close();
		Conn.close();	
		return true;
	}
	     
}