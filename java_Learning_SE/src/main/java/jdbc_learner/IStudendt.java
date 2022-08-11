package jdbc_learner;

import java.sql.Connection;
import java.util.List;

public interface IStudendt {

    List<Student> findAll();


    Student findBy(int id);


    void save(Student student);

    void deleteBy(int id);

}
