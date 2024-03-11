public class Main {
    public static void main(String[] args) {
    cheer();
<<<<<<< HEAD
    future();
    count(1994, 3);
    greet();
=======
    future("Saggitarius", 12);
    count();
    greet("hello", 5);
>>>>>>> 57df70094a5e17ec98020f4c9b152600e61f300d
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

<<<<<<< HEAD
    public static void count(int year, int month) {
        System.out.println(year + " " + month + " age: " + 29);


=======
    public static void count () {
        System.out.println(3);
>>>>>>> 57df70094a5e17ec98020f4c9b152600e61f300d
    }
    public static void greet (String hello,int howMany){
        for (int i = 0; i < howMany; i++) {
            System.out.println(hello);
        }
    }

}
