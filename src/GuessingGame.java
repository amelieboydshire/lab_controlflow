// public class GuessingGame {
//   public static void main(String[] args) {
//       int secretNumber = 8;
//        int guess = 6;

//        if (guess < secretNumber) {
//            System.out.println("Too low");
//        } else if (guess == secretNumber) {
//            System.out.println("Correct guess");
// } else if (guess > secretNumber) {
//             System.out.println("Too high");
//        }
//    }
//}

class WeatherCheck {
    public static void main(String[] args) {
        int temperature = 20;
        boolean currentlyRaining = false;

        if (temperature < 15 && currentlyRaining) {
            System.out.println("wear a waterproof coat");
        } else {
            System.out.println("wear shorts and sunscreen");
        }



    }
}