package hotel.dao;

import hotel.model.ShouYin;
import hotel.util.TimeUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ZhiChuDao {
	/**
	 * 添加支出信息
	 * @param con
	 * @param cashier
	 * @return
	 * @throws SQLException
	 */
	public int addCashier(Connection con,ShouYin cashier) throws SQLException{
		String sql = "insert into t_cashier values(null,?,?,?,?)";
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setString(1, cashier.getType());
		pstmt.setString(2,cashier.getMoney());
		pstmt.setString(3, cashier.getRemarks());
		pstmt.setString(4, TimeUtil.formatTime());
		
		return pstmt.executeUpdate();
	}
	/**
	 * 查询支出信息
	 * @param con
	 * @return
	 * @throws SQLException
	 */
	public ResultSet outAccount(Connection con) throws SQLException{
		String sql = "select * from t_cashier where type = '支出'";
		PreparedStatement pstmt = con.prepareStatement(sql.toString());
		return pstmt.executeQuery();
	}
}
