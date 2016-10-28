package pl.ania;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Count {



    public List<String> readFile(String fileName){
        List<String> fileLines = new ArrayList<>();
        try {

            fileLines = Files.readAllLines(Paths.get(fileName));


        } catch (IOException IOe){
            System.out.println("IOException");
        }
        return fileLines;

    }


}
