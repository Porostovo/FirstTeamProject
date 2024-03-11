public class Main {
    public static void main(String[] args) {
    cheer();
    future("Saggitarius", 12);
    count();
    greet("hello", 5);
    }

    public static void future(String zodiac, int month) {
        System.out.println("Your zodiac is " + zodiac + "month" + month);
    }
    public static void future () {
        System.out.println("Saggitarius");
    }
    public static void cheer () {
        System.out.println("Hello Yellow Team!");
    }

    public static void count () {
        System.out.println(3);
    }
    public static void greet (String hello,int howMany){
        for (int i = 0; i < howMany; i++) {
            System.out.println(hello);
        }
    }

}
