import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SaveAccount {
    public static void main(String[] args) {
        Account a1 = new Account(101, "Alex", "ICICI00099988", "ALEX2023");
        Account a2 = new Account(102, "Clark", "ICICI000998788", "Clark@2023");

        // Store acccount details - Serialization
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("files/accounts.dat"));
            oos.writeObject(a1);
            oos.writeObject(a2);
            oos.close();
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        } catch(IOException e) {
            e.printStackTrace();
        }


        // Read data Objects from file - DeSerialization

        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("files/accounts.dat"));
            Account a  = (Account)ois.readObject();
            System.out.println(a.getId()+" "+a.getName()+" "+a.getAccountNumber()+" "+a.getPassword());

            a  = (Account)ois.readObject();
            System.out.println(a.getId()+" "+a.getName()+" "+a.getAccountNumber()+" "+a.getPassword());

            ois.close();
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        } catch(IOException e) {
            e.printStackTrace();
        } catch(ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
