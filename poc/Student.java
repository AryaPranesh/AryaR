package poc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.io.*;



public class Student {
public static void main(String[] args) throws Exception {
Connection myConn = null;
Statement myStmt = null;
ResultSet myRs = null;



String dbUrl = "jdbc:mysql://localhost:3306/poc";
String user = "root";
String pass = "Saviramzmay21!";
try {
myConn = DriverManager.getConnection(dbUrl, user, pass);
myStmt = myConn.createStatement();

 /*String sql = "CREATE TABLE Student " + "(studentid INTEGER not NULL, "
 + " firstname VARCHAR(255)," + " lastname VARCHAR(255)," + " departmentid INTEGER," +" joiningDate Date,"+" studentDob Date,"+"mobilenumber BIGINT,"+"email varchar(45),"+ " PRIMARY KEY ( studentid,joiningdate ))";
myStmt.executeUpdate(sql);*/




System.out.println("Created table in given database...");


System.out.println("Inserting records into the table...");
String sql = "INSERT INTO Student VALUES (1,'Arya','pranesh',1,'2021-09-01','1992-01-19',9042397347,'aryar.mariyappan@perficient.com')";
myStmt.executeUpdate(sql);
sql = "INSERT INTO Student VALUES (2,'Keerthi','sigamani',1,'2021-10-02','1998-01-21',1111112345,'keerthisiga@gmail.com')";
myStmt.executeUpdate(sql);
sql = "INSERT INTO Student VALUES (3,'Divya','Kumar',1,'2021-10-03','1998-01-22',22222234567,'divya@gmail.com')";
myStmt.executeUpdate(sql);

System.out.println("Inserted records into the table...");
} catch (Exception e) {
e.printStackTrace();
}
finally {

if (myStmt != null) {
myStmt.close();
}



if (myConn != null) {
myConn.close();
}
}



}



}