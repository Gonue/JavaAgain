package j1.Chapter05.ch04;

public class StudentTest {
    public static void main(String[] args) {

        int num = 10;
        Student studentLee = new Student();

        studentLee.studentId = 12345;
        studentLee.setStudentName("Lee");
        studentLee.address = "서울 강남구";

        studentLee.showStudentInfo();

        Student studentKim = new Student();
        studentKim.studentId = 54321;
        studentKim.studentName = "Kim";
        studentKim.address = "경기도 성남";

        studentKim.showStudentInfo();
    }
}
