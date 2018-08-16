package test;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

abstract class quiz {
    public static void main(String[] args){
        Path quizPath = Paths.get("../src/../src/test/quiz");
        System.out.println(quizPath.normalize());

    }
}
