package poc2;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.io.*;



public class poc2student {
public static void main(String[] args) throws Exception {
Connection myConn = null;
Statement myStmt = null;
ResultSet myRs = null;



String dbUrl = "jdbc:mysql://localhost:3306/poc2";
String user = "root";
String pass = "Saviramzmay21!";
try {
myConn = DriverManager.getConnection(dbUrl, user, pass);
myStmt = myConn.createStatement();

 String sql = "CREATE TABLE student2 " + "(studentid INTEGER not NULL, "
 + " firstname VARCHAR(255)," + " lastname VARCHAR(255)," + " departmentid INTEGER," +" joiningDate Date,"+" studentDob Date,"+"mobilenumber BIGINT,"+"email varchar(45),"+ " PRIMARY KEY ( studentid,joiningdate ))";
myStmt.executeUpdate(sql);





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