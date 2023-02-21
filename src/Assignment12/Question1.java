package Assignment12;

import javax.swing.*;

public class Question1 {
    public static void main(String[] args) {
        String name1 = "Krati Tare";
        String name2 = "Shreya kalluraya";
        String name3 = "Yash Paliwal";

        if (name1.length() < name2.length() && name1.length() < name3.length()) {
            System.out.println(name1);
            if (name2.length() > name3.length()) {

                System.out.println(name3);
                System.out.println(name2);
            } else {
                System.out.println(name3);
                System.out.println(name2);
            }
        } else if (name2.length() > name1.length() && name2.length() > name3.length()) {
            System.out.println(name2);
            if (name1.length() > name3.length()) {
                System.out.println(name1);
                System.out.println(name3);
            } else {
                System.out.println(name3);
                System.out.println(name1);
            }
        } else {
            System.out.println(name3);
            if (name1.length() > name2.length()) {
                System.out.println(name1);
                System.out.println(name2);
            } else {
                System.out.println(name2);
                System.out.println(name1);
            }
        }
    }
}




