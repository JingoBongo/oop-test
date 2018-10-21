package ab1at2;

public class Main {

    public static void main(String[] args) {


    University first = new University("UTM",1967,new Student[]{
            new Student("Misha",6,20),
            new Student("Someone",8,19),
            new Student("Noname",10,20)});

        University second = new University("BUK",1001,new Student[]{
                new Student("Bak",7,21),
                new Student("Meme",7,19),
                new Student("Dean",9,18)});

        University third = new University("EDL",1234,new Student[]{
                new Student("Drake",9,18),
                new Student("Josh",8,17),
                new Student("A?...",6,21)});

        int result1,result2,result3,finalresult;
        int n=0;


        result1=(first.students[n].mark+first.students[n+1].mark+first.students[n+2].mark)/3;
        System.out.println("\nAverage media in "+first.UnName+" is "+result1);

        result2=(second.students[n].mark+second.students[n+1].mark+second.students[n+2].mark)/3;
        System.out.println("\nAverage media in "+second.UnName+" is "+result2);

        result3=(third.students[n].mark+third.students[n+1].mark+third.students[n+2].mark)/3;
        System.out.println("\nAverage media in "+third.UnName+" is "+result3);

        finalresult=(first.students[n].mark+first.students[n+1].mark+first.students[n+2].mark+second.students[n].mark+second.students[n+1].mark+second.students[n+2].mark+third.students[n].mark+third.students[n+1].mark+third.students[n+2].mark)/9;
        System.out.println("\nThe overall average media is "+finalresult);









    }








}
