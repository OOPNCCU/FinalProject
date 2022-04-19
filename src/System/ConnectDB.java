package System;
import java.sql.*;

public class ConnectDB {
        private String server = "jdbc:mysql://140.119.19.73:3315/";
		private String database = "tuegroup10"; // change to your own database
		private String url = server + database + "?useSSL=false";
		private String username = "tuegroup10"; // change to your own user name
		private String password = "hpa3859"; // change to your own password
        
        public void ConnectDB(){
            try (Connection conn = DriverManager.getConnection(url, username, password)) {
			System.out.println("DB Connectd");
			
			Statement stat = conn.createStatement();
			boolean sucess = true;
			
		    } catch (SQLException e) {
			e.printStackTrace();
		    }	
        }
		
		
}
    

