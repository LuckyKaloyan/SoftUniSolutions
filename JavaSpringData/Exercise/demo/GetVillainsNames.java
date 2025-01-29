import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class GetVillainsNames {
    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/minions_db", "root","12345");
        ResultSet resultSet = connection.createStatement().executeQuery("SELECT name, COUNT(minion_id) FROM villains " + "JOIN minions_villains ON id = villain_id GROUP BY villain_id  HAVING COUNT(minion_id)>15 ORDER BY COUNT(minion_id) DESC;");

        while(resultSet.next()){
            System.out.printf(resultSet.getNString(1)+" "+resultSet.getInt(2)+"%n");
        }




    }
}
