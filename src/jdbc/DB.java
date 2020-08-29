package jdbc;

import java.sql.*;

public class DB {
	private static Connection con = null;
	private static PreparedStatement pst = null;
	private static ResultSet rs = null;

	/**
	 * 连接数据库的连接函数
	 * 
	 * @return Connection
	 */
	private static Connection getConnection() {
		final String driver = "com.mysql.jdbc.Driver";
		final String url = "jdbc:mysql://localhost:3306/oak?useSSL=false";
		final String user = "root";
		final String password = "root";
		Connection con = null;
		try {
			Class.forName(driver);// 1.加载驱动
			con = DriverManager.getConnection(url, user, password);// 2.连接数据库
		} catch (ClassNotFoundException e) {
			System.out.println("加载驱动失败!");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("连接数据库失败!");
			e.printStackTrace();
		}
		return con;
	}

	/**
	 * 关闭连接
	 */
	private static void closeConnection() {
		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
		if (pst != null) {
			try {
				pst.close();
			} catch (SQLException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
		if (con != null) {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
	}

	/**
	 * 查询学生信息
	 */
	public static void getStudentInfo() {
		String sql = "select * from student_info";
		con = getConnection();
		try {
			pst = con.prepareStatement(sql);//3.发送sql语句
			rs = pst.executeQuery();//4.处理结果集
			while (rs.next()) {
				System.out.println("ID:" + rs.getInt("id") + " NAME:" + rs.getString(2));
			}
			closeConnection();//5.关闭连接
		} catch (SQLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}
}
