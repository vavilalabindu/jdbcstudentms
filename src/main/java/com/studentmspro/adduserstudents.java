package com.studentmspro;
import java.sql.*;
import java.util.Scanner;

public class adduserstudents {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
	       String url="jdbc:mysql://localhost:3306/studentms";
	       String username="root";
	       String password="Bindu@123";
	       Connection bin=DriverManager.getConnection(url,username,password);
	       
	       Scanner sc=new Scanner(System.in);
	       
	       System.out.println("***add students data***");
	       System.out.println("enter student id");
	       int sid=sc.nextInt();
	       System.out.println("enter student name");
	       sc.nextLine();
	       String sname=sc.nextLine();
	       System.out.println("enter student class");
	       String sclass=sc.nextLine();
	       System.out.println("enter student marks");
	       int smarks=sc.nextInt();
	       
	       String quer="insert into student values(?,?,?,?)";
	       PreparedStatement pst=bin.prepareStatement(quer);
	       pst.setInt(1,sid);
	       pst.setString(2,sname);
	       pst.setString(3,sclass);
	       pst.setInt(4,smarks);
	       
	        int count=pst.executeUpdate();
	        System.out.println(count+"row(s) affected");
	        
	       bin.close();
	       sc.close();
	       
	       
	       
	       

	}

}
