package jdbc_learner;

import java.sql.Connection;

public class MAin {
    public static void main(String[] args) {
        Connection connection=DBConnection.getConnection();
        if (connection==null){
            System.out.println("failed***");
        }
        else{
            System.out.println("success!!!");
        }

    }
}
