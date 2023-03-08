package Seventhweek.ResourceforCollection;
import java.util.*;
import java.util.HashSet;

class Studentdetails{
    String name;
    int rollno;

    @Override
    public String toString() {
        return "Studentdetails{" +
                "name='" + name + '\'' +
                ", rollno=" + rollno +
                '}';
    }

    public Studentdetails(String name, int rollno) {
        this.name = name;
        this.rollno = rollno;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Studentdetails that = (Studentdetails) o;
        return rollno == that.rollno;
    }

    @Override
    public int hashCode() {
        return Objects.hash(rollno);
    }
}
public class Student {
    public static void main(String[] args) {
    Set<Studentdetails> studentset=new HashSet<>();
    studentset.add(new Studentdetails("Krati",101));
    studentset.add(new Studentdetails("Shreya",102));
    studentset.add(new Studentdetails("Mrunmayi",103));
     studentset.add(new Studentdetails("Rohit",101));
        System.out.println(studentset);
        Studentdetails s1=new Studentdetails("Anuj",1);
        Studentdetails s2=new Studentdetails("Krati",1);
        System.out.println(s1.equals(s2));

    }
}
