import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        boolean isTrue = true;
        while (isTrue) {
            try{
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter a test value:");
                String input = sc.nextLine();
                int test;
                test = Integer.parseInt(input);
                if (test != 0) {
                    System.out.println("The value entered is not 0");
                    if (test > 5) {
                        System.out.println("The value entered is bigger than 5");
                        if (test >= 10) {
                            System.out.println("The value entered is bigger or equal to 10");
                            if (test == 99) {
                                isTrue = false;
                            }
                        }
                    } else if (test < -5) {
                        System.out.println("The value entered is smaller than -5");
                        if (test <= -10) {
                            System.out.println("The value entered is smaller or equal to -10");

                        }
                    }
                } else if (test == 0) {
                    System.out.println("The value entered is 0");
                } else {
                    System.out.println("idk how did you get here");
                }
            }catch (Exception e){
                System.out.println("Enter valid value!");
            }
        }

    }
}

