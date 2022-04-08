package com.connectYou.chat.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import static com.Ashutosh.chatApp.utils.configReader.getValue;

public interface commonDAO {
public static Connection createConnection() throws ClassNotFoundException, SQLException {
	//Step 1->load the driver  this is used to load the driver
	Class.forName(getValue("driver"));
	
	//Step 2 :-> Making a connection.....
	final String CONNECTION_STRING=getValue("CONNECTION_URL");
	final String USER_ID=getValue("USER_id");
	final String PASSWORD=getValue("PASSWORD");
	Connection con =DriverManager.getConnection(CONNECTION_STRING,USER_ID,PASSWORD);
	if(con!=null) {
		System.out.print("Connection Established Sussessfully");
		//con.close();
	}
	return con;
}

}
