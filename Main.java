import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Hello, Let's go play guess number? Well, you need only type below a number between 1 and 100 and I'll check if you put the number right. Ready? Go ahead and Good Luck :-P!");

    int num = rand.nextInt(100)+1;
    int guess = 0;
    int guesses = 0;

    while(guess !=num) {
        guess = scan.nextInt();
        guesses++;

        if(guess < num) {
            System.out.println("It's higher");
        } else if (guess > num) {
            System.out.println("It's lower!");
        }
    }

    System.out.println("Congrats my guest! You have guessed the number in " + guesses + " guesses!");
    }
}

