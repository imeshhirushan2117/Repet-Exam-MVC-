package Views.TM;

import module.Student;

public class StudentTM extends Student {
    private String studentId;
    private String studentName;
    private String email;
    private String contact;
    private String address;
    private String nic;

    public String getStudentId() {
        return studentId;
    }

    public StudentTM(String studentId, String studentName, String email, String contact, String address, String nic) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.email = email;
        this.contact = contact;
        this.address = address;
        this.nic = nic;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    @Override
    public String toString() {
        return "StudentTM{" +
                "studentId='" + studentId + '\'' +
                ", studentName='" + studentName + '\'' +
                ", email='" + email + '\'' +
                ", contact='" + contact + '\'' +
                ", address='" + address + '\'' +
                ", nic='" + nic + '\'' +
                '}';
    }
}
