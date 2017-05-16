package com.newpackage;

import java.sql.*;
public class dbconnector
{ 
	
	public static void main(String args[] ) throws Exception
	{ 
	
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
		Statement st=con.createStatement();
	ResultSet rs = st.executeQuery("Select password from portal where id = 'piyush'");
	rs.next();
	String pass= rs.getString("password");
	System.out.println(pass);
	}

}
