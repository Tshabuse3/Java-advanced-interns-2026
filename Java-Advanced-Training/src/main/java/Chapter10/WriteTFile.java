package Chapter10;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;

/**
 * @author : Livhuwani Tshabuse
 * Project : IntelliJ IDEA
 * Date : 10/15/2026
 **/
public class WriteTFile {
    public static void main(String[] args) {
        //Path
        String filePath = "src/main/resources/Hobbies.txt";
        //Create a file resource
        File hobbiesFile = new File(filePath);
        //PrintStream is aPen to write
        try {

            //Write to a file
            PrintStream pen = new PrintStream(hobbiesFile);
            pen.println("Tennis");
            pen.println("Soccer");
            pen.println("Hiking");
            //Instruct a pen that you're done writing
            pen.close();
        } catch (FileNotFoundException ex) {
            System.err.println("File not found...." + ex.getMessage());
        } catch (IOException ex) {
            System.err.println("Cannot write to the file");
        }
    }
}