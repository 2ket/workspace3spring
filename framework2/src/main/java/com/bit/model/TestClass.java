package com.bit.model;

import java.sql.Connection;
import java.sql.SQLException;

public class TestClass {

	public static void main(String[] args) {

		Bbs02Dao dao=new Bbs02Dao();
		try {
			Connection conn=dao.getConnection();
			System.out.println(conn);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
