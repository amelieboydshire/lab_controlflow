public class WeatherCheck {

        public static void main(String[] args) {
            int temperature = 20;
            boolean currentlyRaining = false;

            if (temperature > 15 && currentlyRaining == false) {
                System.out.println("wear a t-shirt");
            } else if (temperature < 15 && currentlyRaining) {
                System.out.println("wear a jacket");
            } else if (temperature < 15 && !currentlyRaining == false ) {
                System.out.println("Wear a jumper");
            }
        }

    }

