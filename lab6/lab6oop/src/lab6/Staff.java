package lab6;

import java.util.Date;

public interface Staff extends Department, Person {
    Date joined= new Date();
    String education="High to middle grades in summer camp";
    String certification="Lol, who needs one? (c)TF2 Medic";
    String languages="Schadenfreude";
}
