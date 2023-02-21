package Assignment11;
import java.lang.reflect.Field;

class Employee{
    private int empid;
    private String empname;

    public Employee(int empid, String empname) {
        this.empid = empid;
        this.empname = empname;
    }

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empid=" + empid +
                ", empname='" + empname + '\'' +
                '}';
    }
}


public class Question3 {
    public static void main(String[] args) {

        try {
            Employee employee = new Employee(101, "Krati");
            Field privateField = Employee.class.getDeclaredField("empname");
            privateField.setAccessible(true);


            String empname = (String) privateField.get(employee);

            System.out.println("Name of Employee:"+empname);


        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
