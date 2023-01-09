package j1.Chapter06.ch04;

public class StringConcatTest {
    public static void main(String[] args) {
        StringConcatImpl strImpl = new StringConcatImpl();
        strImpl.makeString("hello","World");

        String s1 = "Hello";
        String s2 = "World";
        StringConcatImpl strImpl2 = new StringConcatImpl();
        strImpl.makeString(s1,s2);
        StringConcat concat = (s,v)-> System.out.println(s + "," +v);
        concat.makeString(s1,s2);

    }
}
