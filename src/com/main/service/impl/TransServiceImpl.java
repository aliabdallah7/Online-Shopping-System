package com.main.service.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.main.service.SingletonObject;
import com.main.service.TransService;
import com.main.utility.DBUtil;

public class TransServiceImpl implements TransService {

	@Override
	public String getUserId(String transId) {
		String userId = "";

		Connection con = SingletonObject.getInstance();
		PreparedStatement ps = null;
		ResultSet rs = null;

		try {

			ps = con.prepareStatement("select username from transactions where transid=?");

			ps.setString(1, transId);

			rs = ps.executeQuery();

			if (rs.next())
				userId = rs.getString(1);

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return userId;
	}

}