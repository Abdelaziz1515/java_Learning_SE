package jdbc_learner;

import java.sql.*;

public class jdbc_learner {
    private static final String HOST="localhost";
    private static final int PORT=3306;
    private static final String DB_NAME="test";
    private static final String USERNAME="root";
    private static final String PASSWORD="Root@1061#";
    static final  String Query="select * from jdbc_conn ;";
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection= DriverManager.getConnection(String.format("jdbc:mysql://%s:%d/%s",HOST,PORT,DB_NAME),USERNAME,PASSWORD);
            if (connection==null){
                System.out.println("Failed!!!");
            }
            else {
                System.out.println("Success!!!");
            }

            Statement statement=connection.createStatement();
            ResultSet resultSet=statement.executeQuery(Query);
            System.out.println("Done!!!");
            while (resultSet.next()){
                int id=resultSet.getInt("id");
                String name=resultSet.getNString("name");
                int age=resultSet.getInt("age");
                double salary=resultSet.getDouble("salary");
                System.out.println(id+"\t"+name+"\t"+age+"\t"+salary);
            }
            connection.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }



    }
}
