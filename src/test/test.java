package test;
import java.util.HashMap;
import java.util.ArrayList;

public class test {
    public static void main(String[] args){
        ArrayList<String> roasts = new ArrayList<>();
        roasts.add("light");
        roasts.add("medium");
        roasts.add("dark");
        roasts.add("espresso");

        System.out.println(roasts);

        roasts.remove("espresso");
        roasts.remove(2);
        System.out.println(roasts);

        HashMap<String, String> usernames = new HashMap<>();
        usernames.put("Ryan", "ryanorsinger");
        usernames.put("Luis", "MontealegreLuis");
        usernames.put("Zach", "zgulde");
        usernames.put("Fernando", "fmendozaro");
        usernames.put("Justin", "jreich5");
        usernames.get("Ryan"); // "ryanorsinger"
        usernames.get("Phillip"); // null
        usernames.getOrDefault("Kay", "gocodeup");
        usernames.containsKey("Luis"); // true
        usernames.containsValue("zgulde"); // true

        System.out.println(usernames);
    }



}
