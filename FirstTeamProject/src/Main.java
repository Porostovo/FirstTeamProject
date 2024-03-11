public class Main {
    public static void main(String[] args) {

    future("this");
    greet("hello", 5);
    cheer(1,2);
    count(1994);
      
    }

    public static void future(String something){
        System.out.println("Your future looks like " + something);
    }

    public static void future(String zodiac, int month) {
        System.out.println("Your zodiac is " + zodiac + "month" + month);
    }

    public static void cheer(int a, int b) {
        System.out.println("Hello Yellow Team! " + a + b);
    }

    public static void count(int a) {
        System.out.println("Counting the countless" + a);

    }

    public static void greet(String hello, int howMany) {
        for (int i = 0; i < howMany; i++) {
            System.out.println(hello);
        }
    }
}
