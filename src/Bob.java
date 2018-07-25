import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//      responses
        String sure = "Sure.";
        String chillOut = "Whoa, chill out!";
        String fine = "Fine. Be that way!";
        String whatever = "Whatever.";

        System.out.println("Say something to Bob.");

        String userInput = sc.nextLine().trim();

        if (userInput.endsWith("?")){
            System.out.println(sure);
        } else if (userInput.endsWith("!") || userInput.equals(userInput.toUpperCase())){
            System.out.println(chillOut);
        } else if (userInput.toUpperCase().equals("BOB") || userInput.isEmpty()){
            System.out.println(fine);
        } else {
            System.out.println(whatever);
        }

    }
}
