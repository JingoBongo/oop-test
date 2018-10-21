package lab5;

public class B extends A {
    protected String b;


    B(String text){
        super(text, new X("X from B"));
        this.b = text;}
}
