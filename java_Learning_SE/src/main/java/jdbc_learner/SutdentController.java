package jdbc_learner;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public  class SutdentController implements IStudendt{


    @Override
    public List<Student> findAll() {
        return null;
    }

    @Override
    public Student findBy(int id) {
        return null;
    }

    @Override
    public void deleteBy(int id) {

    }

    public void save(Student student) {
        Connection connection=DBConnection.getConnection();

        if (connection==null){
            return;
        }
        if (student.getId()==0){}



        else {
            String query="INSERT INTO student VALUES();";
            try {
                PreparedStatement preparedStatement=connection.prepareStatement(query);
                preparedStatement.setString( 1,student.getFirstName());
                preparedStatement.setString( 2,student.getLastName());
                preparedStatement.setString( 3, String.valueOf(student.getAge()));
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
