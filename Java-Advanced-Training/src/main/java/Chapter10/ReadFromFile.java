package Chapter10;

import java.io.*;

/**
 * @author : Livhuwani Tshabuse
 * Project : IntelliJ IDEA
 * Date : 10/15/2026
 **/
public class ReadFromFile {
    public static void main(String[] args) {
        String  filePath = "src/main/resources/Modules.txt";
        File moduleFile = new File(filePath);
        String text;
        try {
            // Opens or Prepares files for reading
            FileReader fileReader = new FileReader(moduleFile);
            //Read contents of the file
            BufferedReader reader = new BufferedReader(fileReader);


            while((text = reader.readLine()) != null){
                System.out.println(text);
                text = reader.readLine();
            }

            reader.close();
            fileReader.close();
        }catch(IOException e){
            System.err.println(e.getMessage());
        }

    }
}
// BufferedReader br = new BufferedReader()