package helloworld;

import java.util.Scanner;

public class HelloWorld {
    /**
     * @param args command line arguments
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in); // open scanner

        String s = scan.nextLine(); // read the next token and save it to 's'

        scan.close(); // close scanner

        System.out.println("Hello, World.");

        System.out.println(s);

    }
}
