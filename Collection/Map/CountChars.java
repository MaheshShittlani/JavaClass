import java.util.TreeMap;

public class CountChars {
    public static void main(String[] args) {
        String str = "a dog named happy another dog name sad happy cries 99 times sad laght 999 time in a day";

        TreeMap<String,Integer> map = new TreeMap<>();

        String[] words = str.split(" ");
        for(String word: words) {
            word = word.toLowerCase();
            if(map.containsKey(word)) {
                Integer count = map.get(word);
                count++;
                map.put(word, count);
            }else {
                map.put(word,1);
            }
        }

        System.out.println(map);

    }
}
