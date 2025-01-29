import java.sql.*;
import java.util.Scanner;

public class GetMinionsNames {
    public static void main(String[] args) throws SQLException {
        Scanner scanner = new Scanner(System.in);

Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/minions_db","root","12345");
PreparedStatement preparedStatement = connection.prepareStatement("SELECT villains.name,minions.name,minions.age FROM minions " +
        "JOIN minions_villains ON minions.id = minions_villains.minion_id " +
        "JOIN villains ON minions_villains.villain_id=villains.id WHERE villains.id = ?;");
int inputInt = Integer.parseInt(scanner.nextLine());
preparedStatement.setInt(1,inputInt);
ResultSet resultSet = preparedStatement.executeQuery();
        int count= 0;
while(resultSet.next()){
    String villain_name = resultSet.getNString(1);
    if(count==0){System.out.println("Villain: "+villain_name);}
    count++;
    String minions_name = resultSet.getNString(2);
    int minions_age = resultSet.getInt(3);
    System.out.println(count+". "+minions_name+" "+minions_age);
}

    }
}
