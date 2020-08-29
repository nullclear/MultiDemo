package jdbc;

import java.sql.*;

public class DB {
	private static Connection con = null;
	private static PreparedStatement pst = null;
	private static ResultSet rs = null;

	/**
	 * �������ݿ�����Ӻ���
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
			Class.forName(driver);// 1.��������
			con = DriverManager.getConnection(url, user, password);// 2.�������ݿ�
		} catch (ClassNotFoundException e) {
			System.out.println("��������ʧ��!");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("�������ݿ�ʧ��!");
			e.printStackTrace();
		}
		return con;
	}

	/**
	 * �ر�����
	 */
	private static void closeConnection() {
		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
		}
		if (pst != null) {
			try {
				pst.close();
			} catch (SQLException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
		}
		if (con != null) {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
		}
	}

	/**
	 * ��ѯѧ����Ϣ
	 */
	public static void getStudentInfo() {
		String sql = "select * from student_info";
		con = getConnection();
		try {
			pst = con.prepareStatement(sql);//3.����sql���
			rs = pst.executeQuery();//4.��������
			while (rs.next()) {
				System.out.println("ID:" + rs.getInt("id") + " NAME:" + rs.getString(2));
			}
			closeConnection();//5.�ر�����
		} catch (SQLException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
	}
}
