package j2.chap07;

class Time{
    private int hour;// 0 ~ 23
    private int minute;// 0 ~ 59
    private int second; // 0 ~ 59


    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if(hour < 0 || hour > 23) return;
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }


}


public class TimeTest {
    public static void main(String[] args) {
        Time t = new Time();
        t.setHour(25);
        System.out.println(t.getHour());
        t.setHour(21);
        System.out.println(t.getHour());
    }
}
