package Controller;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import module.Student;

import java.sql.SQLException;

public class StudentFormController {
    public TextField txtSid;
    public TextField txtName;
    public TextField txtEmail;
    public TextField txtContact;
    public TextField txtNic;
    public TextField txtAddress;
    public TableView<String> tblStudent;
    public TableColumn colSid;
    public TableColumn colName;
    public TableColumn colNic;
    public TableColumn colContact;
    public TableColumn colEmail;
    public TableColumn colAddress;

    public void btnStudentSaveOnAction(ActionEvent actionEvent) {
        Student s1 = new Student(
                txtSid.getText(),txtName.getText(),txtEmail.getText(),txtContact.getText(),txtAddress.getText(),txtNic.getId()
        );
        try {
            if (addStudent(s1)){
                new Alert(Alert.AlertType.CONFIRMATION,"Save Student...").show();
            }else{
                new Alert(Alert.AlertType.WARNING,"Try Again...").show();
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private boolean addStudent(Student s1) throws SQLException, ClassNotFoundException {
        return new StudentController().saveStudent(s1);
    }

    public void btnStudentUpdateOnAction(ActionEvent actionEvent) {
    }

    public void btnStudentDeleteOnAction(ActionEvent actionEvent) {
    }
}
