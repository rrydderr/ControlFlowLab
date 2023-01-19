import java.util.Scanner;

public class ControlFlowLab {
    public static void main(String[] args) {
// prompt user to input the first letter of their name
        System.out.println("Who is your member of the Simpsons Family?");
        //collect user input
        Scanner reader = new Scanner(System.in);
        String favouriteSimpson = reader.nextLine();

        //if answer is Homer, ask for secret number
        if (favouriteSimpson.equals("Homer")) {
            System.out.println("What is the secret number?");
            Scanner reader2 = new Scanner(System.in);
            int secretNumber = reader2.nextInt();
            //if input is more than 5, print 'too high'
            if (secretNumber > 5) {
                System.out.println("Nope, too high :/");
            }
            //else if input is less than 5, print 'too low'
            else if (secretNumber < 5) {
                System.out.println("Nope, too low :/");
            }
            //else print 'that's right'
            else {
                System.out.println("That's right! :) ");
            }
        }
        //if answer is marge ask user for secret number
        else if (favouriteSimpson.equals("Marge")) {
            System.out.println("What is the secret number?");
            Scanner reader2 = new Scanner(System.in);
            int secretNumber = reader2.nextInt();
            //if input is more than 6 print 'too high'
            if (secretNumber > 6) {
                System.out.println("Nope, too high :/");
            }
            //else if input ios less than 6 print 'too low'
            else if (secretNumber < 6) {
                System.out.println("Nope, too low :/");
            }
            //else, print 'that's right'
            else {
                System.out.println("That's right!");
            }
        }
        //if answer is Lisa, ask user for secret number
        else if (favouriteSimpson.equals("Lisa")) {
            System.out.println("What is the secret number?");
            Scanner reader2 = new Scanner(System.in);
            int secretNumber = reader2.nextInt();
            //if input is more than 7 print 'too high'
            if (secretNumber > 7) {
                System.out.println("Nope, too high :/");
            }
            //else if input is less than 7 print 'too low'
            else if (secretNumber < 7) {
                System.out.println("Nope, too low :/");
            }
            //else print 'that's right'
            else {
                System.out.println("That's right!");
            }
        }

        //if answer is bart ask for secret number
        else if (favouriteSimpson.equals("Bart")) {
            System.out.println("What is the secret number?");
            Scanner reader2 = new Scanner(System.in);
            int secretNumber = reader2.nextInt();
            //if secret number is more than 8 print too high
            if (secretNumber > 8) {
                System.out.println("Nope, too high :/");
            }
            //else if input is less than 8 print 'too low'
            else if (secretNumber < 8) {
                System.out.println("Nope, too low :/");
            }
            //else print 'that's right'
            else {
                System.out.println("That's right!");
            }
        }

        //if answer is maggie, ask user for secret number
        else if (favouriteSimpson.equals("Maggie")) {
            System.out.println("What is the secret number?");
            Scanner reader2 = new Scanner(System.in);
            int secretNumber = reader2.nextInt();
            //if number is more than 9, print 'too high'
            if (secretNumber > 9) {
                System.out.println("Nope, too high :/");
            }
            //if input is less than 9 print 'too low'
            else if (secretNumber < 9) {
                System.out.println("Nope, too low :/");
            }
            //else print 'that's right'
            else {
                System.out.println("That's right!");
            }
        }
    }
}