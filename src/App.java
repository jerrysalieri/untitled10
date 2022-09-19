import java.util.Scanner;
public class App {
    public static void main(String[]args){
        String name;
        String surname;
        int age;
        String in;
        Scanner sc= new Scanner(System.in);
    System.out.println("Welcome to 'Find your activity' program!");
        System.out.println("How about tell us your name?");
        name=sc.nextLine();
        System.out.println("And surname please.");
        surname=sc.nextLine();
        if(name.equals("Tyler")&&surname.equals("Durden")){
            System.out.println("Are we the same person?");
            System.out.println("Nevermind, just joking.");
        }
        System.out.println("");
        System.out.println("Welcome "+name+ " "+surname+" to your profile.");
        System.out.println("Please enter your age.");
        in=sc.nextLine();
        age=Integer.parseInt(in);
        if(age<=6){
            System.out.println("It seems like that you need to go to the kindergarten before going to the school.");

        }
        else if(age>=7&&age<=17){
            System.out.println("In your age it is the best to go to school.");

        }
        else if(age>=18&&age<=22){
            System.out.println("Try to apply to University.");

        }
        else if(age>=23&&age<=60){
            System.out.println("You should get a work.");

        }
        else if(age>60){
            System.out.println("You should probably get retired");

        }
        else if(age>100){
            System.out.println("Wow, you have turned 100. Congratulations!");

        }
        else{
            System.out.println("Try to enter an actual number");

        }







    }
}
