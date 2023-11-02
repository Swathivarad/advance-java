package student.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

import student.dto.studentdetails;

public class studentcrud {
	public void createTable() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student?createDatabaseIfNotExist=true","root","root");
		Statement sta=con.createStatement();
		sta.execute("create table IF NOT EXISTS student(id int primary key,"+"name varchar(45) not null,"+"email varchar(45),"+"password varchar(45),"+" phoneno long)");
		con.close();
	}
	public void insert(studentdetails student) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student?createDatabaseIfNotExist=true","root","root");
		PreparedStatement ps=con.prepareStatement("insert into student "
				+ ""
				+ "values(?,?,?,?,?)");
		ps.setInt(1,student.getId());
		ps.setString(2,student.getName());
		ps.setString(3,student.getEmail());
		ps.setString(4, student.getPassword());
		ps.setLong(5, student.getPhoneno());
		ps.execute();
		con.close();
	}
	public void update(studentdetails student) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student?createDatabaseIfNotExist=true","root","root");
		PreparedStatement ps=con.prepareStatement("update student set name=?,email=?,password=?,phoneno=? where id=? ");
		ps.setInt(1,student.getId());
		ps.setString(2,student.getName());
		ps.setString(3,student.getEmail());
		ps.setString(4, student.getPassword());
		ps.setLong(5, student.getPhoneno());
		ps.executeUpdate();
		con.close();
		
	}
	public void delete(studentdetails student) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student?createDatabaseIfNotExist=true","root","root");
		PreparedStatement ps=con.prepareStatement("delete from where id=?,name=?,email=?,password=?,phoneno=? ");
		ps.setInt(1,student.getId());
		ps.setString(2,student.getName());
		ps.setString(3,student.getEmail());
		ps.setString(4, student.getPassword());
		ps.setLong(5, student.getPhoneno());
		ps.executeUpdate();
		con.close();
		
	}

}

