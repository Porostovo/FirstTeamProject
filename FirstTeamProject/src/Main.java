public class Main {
    public static void main(String[] args) {
        future(125);
        greet("nazdarek", "kamo");
        cheer("our favourite");
        count(1994);
    }


    public static void future(int something) {
        System.out.println("Your future looks like a number " + something);
        System.out.println("printout"); // changed
    }

    public static void cheer(String word){
        System.out.println("Hello" + word + "Yellow Team!");

    }

    public static void count(int a) {
        System.out.println("Counting the countless" + a);

    }

    public static void greet(String hello, String name) {
        System.out.println(hello);
        System.out.println(hello + " " + name);
    }
}

