package j1.Chapter05.ch14;

public class TakeTransTest {
    public static void main(String[] args) {
        Student studentKim = new Student("Kim",5000);
        Student studentJang = new Student("Jang",10000);
        Student studentgang = new Student("Gang", 90000);
        Student studentEdward = new Student("Edward", 10000);
        Bus bus100 = new Bus(100);
        Bus bus500 = new Bus(500);
        Subway greenSubway = new Subway(2);
        Taxi taxi = new Taxi("잘 간다 운수택시");
        studentKim.takeBus(bus100);
        studentJang.takeSubway(greenSubway);
        studentgang.takeBus(bus500);

        studentKim.showInfo();
        studentJang.showInfo();
        studentgang.showInfo();
        bus100.showBusInfo();
        greenSubway.showSubwayInfo();
        bus500.showBusInfo();

        studentEdward.showInfo();
        studentEdward.takeTaxi(taxi);
        taxi.showTaxiInfo();

    }
}
