

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletFetch extends HttpServlet {
	
   
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String url="jdbc:mysql://localhost:3306/navbase";
		String user="root";
		String pass="root";
		
			try{
				Class.forName("com.mysql.jdbc.Driver");
			
			
			Connection con;
			
				con = DriverManager.getConnection(url, user, pass);
			
			
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select * from register");
			while(rs.next())
			{
				System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
			}
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		
		
	}
		}
		
	

		
