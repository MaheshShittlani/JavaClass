import java.util.StringTokenizer;

public class StringTokenizerDemo {
    public static void main(String[] args) {
        String s = "Arun Sharma 25";

        StringTokenizer st = new StringTokenizer(s, ",");

        // System.out.println(st.countTokens());

        // while(st.hasMoreTokens()) {
        //     System.out.println(st.nextToken());
        // }

        String firstName = st.nextToken();
        String lastName = st.nextToken();
        int age = Integer.parseInt(st.nextToken());

        System.out.println(firstName+" , "+ lastName + " , " + age);
    }
}