import java.io.File;

public class ListFiles {
    public static void main(String[] args) {
        File f = new File(args[0]);
        String[] list = f.list();

        for(int i = 0; i < list.length; i++) {
            File item = new File(args[0] , list[i]);
            System.out.println(item.getPath()+ (item.isDirectory()? " is a Directory": " is a file"));
        }
    }
}
