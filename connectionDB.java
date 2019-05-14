
package admin;


import java.sql.*;
import javax.swing.*;
public class connectionDB {
     Connection con=null;
     
     public static Connection DBconnection() 
	{
		try 
		{
			
                    Class.forName("com.mysql.jdbc.Driver");
                   Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/carrent","ahmed","root");				
			return con;		
		} catch(Exception ex)
		{
			JOptionPane.showMessageDialog(null , ex);
                        return null;
		}
		
	}
     
}
