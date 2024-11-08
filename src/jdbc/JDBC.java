package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JDBC {
    public static void main(String[] args) {



String url="jdbc:mysql://localhost:3306/abhay";
String username="root";
String password="mysqlx64";


Connection con=null;

try{

    Class.forName("com.mysql.cj.jdbc.Driver");  // load the driver class name

     con = DriverManager.getConnection(url, username, password);

    System.out.println("connection to database is successfull  .....");

    // db operation perform here

    PreparedStatement showTables = con.prepareStatement("select* from student");
//    showTables.setInt(1,123);
//    showTables.setString(2,"abhay");
//
    ResultSet resultSet = showTables.executeQuery();



    while(resultSet.next())
    {
        String string = resultSet.getString(1);
        int anInt = resultSet.getInt(2);


        System.out.println("name of student is  ="+string);
        System.out.println("sid of the student is = "+anInt);
    }


}
catch (Exception ex)
{
    System.out.println("something went wrong ...");
}

finally {

    try{

        if(!con.isClosed()&&con!=null)
        {
con.close();
            System.out.println("connection close success...");
// finally close the connection when we are done with database ...
        }

    }
    catch(Exception e)
    {
        e.printStackTrace();
    }
}

    }
}
