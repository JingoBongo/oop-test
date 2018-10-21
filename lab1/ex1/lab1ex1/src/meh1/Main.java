
package meh1;

import java.util.Scanner;

import java.awt.*;
import java.awt.Dimension;




public class Main {
    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//
//        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
//        int height = screenSize.height;
//        int width  = screenSize.width;
//        // System.out.println(screenSize.height +"-=-=-=-=-"+ screenSize.width);
//        String name ="First";
//        String color="RED";
//        Monitor.addMonitor(name,height,width,color);
//
//
//        Monitor[] array;
//        array = new Monitor[10];
//
//        for (int i=0; i<2; i++){
//
//
//            System.out.println( "\n Name of new monitor:");
//            array[i].name=sc.nextLine();
//
//            System.out.println("\n Height:");
//            array[i].height = sc.nextInt();
//
//            System.out.println("\n Width:");
//            array[i].width = sc.nextInt();
//
//            System.out.println("\n Color:");
//            array[i].color = sc.nextLine();

    Monitor mon = new Monitor("HD",16 ,13,"Blue");
    Monitor mon2= new Monitor("PANASONIC", 18, 13,"Yellow");


    // Update prop.
    mon.color="Spicy green";

    //Comparing... by size! and by color.


        System.out.println( (mon.height+mon.width)<(mon2.height+mon2.width) ?
                "Second monitor is bigger.\n" : (mon.height+mon.width)>(mon2.height+mon2.width) ?
                "First monitor is bigger.\n":
                "They are equal or at least have the same diagonal.\n");

        System.out.println( mon.color.equals(mon2.color) ?
                "They have the same color.\n" : "They do not have the same color.\n" );

        System.out.println( mon.name.equals(mon2.name) ?
                "They are from one firm.": "They are not from one firm." );

    }
}

