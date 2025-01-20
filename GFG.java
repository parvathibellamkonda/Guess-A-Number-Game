import java.util.Random;
import java.util.Scanner;

class guessGame {
    int guessedNumber;
    int userNumber;
    int guess_count;
    public guessGame() {
        Random rand = new Random();
        guessedNumber = rand.nextInt(100);
    }
    void userNum() {
        System.out.println("GUESS THE NUMBER");
        Scanner sc = new Scanner(System.in);
        userNumber = sc.nextInt();
    }
    boolean isNumCorrect() {
        guess_count++;
        if (userNumber == guessedNumber) {
            System.out.printf("yes you guessed it right in %d guesses", guess_count);
            return true;
        } else if (userNumber < guessedNumber) {
            System.out.println("too low");
        } else {
            System.out.println("too high");
        }
        return false;
    }
}
public class GFG {
    public static void main(String[] args) {
        guessGame g = new guessGame();
        boolean b = false;
        while (!b) {
            g.userNum();
            b = g.isNumCorrect();
        }
    }
}
