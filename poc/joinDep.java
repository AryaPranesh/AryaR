package poc;
import java.sql.*;
public class joinDep
{
public static void main(String[] args)
{
	String dburl = "jdbc:mysql://localhost:3306/poc";
    String user ="root";
    String pass ="Saviramzmay21!";
try (Connection conn = DriverManager.getConnection(dburl, user,pass );
Statement stmt = conn.createStatement();
) {
Statement st = conn.createStatement();
ResultSet res = st.executeQuery("select studentid, firstname, lastname,joiningDate,studentDob,mobilenumber,email, departmentname\n" +
"from student \n" +
"join Department \n" +
"On student.departmentid= Department.departmentid");
System.out.println("studentid  " + " firstname " + " lastname"+ "joiningDate"+ "studentDob"+"mobilenumber"+"email"+ "departmentid" + "departmentname");
while (res.next()) {
String stuID = res.getString("studentid");
String FirstName = res.getString("firstname");
String LastName = res.getString("lastname");
String joiningDate = res.getString("joiningDate");
String DOB = res.getString("studentDob");
String MobileNo = res.getString("mobilenumber");
String EmailID = res.getString("email");
String Department = res.getString("departmentname");

System.out.format(
"%10s%10s%10s%10s%10s%20s%20s%20s\n",stuID, FirstName, LastName, joiningDate, DOB,MobileNo,EmailID ,Department);

}



// Step 7: Close the connection
conn.close();
} catch (SQLException throwables) {
throwables.printStackTrace();
} catch (Exception e) {
e.printStackTrace();
}
}
}