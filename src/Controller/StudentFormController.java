package Controller;

import Views.TM.StudentTM;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import module.Student;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentFormController {
    public TextField txtSid;
    public TextField txtName;
    public TextField txtEmail;
    public TextField txtContact;
    public TextField txtNic;
    public TextField txtAddress;
    public TableView<Student>tblStudent;
    public TableColumn colSid;
    public TableColumn colName;
    public TableColumn colNic;
    public TableColumn colContact;
    public TableColumn colEmail;
    public TableColumn colAddress;

      public void initialize() {
          colSid.setCellValueFactory(new PropertyValueFactory<>("studentId"));
          colName.setCellValueFactory(new PropertyValueFactory<>("studentName"));
          colNic.setCellValueFactory(new PropertyValueFactory<>("nic"));
          colContact.setCellValueFactory(new PropertyValueFactory<>("contact"));
          colEmail.setCellValueFactory(new PropertyValueFactory<>("email"));
          colAddress.setCellValueFactory(new PropertyValueFactory<>("address"));

          try {
              setStudentToTable(new StudentController().getAllStudent());
          } catch (SQLException throwables) {
              throwables.printStackTrace();
          } catch (ClassNotFoundException e) {
              e.printStackTrace();
          }

      }

    private void setStudentToTable(ArrayList<Student> students){
        ObservableList<Student> obList = FXCollections.observableArrayList();
        students.forEach(e->{
            obList.add(
                    new StudentTM(e.getStudentId(), e.getStudentName(), e.getEmail(), e.getContact(),e.getAddress(), e.getNic()));
        });
        tblStudent.setItems(obList);

    }

    public void btnStudentSaveOnAction(ActionEvent actionEvent) {
        Student s1 = new Student(
                txtSid.getText(), txtName.getText(), txtEmail.getText(), txtContact.getText(), txtAddress.getText(), txtNic.getText()
        );
        try {
            if (addStudent(s1)) {
                new Alert(Alert.AlertType.CONFIRMATION, "Save Student...").show();
            } else {
                new Alert(Alert.AlertType.WARNING, "Try Again...").show();
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
