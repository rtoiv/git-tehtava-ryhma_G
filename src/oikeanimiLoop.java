import java.util.Scanner;

public class oikeanimiLoop {
    public static void main(String[] args) {
       //lisätkää kommentilla nimenne tänne
       // Valtteri Santanen
        Scanner scanner = new Scanner(System.in);
        String oikeanimi = "Emma";
        int yritykset = 0;

        while (true) {
            
            System.out.println("Guess my name (type stop to exit)");
            String userInput = scanner.nextLine().trim();

            if (userInput.equalsIgnoreCase("stop")) {
                System.out.println("Thanks for playing! The correct name was: " + oikeanimi);
                break;
            }

            yritykset++;

            if (userInput.equalsIgnoreCase(oikeanimi)) {
                System.out.println("Congratulations!");
                System.out.println("You guessed " + yritykset + " times.");
                System.out.println("You are awesome!");
                break;
            } else {
                System.out.println("Try again!");
            }
        }

        
       
        scanner.close();
    }
}
