package Basic;

import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;

public class SQL {

	public static void main(String[] args) throws SQLException {
		
		String URL = "jdbc:mysql://127.0.0.1:3306/demo";	//"demo" là tên của database
		String USER_NAME = "root";
		String PASSWORD = "kimcuongXanh1";
		
		// Lấy ra đối tượng "con" kết nối vào DB.
		Connection con = DriverManager.getConnection(URL, USER_NAME, PASSWORD);

		// Tạo đối tượng Statement.
		Statement st = con.createStatement();   
		
		String query = "select * from user";
		// Thực thi câu lệnh "query" trả về đối tượng ResultSet.
		ResultSet rs = st.executeQuery(query);    
		
		while (rs.next()){	// Di chuyển con trỏ xuống bản ghi kế tiếp. 1,2,3 là thứ tự các cột.
            String ID = rs.getString(1);                                        
            String Email = rs.getString(2);    
            String Pass = rs.getString(3);
            System.out.println(ID + "\t"+ Email + "\t" + Pass);        
		}   
		
		// Đóng kết nối.
		 con.close();  
	}

}

  

                        

     



