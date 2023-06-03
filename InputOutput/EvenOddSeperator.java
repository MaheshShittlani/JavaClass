import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class EvenOddSeperator {
    public static void main(String[] args) {
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("files/numbers.dat"))) {

            for(int i = 1; i <= 100; i++) {
                dos.writeInt(i);
            }

        } catch(FileNotFoundException e) {
            e.printStackTrace();
        } catch(IOException e) {
            e.printStackTrace();
        }

        // Read numbers

        try(
            DataInputStream dis = new DataInputStream(new FileInputStream("files/numbers.dat"))
        ) {
            int data;
            DataOutputStream dos1 = new DataOutputStream(new FileOutputStream("files/even.dat"));
            DataOutputStream dos2 = new DataOutputStream(new FileOutputStream("files/odd.dat"));
            while(true) {
                try{
                    data = dis.readInt();
                    if(data % 2 == 0) {
                        dos1.writeInt(data);
                    } else {
                        dos2.writeInt(data);
                    }
                } catch(EOFException e) {
                    break;
                }
            }

            dos1.close();
            dos2.close();
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        } catch(IOException e) {
            e.printStackTrace();
        }

        // Display numbers

        try(DataInputStream dis = new DataInputStream(new FileInputStream("files/numbers.dat"))) {
            System.out.println("All Numbers..");
            int data;
            while(true) {
                try {
                    data = dis.readInt();
                    System.out.print(data+" ");
                } catch(EOFException e) {
                    break;
                }
            }
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        } catch(IOException e) {
            e.printStackTrace();
        }

        try(DataInputStream dis = new DataInputStream(new FileInputStream("files/even.dat"))) {
            System.out.println("Even Numbers..");
            int data;
            while(true) {
                try {
                    data = dis.readInt();
                    System.out.print(data+" ");
                } catch(EOFException e) {
                    break;
                }
            }
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        } catch(IOException e) {
            e.printStackTrace();
        }

        try(DataInputStream dis = new DataInputStream(new FileInputStream("files/odd.dat"))) {
            System.out.println("Odd Numbers..");
            int data;
            while(true) {
                try {
                    data = dis.readInt();
                    System.out.print(data+" ");
                } catch(EOFException e) {
                    break;
                }
            }
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
