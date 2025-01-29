import java.sql.*;
import java.util.Scanner;

public class PreparedStatementClass {
    public static void main(String[] args) throws SQLException {
        Scanner scanner = new Scanner(System.in);

        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/soft_uni","root","12345");
        PreparedStatement prep = connection.prepareStatement("Select * FROM employees WHERE salary > ?");

        double moreThan = Double.parseDouble(scanner.nextLine());
        prep.setDouble(1,moreThan);

        ResultSet resultSet = prep.executeQuery();
        while(resultSet.next()){
            System.out.println(resultSet.getNString("first_name"));
        }

    }
}
