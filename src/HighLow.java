import java.util.Scanner;

public class HighLow {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

//        int max = 100;
//        int min = 1;
//
//        int randomNumber = (int)(Math.random() * ((max - min) + 1)) + min;
//
//        String higher = "Higher!";
//        String lower = "Lower!";
//        String correct = "Good guess!";
//
//        System.out.print("Guess the number");
//        int userInput = sc.nextInt();
//
//        do {
//            if (userInput < randomNumber) {
//                System.out.println(higher);
//                userInput = sc.nextInt();
//            } else if (userInput > randomNumber) {
//                System.out.println(lower);
//                userInput = sc.nextInt();
//            }
//        } while (userInput != randomNumber);
//        if (userInput == randomNumber) {
//            System.out.println(correct);
//        }

//        System.out.println(randomWithRange(50, 60));
        System.out.println("Enter a word");
        String userInput = sc.nextLine();
        System.out.println(countVowels(userInput));
    }

//    public static int randomWithRange(int min, int max) {
//                int range = (max - min) + 1;
//                return (int)(Math.random() * range) + min;
//            }

    public static String countVowels(String userInput){
        int countAs = 0;
        int countEs = 0;
        int countIs = 0;
        int countOs = 0;
        int countUs = 0;

        for (int charIndex = 0; charIndex < userInput.length(); charIndex++){
            char charAtIndex = userInput.charAt(charIndex);
            if (charAtIndex == 'a' || charAtIndex == 'A') {
                countAs++;
            } else if(charAtIndex == 'e' || charAtIndex == 'E'){
                countEs++;
            } else if(charAtIndex == 'i' || charAtIndex == 'I'){
                countIs++;
            } else if(charAtIndex == 'o' || charAtIndex == 'O'){
                countOs++;
            } else if(charAtIndex == 'u' || charAtIndex == 'U'){
                countUs++;
            }
        }
        return userInput
                + "\nA\'s: " + countAs
                + "\nE\'s: " + countEs
                + "\nI\'s: " + countIs
                + "\nO\'s: " + countOs
                + "\nU\'s: " + countUs;
    }


}
