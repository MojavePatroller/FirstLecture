import java.util.Scanner;

public class HelloWorld {
    public void greet() {
        String greeting = "Hello";
        System.out.print(greeting + " world!");
    }

    public static void main(String[] args) {
        System.out.println("in main");

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = scan.nextLine();

        System.out.printf("%s",name);

        /*
        for(String a : args) {
            System.out.println(a);
        }
        */
    }
}
