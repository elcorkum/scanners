package scanners;

import java.util.Scanner;

public class AliceAndBob {
    public static void getUserName () {
            Scanner stringScanner = new Scanner(System.in);

            do {
                System.out.println("Please enter valid username: ");
                String name = stringScanner.nextLine();
                if (name.equalsIgnoreCase("Bob")) {
                    System.out.println("Welcome Bob!");
                    break;

                } else if (name.equalsIgnoreCase("Alice")) {
                    System.out.println("Welcome Alice!");
                    break;
                }

            } while (true);




        }


    public static void main(String[] args) {
        getUserName();

    }
}
