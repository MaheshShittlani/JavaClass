import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopytTextFiles {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader(args[0]);
            FileWriter writer = new FileWriter(args[1]);


            char[] data = new char[4096];
            int length;
            long startTime = System.currentTimeMillis();
            while((length = reader.read(data)) != -1) {
                writer.write(data, 0 , length);
            }
            long endTime  = System.currentTimeMillis();
            reader.close();
            writer.close();

            System.out.println("Time Taken: "+ (endTime - startTime) +" milli Seconds ");
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
