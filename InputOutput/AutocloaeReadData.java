// Try with Resources
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class AutocloaeReadData {
    public static void main(String[] args) {
        try(FileInputStream fis = new FileInputStream("fies/a.txt")) {
            int data;
            while((data = fis.read())!= -1) {
                System.out.print((char)data);
            }
        } 
        catch(FileNotFoundException e) {
            e.printStackTrace();
        }
        catch(IOException e) {
            e.printStackTrace();
        } 
    }
}
