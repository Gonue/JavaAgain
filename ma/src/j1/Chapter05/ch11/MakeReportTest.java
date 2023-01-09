package j1.Chapter05.ch11;

public class MakeReportTest {
    public static void main(String[] args) {
        MakeReport buider = new MakeReport();
        String report = buider.getReport();

        System.out.println(report);
    }
}
