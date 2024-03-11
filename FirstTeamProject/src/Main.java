public class Main {
    public static void main(String[] args) {
    cheer();
    future("this");
    count();
    greet("hello", 5);
    
    }

    public static void future(String something){
        System.out.println("Your future looks like " + something);
    }
    public static void cheer(){
        System.out.println("Hello Yellow Team!");
    }

    public static void count() {
        System.out.println(3);
    }
    public static void greet(String hello, int howMany){
        for (int i = 0; i < howMany; i++) {
            System.out.println(hello);
        }
    }
}
