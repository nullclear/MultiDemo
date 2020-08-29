package jdbc;

public class Demo {
	public static void main(String[] args) {
		/*String url="jdbc:mysql://localhost:3306/oak?useSSL=false";
		String user="root";
		String password="root";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection(url, user, password);
			System.out.println(con);
			con.close();
		} catch (ClassNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}*/
		//DBHelper.getStudentInfo();
		DB.getStudentInfo();
	}
}
