import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class PrimitiveIO {
    public static void main(String[] args) {
        String names[] = {"Alex","Clark","Elon"};
        int[] ages = {24,55,77};

        try {
            DataOutputStream dos = new DataOutputStream(new FileOutputStream("files/person.dat"));

            for(int i = 0; i < names.length; i++) {
                dos.writeInt(ages[i]);
                dos.writeUTF(" "+ names[i]+ "\n");
            }
            dos.close();
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        } catch(IOException e) {
            e.printStackTrace();
        }


        try {
            DataInputStream dis = new DataInputStream(new FileInputStream("files/person.dat"));
            for(int i = 0; i < 3; i++) {
                System.out.print(dis.readInt());
                System.out.print(dis.readUTF());
            }

            dis.close();
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
