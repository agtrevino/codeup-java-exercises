import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//      responses
        String empty = "";
        String sure = "Sure.";
        String chillOut = "Whoa, chill out!";
        String fine = "Fine. Be that way!";
        String whatever = "Whatever.";

        System.out.println("Say something to Bob.");

        int userInput = sc.nextInt();

        if (userInput.equals(empty)){
            System.out.println(fine);
        }else {
            System.out.println(whatever);
        }


    }
}
