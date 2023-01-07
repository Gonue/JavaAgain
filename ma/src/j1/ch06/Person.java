package j1.ch06;

public class Person {
    public int personHeight;
    public int personWeight;
    public String personName;
    public int personAge;


    public Person(int personHeight, int personWeight, String personName, int personAge){
        this.personHeight = personHeight;
        this.personWeight = personWeight;
        this.personName = personName;
        this.personAge = personAge;
    }

    public void showPersonInfo(){
        System.out.println("키가 " + personHeight + " 이고 몸무게가 " + personWeight + " 인 남성이 있습니다.");
        System.out.println("이름은 "+ personName +" 이고 나이는 " + personAge +" 세입니다.");

    }
}