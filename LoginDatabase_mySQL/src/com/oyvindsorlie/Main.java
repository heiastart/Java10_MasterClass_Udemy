package com.oyvindsorlie;

import com.oyvindsorlie.Helper.DBHandler;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {

    static private DBHandler dbHandler;
    static private Connection connection;
    static private PreparedStatement preparedStatement;


    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        // Class.forName("com.mysql.jdbc.Driver"); -> this is deprecated as for my version of MySQL....therefore not needed!!
        // NB; If defining the following connection in a XML-file, the & in the URL-parameter should be replaced by &amp;
        // Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/login ? useLegacyDatetimeCode=false & serverTimezone=" + TimeZone.getDefault().getID(), "root", "sudo1234");
        dbHandler = new DBHandler();
        connection = dbHandler.getDbConnection();

        writeToDB();
        readFromDB();
        //updateDB("Silje", "Sørlie", "siljes12", "Vennesla", 30, 2);
        //deleteFromDB(2);
    }


    public static void writeToDB() throws SQLException {
        String insertQuery = "INSERT INTO users(firstname, lastname, username, address, age)" + "VALUES(?,?,?,?,?)";
        preparedStatement = connection.prepareStatement(insertQuery);

        preparedStatement.setString(1, "hans");
        preparedStatement.setString(2, "hansen");
        preparedStatement.setString(3, "");
        preparedStatement.setString(4, "");
        preparedStatement.setInt(5, 52);

        preparedStatement.executeUpdate();
    }

    public static void readFromDB() throws SQLException {
        String readQuery = "SELECT * FROM users";
        // The preparedStatement object holds all our data in "raw-form"
        PreparedStatement preparedStatement = connection.prepareStatement(readQuery);
        ResultSet resultSet = preparedStatement.executeQuery();

        // To show/display the data, we have the following code;
        while (resultSet.next()){
            System.out.println("Name: " + resultSet.getString("firstname") + " " + resultSet.getString("lastname"));
            System.out.println("Username: " + resultSet.getString("username"));
            System.out.println("Address: " + resultSet.getString("address"));
            System.out.println("Age: " + resultSet.getInt("age"));
            System.out.println("---------------------");
        }
    }

    public static void updateDB(String firstname, String lastname, String username, String address, int age, int id) throws SQLException {
        // Here, we wanna update all the columns in the table, hence we include all the attributes in the updateQuery string
        //String updateQuery = "UPDATE users SET firstname = ?, lastname = ?, username = ?, address = ?, age = ? " + "WHERE userID = ? ";
        String updateQuery = "UPDATE users SET firstname = ?, lastname = ?, username = ?, address = ?, age = ? WHERE userID = ? ";
        PreparedStatement preparedStatement = connection.prepareStatement(updateQuery);

        preparedStatement.setString(1, firstname);
        preparedStatement.setString(2, lastname);
        preparedStatement.setString(3, username);
        preparedStatement.setString(4, address);
        preparedStatement.setInt(5, age);
        preparedStatement.setInt(6, id);

        preparedStatement.executeUpdate();
        preparedStatement.close();

    }

    public static void deleteFromDB(int id) throws SQLException {
        String deleteQuery = "DELETE FROM users WHERE userID = ? ";
        PreparedStatement preparedStatement = connection.prepareStatement(deleteQuery);
        preparedStatement.setInt(1, id);
        preparedStatement.execute();
        preparedStatement.close();
    }
}
