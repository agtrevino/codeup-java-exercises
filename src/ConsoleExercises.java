import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        System.out.println("Enter an Integer");
//        int myInt = sc.nextInt();
//
//        System.out.println("You entered " + myInt + " :)");
//
//        System.out.println("Enter a String");
//        String myString = sc.next();
//
//        System.out.println("You entered " + myString + " :)");

//        System.out.println("Enter 3 words");
//        String myWords = sc.next();
//
//        System.out.println(myWords.split(""));

        System.out.println("What is the length?");
        String length = sc.nextLine();
        System.out.println("What is the width?");
        String width = sc.nextLine();

        double area = Double.parseDouble(length) * Double.parseDouble(width);
        System.out.println(area + " = " + length + " x " + width );
//        System.out.println("The perimeter is " + ((width *= width) += (length *= 2)));


    }
}
