import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

public class GuessingGame {
    public static void main(String[] args) {
        int secretNumber = 8;
        int guess = 6;

        if (guess < secretNumber) {
            System.out.println("Too low");
        } else if (guess == secretNumber) {
            System.out.println("Correct!");
        } else if (guess > secretNumber) {
            System.out.println("Too high");
        }
    }
}