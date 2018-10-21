package paranthesis;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        String string = "(29 + 4) - (3(2+76) + 55)";

        int counter1=0;
        int counter2=0;

        char bracket1 = '(';
        char bracket2 = ')';

//        for(int i = 0; i< string.length(); i++){
//           if (string.charAt(i) == bracket1 ){
//               counter1++;
//           }
//            if (string.charAt(i) == bracket2 ){
//                counter2++;
//            }
//        }
//
//        System.out.println(counter1+" also "+counter2);
//        if (counter1 == counter2) {
//            System.out.println("Expression is fine.");
//        } else
//        { System.out.println("Expression is not fine.");}


// this one creates files

//        try {
//            File file = new File("javaFile1123.txt");
//            if (file.createNewFile()) {
//                System.out.println("New File is created!");
//            } else {
//                System.out.println("File already exists.");
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }



//        PrintWriter pw = new PrintWriter(file, true); // true for auto-flush
        File flee = new File("C:\\Users\\Mike\\Desktop\\lab4oop\\foroop.txt");
        try {
            FileWriter fw = new FileWriter(flee, true); // true for appending


            PrintWriter pw = new PrintWriter(fw, true); // true for auto-flush
            pw.println("1. 2x - 3y + 25 / (2+5)*12 - ((29*4-2) + 32) -14");
            pw.println("It works with one line, I can't divide line.");
//            pw.println("2x - 3y + 25 / (-((29*4-2) + 32) -14 - (2+5)*12");
//            pw.println("((((((((((((((((((((2x-4y * 98 )))))))))))))))))))))");
            pw.close();
        }catch (IOException e) {
            e.printStackTrace();
        }


        try {
        BufferedReader br = new BufferedReader(new FileReader(flee));

        String st;
        while ((st = br.readLine()) != null) {
            System.out.println(st);
            // hope it works
            for (int i = 0; i < st.length(); i++) {
                if (st.charAt(i) == bracket1) {
                    counter1++;
                }
                if (st.charAt(i) == bracket2) {
                    counter2++;
                }
            }

        }
            System.out.println(counter1+" also "+counter2);
            if (counter1 == counter2) {
                System.out.println("Expression is fine.");
            } else
            { System.out.println("Expression is not fine.");}


        //try my if here
        }catch (IOException e) {
            e.printStackTrace();
        }




    }
}
