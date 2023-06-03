import java.io.File;

public class ListFiles2 {
    public static void main(String[] args) {
        File f = new File(args[0]);
        File[] list = f.listFiles();

        for(int i = 0; i < list.length; i++) {
            File item = list[i];
            System.out.println(item.getPath()+ (item.isDirectory()? " is a Directory": " is a file"));
        }
    }
}
