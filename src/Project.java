import java.util.Scanner;
public class Project {
    public static void main(String []args){
        Scanner sc= new Scanner(System.in);
        boolean isTrue=true;
        String name;
        String ageInput;
        int age;
        String bookInput;
                System.out.println("Welcome! Please enter your name:");
        name=sc.nextLine();
        System.out.println("Welcome "+ name+ ", let's pick a book for you!");
        System.out.println("");
        System.out.println("Please enter your age:");
        ageInput = sc.nextLine();
        age = Integer.parseInt(ageInput);
        while (isTrue) {

            System.out.println("Please tell us what are your favourite book genre is or either type 'Exit' if you want to quit:");
            bookInput = sc.nextLine();
            if(bookInput.equals("Exit")){
                isTrue=false;
            }
            if (age < 13) {
                System.out.println("Try Narwhal:Unicorn of the Sea");
            }
            if (age > 13 && age < 17) {

                if (bookInput.equals("Detectives")) {
                    System.out.println("Try 'Secret of the old clock' written by Carolyn Keene");
                } else if (bookInput.equals("Science-fiction")) {
                    System.out.println("Try 'Want' written by Cindy Pon");
                } else if (bookInput.equals("Fantasy")) {
                    System.out.println("Try 'Hobbit' written by J.R.R. Tolkien");
                } else if (bookInput.equals("Manga")) {
                    System.out.println("Try 'Attack on Titan' written by Hajime Isayama");
                } else {
                    System.out.println("We don't know this genre, but we would try out 'Harry Potter' series by J.K. Rowling");
                }

            }
            if (age >= 17) {
                if (bookInput.equals("Detectives")) {
                    System.out.println("Try 'Career of Evil' written by J.k. Rowling");
                } else if (bookInput.equals("Science-fiction")) {
                    System.out.println("Try 'Children of Time' written by Adrian Tchaikovsky");
                } else if (bookInput.equals("Fantasy")) {
                    System.out.println("Try 'Game of Thrones' written by George Martin");
                } else if (bookInput.equals("Manga")) {
                    System.out.println("Try 'Berserk' written by Miura Kentaro");
                } else {
                    System.out.println("We don't know this genre, but we would try out 'The Cather in the Eye' written by J. D. Salinger");
                }
            }

        }
    }
}
