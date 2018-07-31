import java.util.Scanner;

public class HangmanGameBonus {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("whats the word bih?");
        String hangmanWord = sc.nextLine();
        System.out.println(hangman(hangmanWord));



    }
    public static String hangman(String hangmanWord) {
        Scanner sc = new Scanner(System.in);
        int charIndex;
        int guessCount = 0;
        do {
            boolean guessCorrect = false;
            System.out.println("whats the guess?");
            String guess = sc.nextLine();
            char guessLetter = guess.charAt(0);
            for (charIndex = 0; charIndex < hangmanWord.length(); charIndex++){
//                System.out.println(guess);
//                System.out.println(hangmanWord.charAt(charIndex));
                if (guessLetter == hangmanWord.charAt(charIndex)){

                    System.out.println("correct!");

                    guessCorrect = true;
                }
            }
            if(!guessCorrect){
                guessCount++;
                System.out.println("you have " + (10 - guessCount) + " guesses left!");
            }


        }
        while (guessCount < 3);
        return "";
    }
}
