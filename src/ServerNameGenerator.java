import java.util.Random;
public class ServerNameGenerator {

    private static String[] adjectives = {
            "Whithering",
            "Sticky",
            "Crunchy",
            "Gooey",
            "Parsimonious",
            "Fuzzy",
            "Bumpy",
            "Loquacious",
            "Nefarious",
            "Foxy"
    };

    private static String[] nouns = {
            "Coffee",
            "Noodle",
            "Shoebox",
            "Coupon",
            "Chicken Strip",
            "Dancer",
            "Feline",
            "Dump-Truck",
            "Cowboy",
            "Manager"
    };

    private static String getRandomElement(String[] strings){
      return strings[getRandomNumberInRange(0, strings.length -1)];
    }

    private static int getRandomNumberInRange(int min, int max) {
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }

    public static void main(String[] args) {
        System.out.printf(
                "Here is your server name:%n%s-%s",
                getRandomElement(adjectives),
                getRandomElement(nouns));
        System.out.println();
    }
}
