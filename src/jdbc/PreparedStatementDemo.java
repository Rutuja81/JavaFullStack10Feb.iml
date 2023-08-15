package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class PreparedStatementDemo {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");  //registering driver
        Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/fullstack10feb");

        int id;
        String name,address;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter id, name, address: ");
        id= scanner.nextInt();
        name= scanner.next();
        address= scanner.next();

        String insert="insert into student(id, name, values) values(?,?,?)";

        PreparedStatement preparedStatement = connection.prepareStatement(insert);
        preparedStatement.setInt(1,id);
        preparedStatement.setString(2,name);
        preparedStatement.setString(3,address);

        int i= preparedStatement.executeUpdate();
        System.out.println("record inserted "+i);

    }
}

