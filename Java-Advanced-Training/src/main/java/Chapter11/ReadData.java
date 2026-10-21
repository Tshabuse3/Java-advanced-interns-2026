package Chapter11;

import java.sql.*;

/**
 * @author : Livhuwani Tshabuse
 * Project : IntelliJ IDEA
 * Date : 10/15/2026
 **/
public class ReadData {
    public static void main(String[] args) {
        String connectionString = "jdbc:sqlserver://ILAB05\\SQLEXPRESS;database=Northwind;encrypt=true";

        try {
            //create connection object
            Connection objConnection = DriverManager.getConnection(connectionString);
            //Open the connection
            Statement stm = objConnection.createStatement();
            String cmdSelect = "SELECT * FROM Employees";
            ResultSet results = stm.executeQuery(cmdSelect);

            while(results.next()){
                System.out.println(results.getInt(1) + "-" + results.getString(3));
            }
                objConnection.close();;

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
}