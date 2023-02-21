package Assignment12;

import java.util.StringTokenizer;
class TokenDemo {
    public void display() {
        StringTokenizer stringTokenizer = new StringTokenizer("Hi,all. How are you?", "?,.");
        while (stringTokenizer.hasMoreTokens()) {
            //System.out.println(stringTokenizer.nextToken());
            System.out.println(stringTokenizer.nextToken());
        }
    }
}

    public class Question7 {
        public static void main(String[] args) {
            TokenDemo tokenDemo = new TokenDemo();
            tokenDemo.display();
        }
    }

/*output:Hi
        all
        How are you*/
