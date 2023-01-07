package j3;

public class GetterSetterTest {
    public static void main(String[] args) {
        Woker w = new Woker();
        w.setName("알");
        w.setAge(32);
        w.setId(5);

        System.out.println(w.getName());
        System.out.println(w.getAge());
        System.out.println(w.getId());

    }

}


class Woker{
    private String name;
    private int age;
    private int id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age < 1) return;;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}