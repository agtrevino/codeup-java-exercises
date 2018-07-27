import java.util.Scanner;

public class ChoiceGameBonus {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("You are Home, choose a path\nStore or Park?");
        String userInput = sc.nextLine().toUpperCase();
        System.out.println(choiceGame(userInput));
        String response1 = sc.nextLine().toUpperCase();
        System.out.println(choiceGamePart2(response1));
    }
    public static String choiceGame(String userInput){
        if (userInput.equals("STORE")){
            System.out.println("You chose The Store, now where to,\nSchool or Park?");
        } else if (userInput.equals("PARK")) {
            System.out.println("You chose The Park, now where to,\nZoo or Pool?");
        }
        return  "";
    }
    public static String choiceGamePart2(String response1){
        if (response1.equals("SCHOOL")){
            System.out.println("You chose The School");
        } else if (response1.equals("PARK")) {
            System.out.println("You chose The Park");
        } else if (response1.equals("PARK")) {
            System.out.println("You chose The Zoo");
        } else if (response1.equals("POOL")) {
            System.out.println("You chose The Pool");
        }
        return  "You lose\ngg";
    }
}
