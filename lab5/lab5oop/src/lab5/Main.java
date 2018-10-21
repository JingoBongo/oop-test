package lab5;

public class Main {
    public static void main(String[] args) {
        J test =new J("carl");
        test.b="test B";
        test.f="test F";
        test.a="";

        System.out.println(test.b);
        System.out.println(test.a);
        System.out.println(test.f);
// at this stage it must be clear that classes extend one each other.
//        test.j="test J";
//        test.i="test I";
//        test.h="test H";
//        test.g="test G";
//        test.e="test E";
//        test.d="test D";
//        test.c="test C";
//
//        System.out.println(test.j);
//        System.out.println(test.i);
//        System.out.println(test.h);
//        System.out.println(test.g);
//        System.out.println(test.e);
//        System.out.println(test.d);
//        System.out.println(test.c);
// but anyway. task is to create 10.
        System.out.println(test.j);
        System.out.println(test.a);
        System.out.println(test.f);


        A test2 = new A("testA",new X("apples"));

        System.out.println(test2.x);







    }
}
