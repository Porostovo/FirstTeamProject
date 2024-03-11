public class Main {
    public static void main(String[] args) {
    cheer();
    future();
    count(1994, 3);
    greet("Ondrej");
    }

    public static void future(){
        System.out.println("Saggitarius");

    }
    public static void cheer(){
        System.out.println("Hello Yellow Team!");
    }

    public static void count(int year, int month) {
        System.out.println(year + " " + month + " age: " + 29);


    }
    public static void greet(String greetings){
        System.out.println("Hello " + greetings);
    }
}
