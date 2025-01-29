import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBC {
    public static void main(String[] args) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/soft_uni", "root", "12345");
        ResultSet resultSet = connection.createStatement().executeQuery("SELECT * FROM employees");
        while(resultSet.next()){
            String first_name = resultSet.getNString("first_name");
            System.out.println(first_name);
        }




    }
}
