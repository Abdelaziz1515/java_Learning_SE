package spring_jdbcTemplete;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentMapper implements RowMapper {
    @Override
    public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
        Student student=new Student();
        student.setId(rs.getInt("id"));
        student.getName(rs.getString("name"));
        student.setAge(rs.getInt("age"));
        student.setSalary(rs.getInt("salary"));

        return student;
    }
}

