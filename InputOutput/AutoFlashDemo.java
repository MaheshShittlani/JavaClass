
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.PrintStream;
import java.io.PrintWriter;

public class AutoFlashDemo {
    public static void main(String[] args) {
        try {
            PrintStream printStream = new PrintStream(new FileOutputStream("files/autoflush.txt"));
            printStream.println("Hello Print Stream.");

            printStream.print("This will be visible");
            printStream.close();

            PrintWriter printWriter = new PrintWriter(
                new FileWriter("files/autoflush.txt",true)
                ,true);
            printWriter.println("Hello Print Writer");
            printWriter.print("This will not visible");
            printWriter.println();

        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
