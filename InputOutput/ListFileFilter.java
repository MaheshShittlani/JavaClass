import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;

class FilterMyFiles implements FilenameFilter {
    private String extension;
    public FilterMyFiles(String extension) {
        this.extension = extension;
    }
    public boolean accept(File parent, String filename) {
        return filename.endsWith(this.extension);
    }
}

public class ListFileFilter {
    public static void main(String[] args)  throws IOException{
        File f = new File(args[0]);

        File[] items = f.listFiles(new FilterMyFiles(args[1]));

        for(File item: items) {
            System.out.println(item.getCanonicalPath()+ (item.isDirectory()? " is a Directory": " is a file"));
        }
    }
}
