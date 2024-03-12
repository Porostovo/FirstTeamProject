public class Main {
    public static void main(String[] args) {
        future("this");
        greet("nazdar");
        cheer("our favourite");
        count(1994);
    }


    public static void future(String something) {
        System.out.println("Your future looks like " + something);
        System.out.println("printout"); // changed
    }

    public static void cheer(String word){
        System.out.println("Hello" + word + "Yellow Team!");

    }

    public static void count(int a) {
        System.out.println("Counting the countless" + a);

    }

    public static void greet(String hello) {
        System.out.println(hello);
    }
}

