package jdbc;

import java.sql.*;

public class DBHelper {

	private static Connection con = null;
	private static PreparedStatement pst = null;
	private static ResultSet rs = null;

	/**
	 * 连接数据库的连接方法
	 */
	private static Connection getConnection() {
		final String driver = "com.mysql.jdbc.Driver";
		final String url = "jdbc:mysql://localhost:3306/oak?useSSL=false";
		final String user = "root";
		final String password = "root";

		Connection con = null;
		try {
			Class.forName(driver);// 加载mysql的驱动
			con = DriverManager.getConnection(url, user, password);// 连接数据库
		} catch (ClassNotFoundException e) {
			System.out.println("驱动加载失败！");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("数据库连接失败！");
			e.printStackTrace();
		}
		return con;
	}
	
	/**
	 * 关闭连接的方法
	 */
	private static void close(){
		if(rs!=null){
			try {
				rs.close();
			} catch (SQLException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
		if(pst!=null){
			try {
				pst.close();
			} catch (SQLException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
		if(con!=null){
			try {
				con.close();
			} catch (SQLException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
		System.out.println("关闭所有连接成功！");
	}
	
	/**
	 * 获取学生信息
	 */
	public static void getStudentInfo() {
		String sql = "select * from student_info";
		con = getConnection();
		try {
			pst=con.prepareStatement(sql);
			rs=pst.executeQuery();
			//获取列数
			//int count=rs.getMetaData().getColumnCount();
			while (rs.next()) {
				System.out.println("ID:"+rs.getInt(1)+" NAME:"+rs.getString("name"));
			}
			close();
		} catch (SQLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}
}
