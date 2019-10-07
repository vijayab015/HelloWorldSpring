package com.vbharti.spring;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class DBoperation {

	public static void dbopen() throws SQLException
	{
		
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "root");

		PreparedStatement ps = con.prepareStatement("select * from Employee");
		ResultSet rs = ps.executeQuery();
		
			
		ResultSetMetaData rsmd=rs.getMetaData();  
		System.out.println(rsmd.getColumnCount());
		}
	}


