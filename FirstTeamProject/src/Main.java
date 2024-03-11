public class Main {
    public static void main(String[] args) {
        cheer(2);
        count(1994, 3);
        future("Saggitarius", 12);
        greet("hello", 5);

    }

    public static void future(String zodiac, int month) {
        System.out.println("Your zodiac is " + zodiac + "month" + month);


    }
    public static void cheer(int b){
        System.out.println("Hello" + b + "Yellow Team!");

    }

    public static void future() {
        System.out.println("Saggitarius");
    }


    public static void count(int year, int month) {
        System.out.println(year + " " + month + " age: " + 29);

    }

    public static void greet(String hello, int howMany) {
        for (int i = 0; i < howMany; i++) {
            System.out.println(hello);
        }
    }
}
