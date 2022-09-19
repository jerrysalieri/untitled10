import java.util.Scanner;
import java.util.Random;

// #2
public class App {
    public static void main(String[] args) {
        String play;
        boolean isTrue = true;
        boolean status = true;
        int attempts = 0;
        int number;
        String input;
        Scanner sc = new Scanner(System.in);
        while (status) {
            System.out.println("Do you want to play the game?");
            play = sc.nextLine();

            if (play.equals("no")) {
                System.out.println("Why the heck did you come here then?");
                status = false;
                System.exit(0);
            } else if (play.equals("yes")) {
                System.out.println("Wish you great luck then!");
                status = false;
            } else {
                System.out.println("Print the actual answer!");
            }
        }
        try {
            Random random = new Random();
            int x = random.nextInt(11);
            System.out.println("Try to guess the number");
            while (isTrue) {
                attempts++;


                input = sc.nextLine();
                number = Integer.parseInt(input);
                if (number == x) {
                    System.out.println("Congrats! You guessed the number");
                    System.out.println("Attempts: " + attempts);
                    isTrue = false;

                }
                if (number < x) {
                    System.out.println("Try bigger");
                } else if (number > x) {
                    System.out.println("Try smaller");

                } else if (number > 10 || number < 0) {
                    System.out.println("Please enter a value from '0' to '10'");
                }


            }
        } catch (Exception e) {
            System.out.println("I think you probably mess up this program.");
        }

    }
}
