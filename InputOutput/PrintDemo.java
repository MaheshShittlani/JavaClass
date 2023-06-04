import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class PrintDemo {
    public static void main(String[] args) {
        try {
            PrintStream printStream = new PrintStream(new FileOutputStream("files/formatted.txt"));
            printStream.println("Hello Guys!!! What do you feel about I/O in java");
            printStream.printf("The value of PI = %.2f\n",Math.PI);
            printStream.close();

            PrintWriter printWriter = new PrintWriter(new FileWriter("files/formatted.txt", true));
            printWriter.println("Now trying to use print Writer");
            printWriter.format("The value of E = %.2f", Math.E);
            printWriter.close();

        } catch(FileNotFoundException e) {
            e.printStackTrace();
        } catch(IOException e) {
            e.printStackTrace();
        }

    }
}
