package lab5;

public class H extends G {
    protected String h;
    protected X x = new X("X from H");

    public H(String text){
        super(text);
        this.h = text;
    }
}
