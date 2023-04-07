package com.studentmspro;
import java.sql.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception
    {
       Class.forName("com.mysql.cj.jdbc.Driver");
       String url="jdbc:mysql://localhost:3306/studentms";
       String username="root";
       String password="Bindu@123";
       Connection bin=DriverManager.getConnection(url,username,password);
       Statement st=bin.createStatement();
       ResultSet rs=st.executeQuery("select * from student");
       System.out.println("studentid\t studentname\t studentclass\t studentmarks");
       
       while(rs.next())
       {
    	   String studata=rs.getInt(1)+"\t\t"+rs.getString(2)+"\t\t"+rs.getString(3)+"\t\t"+rs.getInt(4);
    	   System.out.println(studata);
       }
       
       bin.close();
    }
}
