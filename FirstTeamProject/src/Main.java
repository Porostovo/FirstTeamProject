public class Main {
    public static void main(String[] args) {

    cheer();
    future("this");
    count();
    greet("hello", 5);
    
    }

    public static void future(String something){
        System.out.println("Your future looks like " + something);

        int a = 1;
        int b = 2;


        cheer(a,b);
        count(1994, 3);
        future("Saggitarius", 12);
        greet("hello", 5);
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
