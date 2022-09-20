package Controller;

import DB.DBConnection;
import module.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class StudentController implements StudentServices {

    @Override
    public boolean saveStudent(Student s1) throws SQLException, ClassNotFoundException {
        Connection con = DBConnection.getInstance().getConnection();
        PreparedStatement pstm = con.prepareStatement("INSERT INTO student VALUES (?,?,?,?,?,?)");
        pstm.setObject(1, s1.getStudentId());
        pstm.setObject(2, s1.getStudentName());
        pstm.setObject(3, s1.getEmail());
        pstm.setObject(4, s1.getContact());
        pstm.setObject(5, s1.getAddress());
        pstm.setObject(6, s1.getNic());
        return (pstm.executeUpdate() > 0);

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
        Connection con = DBConnection.getInstance().getConnection();
        PreparedStatement pstm = con.prepareStatement("SELECT * FROM student");
        ResultSet rst = pstm.executeQuery();
        ArrayList<Student> students = new ArrayList<>();
        while (rst.next()) {
            students.add(new Student(
                    rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getString(4),
                    rst.getString(5),
                    rst.getString(6)
            ));
        }
        return students;
    }
}