package com.arco.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import com.arco.bo.EmployeeBO;

public class EmployeeImpl implements EmployeeDAO {

private static final String INSERT_EMP_QUERY="INSERT INTO EMPLOYEE VALUES(EMPID.NEXTVAL,?,?,?,?,?)";
	
	private DataSource ds;
	public EmployeeImpl(DataSource ds) {
		this.ds=ds;
	}
	@Override
	public int insert(EmployeeBO bo) throws Exception {
		
		Connection con=null;
		PreparedStatement ps=null;
		int count=0;
		
		//get JDBC connection for pool connection
		con=ds.getConnection();
		
		//create prepaired statement
		ps=con.prepareStatement(INSERT_EMP_QUERY);
		
		//set BO data as query param
		ps.setString(1,bo.getName());
		ps.setString(2,bo.getPosition());
		ps.setDouble(3,bo.getBasic());
		ps.setDouble(4,bo.getGross());
		ps.setDouble(5,bo.getNetsal());
		
		//execute the query
		count=ps.executeUpdate();
		
		//close JDBC object
		ps.close();
		con.close();
		return count;
	}//method
}//class
