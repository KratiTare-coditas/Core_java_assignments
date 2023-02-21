package Assignment12;
class ReinitializeString{
    String name="Shreya";
    ReinitializeString(){
        name="";
    }
    ReinitializeString(String name){
        this.name=name;
    }

    @Override
    public String toString() {
        return "ReinitializeString{" +
                "name='" + name + '\'' +
                '}';
    }
}
public class Question9 {
    public static void main(String args[]){
        ReinitializeString reinitializeString = new ReinitializeString();
        reinitializeString = new ReinitializeString("Krati");
        System.out.println(reinitializeString);
    }
}


//Output:ReinitializeString{name='Krati'}