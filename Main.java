
public class Main {
    public static void main(String[] args) {


        MyClass.add(7,8);
        MyClass.decrease(7,8);

        int c = MyClass.decrease(5, 6);

        MyClass d = new MyClass();
        System.out.println(d.a);
        int e = d.a + d.b;

        int f = d.add(e,d.a);


        System.out.println(MyClass.calc(8,9,"add"));

        MyClass.setA(99);
        MyClass.setB(77);
        String g = MyClass.calcWithSet("add");
        String h = MyClass.calc(MyClass.getA(),MyClass.getB(),"exponential");
        System.out.println(g + "\n" +h);

    }
}
