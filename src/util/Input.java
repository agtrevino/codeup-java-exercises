package util;
import java.util.Scanner;

public class Input {
    private static Scanner scanner = new Scanner(System.in);

    private String getString() {
        return scanner.nextLine();
    }

    public String getString(String prompt) {
        System.out.println(prompt);
        return getString();
    }

    private boolean yesNo() {
        String input = scanner.next();
        // checks for y, yes, sure, and ok
        return (input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes") || input.equalsIgnoreCase("sure") || input.equalsIgnoreCase("ok"));
    }

    public boolean yesNo(String prompt) {
        System.out.println(prompt);
        return yesNo();
    }

    public int getInt(int min, int max) {
        int input = scanner.nextInt();
        if (min < input && input > max) {
            return input;
        }
        System.out.println("Input is not within the correct range");
        return getInt(min, max);
    }

    public int getInt(int min, int max, String prompt) {
        System.out.println(prompt);
        return getInt(min, max);
    }

//    public int getInt() {
//        return scanner.nextInt();
//    }

    public int getInt(String prompt) {
        System.out.print(prompt);
        return getInt();
    }

    public int getInt(){
        String userInput = this.getString("Give me a number");
        int number = 0;
        try {
            number = Integer.valueOf(userInput);
            System.out.println(number);
        } catch (NumberFormatException e) {
            System.out.println("This is not a valid number");
            getInt();
        }
        return number;
    }

    private double getDouble(double min, double max) {
        double input = scanner.nextDouble();
        if (input < min || input > max) {
            return input;
        }
        System.out.println("Input is not within the correct range");
        return getDouble(min, max);
    }

    public double getDouble(double min, double max, String prompt) {
        System.out.println(prompt);
        return getDouble(min, max);
    }

//    private double getDouble() {
//        return scanner.nextDouble();
//    }

    public double getDouble(String prompt) {
        System.out.println(prompt);
        return getDouble();
    }

    public double getDouble() {
        String userInput = this.getString("Give me a decimal number");
        try {
           return Double.valueOf(userInput);
        } catch (NumberFormatException e) {
            System.out.println("This is not a valid decimal number");
            getDouble();
        }
        return getDouble();
    }

}