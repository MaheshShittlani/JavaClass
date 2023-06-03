import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile2 {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream(args[0]);
            FileOutputStream fos = new FileOutputStream(args[1]);


            byte[] data = new byte[4096];
            int length;
            long startTime = System.currentTimeMillis();
            while((length = fis.read(data)) != -1) {
                fos.write(data, 0 , length);
            }
            long endTime  = System.currentTimeMillis();
            fis.close();
            fos.close();

            System.out.println("Time Taken: "+ (endTime - startTime) +" milli Seconds ");
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
