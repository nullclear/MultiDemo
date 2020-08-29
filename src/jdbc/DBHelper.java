package jdbc;

import java.sql.*;

public class DBHelper {

	private static Connection con = null;
	private static PreparedStatement pst = null;
	private static ResultSet rs = null;

	/**
	 * �������ݿ�����ӷ���
	 */
	private static Connection getConnection() {
		final String driver = "com.mysql.jdbc.Driver";
		final String url = "jdbc:mysql://localhost:3306/oak?useSSL=false";
		final String user = "root";
		final String password = "root";

		Connection con = null;
		try {
			Class.forName(driver);// ����mysql������
			con = DriverManager.getConnection(url, user, password);// �������ݿ�
		} catch (ClassNotFoundException e) {
			System.out.println("��������ʧ�ܣ�");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("���ݿ�����ʧ�ܣ�");
			e.printStackTrace();
		}
		return con;
	}
	
	/**
	 * �ر����ӵķ���
	 */
	private static void close(){
		if(rs!=null){
			try {
				rs.close();
			} catch (SQLException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
		}
		if(pst!=null){
			try {
				pst.close();
			} catch (SQLException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
		}
		if(con!=null){
			try {
				con.close();
			} catch (SQLException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
		}
		System.out.println("�ر��������ӳɹ���");
	}
	
	/**
	 * ��ȡѧ����Ϣ
	 */
	public static void getStudentInfo() {
		String sql = "select * from student_info";
		con = getConnection();
		try {
			pst=con.prepareStatement(sql);
			rs=pst.executeQuery();
			//��ȡ����
			//int count=rs.getMetaData().getColumnCount();
			while (rs.next()) {
				System.out.println("ID:"+rs.getInt(1)+" NAME:"+rs.getString("name"));
			}
			close();
		} catch (SQLException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
	}
}
