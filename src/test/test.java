package test;
import java.awt.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main(String[] args) {
//        ArrayList<String> roasts = new ArrayList<>();
//        roasts.add("light");
//        roasts.add("medium");
//        roasts.add("dark");
//        roasts.add("espresso");
//
//        System.out.println(roasts);
//
//        roasts.remove("espresso");
//        roasts.remove(2);
//        System.out.println(roasts);
//
//        HashMap<String, String> usernames = new HashMap<>();
//        usernames.put("Ryan", "ryanorsinger");
//        usernames.put("Luis", "MontealegreLuis");
//        usernames.put("Zach", "zgulde");
//        usernames.put("Fernando", "fmendozaro");
//        usernames.put("Justin", "jreich5");
//        usernames.get("Ryan"); // "ryanorsinger"
//        usernames.get("Phillip"); // null
//        usernames.getOrDefault("Kay", "gocodeup");
//        usernames.containsKey("Luis"); // true
//        usernames.containsValue("zgulde"); // true
//
//        System.out.println(usernames);


//        Path fileLecturePath = Paths.get("src/test", "FileIOLecture.java");
//        System.out.println(fileLecturePath.toAbsolutePath());
//
//        Path otherPath = Paths.get("src/", "../", "src", "test", "test.java");
//
//        System.out.println(otherPath.toAbsolutePath().normalize());
//
//        System.out.println(Files.exists(Paths.get("bob.txt")));

//        String directory = "data";
//        String filename = "info.txt";
//        Path dataDirectory = Paths.get(directory);
//        Path dataFile = Paths.get(directory, filename);
//
//        if (!Files.exists(dataDirectory)){
//            System.out.println("path doesn\'t exist yet, bro ");
//            try{
//                Files.createDirectories(dataDirectory);
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//
//        if (!Files.exists(dataFile)) {
//            try {
//                Files.createFile(dataFile);
//            } catch (IOException e ){
//                e.printStackTrace();
//            }
//        }

        Path p =  Paths.get("data" , "info.txt");

        List<String> names = new ArrayList<>();
        names.add("Tim");
        names.add("Joe");
        names.add("Sally");

        try {
            Files.write(p, names, StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }

        String directory= "data";
        String filename = "info.txt";
        Path dataDirectory = Paths.get(directory);
        Path dataFile = Paths.get(directory, filename);

        List <String> nums = new ArrayList<>();
        nums.add("1");
        nums.add("2");
        nums.add("3");

        try {
                Files.write(dataFile, nums, StandardOpenOption.APPEND);
            } catch(IOException e) {
                System.out.println("Exception!!!");
                e.printStackTrace();
            }
    }
}
