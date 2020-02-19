import java.io.*;
import java.util.*;
import java.util.HashMap;

public class Filing {
    public static ArrayList<String> Dictionary = new ArrayList<>();

    public void dict(){

        File file = new File("C:\\Users\\Anmol Ali\\Desktop\\ITE207-WebCrawler-master\\Project\\src\\UrduNames.txt");
        try {
            BufferedReader eng = new BufferedReader(new FileReader(file));


            String poetName;

            while ((poetName = eng.readLine()) != null) {

                Dictionary.add(poetName);
            }
        }
        catch (Exception ex)
        {
            System.out.println(ex);
        }


    }
}
