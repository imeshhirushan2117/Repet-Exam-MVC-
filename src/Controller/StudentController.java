package Controller;

import module.Student;

import java.sql.SQLException;
import java.util.ArrayList;

public class StudentController implements StudentServices {

    @Override
    public boolean saveStudent(Student s1) throws SQLException, ClassNotFoundException {
        return false;
    }

    @Override
    public boolean updateStudent(Student s1) throws SQLException, ClassNotFoundException {
        return false;
    }

    @Override
    public boolean deleteStudent(String studentId) throws SQLException, ClassNotFoundException {
        return false;
    }

    @Override
    public Student getStudent(String studentId) throws SQLException, ClassNotFoundException {
        return null;
    }

    @Override
    public ArrayList<Student> getAllStudent() throws SQLException, ClassNotFoundException {
        return null;
    }
}
