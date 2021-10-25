import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    private static Scanner scanner;

    public static void main(String[] args) {
        displayRules();
        System.out.println();
        System.out.println("Continue? ");
        String toContinue = userOption();
        if (toContinue.equalsIgnoreCase("y")) {
            //play game
            System.out.println();
            playGame();
        } else {
            //end game
            endGame();
        }

    }

    private static String userOption() {
        scanner = new Scanner(System.in);
        String userChoice = scanner.next();
        return userChoice;
    }
    private static int userDayOption() {
        scanner = new Scanner(System.in);
        int userChoice = scanner.nextInt();
        return userChoice;
    }

    private static void playGame() {
        displayInventory();
    }

    private static void displayInventory() {
        System.out.println("Inventory/Purchasing");
        System.out.println();
        System.out.println("You have");
        userDaysOfPlay();
        displayWeather();
    }

    private static void displayWeather() {
        int temp = makeRandomTemp();
        System.out.printf("Temperature: %s'F ", temp);
        System.out.println();
        String weather = makeRandomWeather();
        System.out.println("Weather: " + weather);
    }

    private static String makeRandomWeather() {
        final ArrayList<String> weatherConditions = new ArrayList<>();
        weatherConditions.add("Sunny clear");
        weatherConditions.add("Hazy");
        weatherConditions.add("Rain");
        weatherConditions.add("OverCast");
        Random random = new Random();
        return weatherConditions.get(random.nextInt(weatherConditions.size()));
    }

    private static int makeRandomTemp() {
        Random r = new Random();
        int low = 30;
        int high = 110;
        int result = r.nextInt(high-low) + low;
        return result;
    }

    private static int userDaysOfPlay() {
        int days = 0;
        do {
            System.out.println("How many days would you like to play?");
            System.out.println("Options: 7 days, 14 days or 30 days");
          days = userDayOption();
        }while (days != 7 && days != 14 && days != 30);

        return days;
    }

    private static void endGame() {
        System.out.println("Good-Bye!");
    }

    private static void displayRules() {
        System.out.println("INTRODUCTION");
        System.out.println();
        System.out.println("Your goal is to make as much money as you can in 7, 14, or 30 days by selling lemonade at your lemonade stand.\n Buy cups, lemons, sugar, and ice cubes, then set your recipe based on the weather and conditions.\n Start with the basic recipe, but try to vary the recipe and see if you can do better.\n Lastly, set your price and sell your lemonade at the stand.\n Try changing up the price based on the weather conditions as well.\n At the end of the game, you'll see how much money you made.\n Write it down and play again to try and beat your score!");
    }
}
