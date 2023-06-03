import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFileUsingBuffer {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream(args[0]);
            BufferedInputStream bis = new BufferedInputStream(fis, 4096);

            FileOutputStream fos = new FileOutputStream(args[1]);
            BufferedOutputStream bos = new BufferedOutputStream(fos, 4096);

            long startTime = System.currentTimeMillis();
            byte[] data = new byte[4096];
            int length;
            while((length = bis.read(data)) != -1) {
                bos.write(data, 0, length);
            }
            bos.close();
            fos.close();

            bis.close();
            fis.close();

            long endTime = System.currentTimeMillis();

            System.out.println("Time Taken: "+ (endTime - startTime));
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        } catch(IOException e) {
            e.printStackTrace();
        }
        
    }
}
