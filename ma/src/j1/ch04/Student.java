package j1.ch04;

public class Student {
    public int studentId;
    public String studentName;
    public String address;

    public void showStudentInfo(){
        System.out.println(studentId + "학번 이름은" + studentName + "주소는" + address);
    }
    public String getStudentName(){
        return studentName;
    }
    public void setStudentName(String a){
        studentName = a;
    }
}
