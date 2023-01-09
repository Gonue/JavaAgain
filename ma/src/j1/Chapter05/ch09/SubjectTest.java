package j1.Chapter05.ch09;

public class SubjectTest {

    public static void main(String[] args) {
        Student studentLee = new Student(100,"Lee");
        studentLee.setKoreaSubject("국어",100);
        studentLee.setMathSubject("수학",50);

        Student studentKim = new Student(55,"Kim");
        studentKim.setKoreaSubject("국어",45);
        studentKim.setMathSubject("수학",35);

        studentLee.showScoreInfo();
        studentKim.showScoreInfo();
    }
}
