import java.sql.*;
class MySQLTest{
public static void main(String[] args) throws Exception{
	Class.forName("com.mysql.jdbc.Driver");
	System.out.println("driver register");

	Connection cnn=DriverManager.getConnection("jdbc:mysql//localhost:3306/student","root","");
	System.out.println("Connection Establish");


	Statement s=cnn.createStatement();
	ResultSet r =s.executeQuery("select * from student");

    System.out.println("Roll Name marks Age");
    while(r.next()){
		System.out.println(r.getInt(1)+" "+r.getString(2)+" "+r.getDouble(3)+" "+r.getInt(4));
	}
	r.close();
	cnn.close();
	s.close();
}
}