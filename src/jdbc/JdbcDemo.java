package jdbc;


//ddl,
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.cj.jdbc.Driver");  //registering driver
        Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/fullstack10feb","root3","password");
        System.out.println(connection.isValid(100));


        Statement statement = connection.createStatement();
//        String createTable = "create table student(id int,name varchar(25),address varchar(25))";
//        statement.executeUpdate(createTable);

//        String insert = "insert into student(id,name,address) values(1,'Akash','pune')";
        String update ="update student set name = 'ravi' where id = 1";
//        String delete = "delete from student where id = 1";
//        String drop ="drop table student";
//
        int i= statement.executeUpdate(update);

//        System.out.println("record deleted");

        System.out.println("record updated "+i);



//        System.out.println("table created");
    }
}
