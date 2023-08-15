package jdbc;

import java.sql.*;

public class CallableStatementDemo {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");  //registering driver
        Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/fullstack10feb","root3","password");
        System.out.println(connection.isValid(100));

        CallableStatement callableStatement = connection.prepareCall("call getStudentData()");

        ResultSet resultSet = callableStatement.executeQuery();
        while (resultSet.next()) {
            System.out.println(resultSet.getInt(1)
                    + " " + resultSet.getString(2)+" "+resultSet.getString(3));
        }
    }
}
