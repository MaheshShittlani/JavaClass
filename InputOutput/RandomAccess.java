import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccess {
    public static void main(String[] args) {
        try(
            RandomAccessFile file = new RandomAccessFile("files/numbers.dat", "rw")) {
            for(int i = 1; i <= 100; i++) {
                file.writeInt(i);
            }

            System.out.println("File Size: "+file.length());
            System.out.println("Current position: "+file.getFilePointer());
            // file.setLength(0);
            // System.out.println("File Size: "+file.length());
            // System.out.println("Current position: "+file.getFilePointer());

            file.seek(0);
            System.out.println("Current position: "+file.getFilePointer());
            System.out.println("First number: "+file.readInt());
            System.out.println("Current position: "+file.getFilePointer());
            file.seek(10 * 4);
            System.out.println("After skipping 10 number: "+file.readInt());
            System.out.println("Current position: "+file.getFilePointer());

        } catch(FileNotFoundException e) {
            e.printStackTrace();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
