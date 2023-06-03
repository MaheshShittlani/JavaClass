import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteData {
    public static void main(String[] args) {
        //String[] names = {"Alex","Clark","Deon","Elise","Mark","Sam"};
        //int[] ages = {24,25,66,34,12,44};

    
        String txt = "Hello how are you?";
        try (FileOutputStream fos = new FileOutputStream("files/students.txt")) {
            for(int i = 1; i <= txt.length(); i++) {
                fos.write(txt.charAt(i));
            }
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        } catch(IOException e) {
            e.printStackTrace();
        }

    }
}
