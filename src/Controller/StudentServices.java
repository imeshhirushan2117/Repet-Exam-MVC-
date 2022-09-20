package Controller;

import module.Student;

import java.sql.SQLException;
import java.util.ArrayList;

public interface StudentServices {
    public boolean saveStudent(Student s1) throws SQLException, ClassNotFoundException;
    public boolean updateStudent(Student s1) throws SQLException, ClassNotFoundException;
    public boolean deleteStudent(String studentId) throws SQLException, ClassNotFoundException;
    public Student getStudent(String studentId) throws SQLException, ClassNotFoundException;
    public ArrayList<Student> getAllStudent() throws SQLException, ClassNotFoundException;
}
