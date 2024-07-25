package Basic;

import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;


public class nhap {

	public static void main(String[] args) throws SQLException{
		
		String Url = "jdbc:mysql://127.0.0.1:3306/demo";
		String username = "root";
		String password = "kimcuongXanh1";
		
		Connection connect = DriverManager.getConnection(Url, username, password);
		
		Statement state =  connect.createStatement();
		
		String query = "SELECT * FROM user";
		ResultSet result = state.executeQuery(query);
		
		while (result.next()) {
			String ID = result.getString(1);
			String email = result.getString(2);
			String pass = result.getString(3);
			System.out.println(ID + "\t" + email + "\t" + pass);
			
			
		}
		
		
		connect.close();
		
		
		
		

	}

}
