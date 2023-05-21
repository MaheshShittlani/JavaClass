public class CharCount {
    public static void main(String[] args) {
        char[] charArr = createArray();
        int[] countArr = new int[26];

        countFreq(charArr,countArr);

        display(countArr);
    }

    public static char[] createArray() {
        char[] arr = new char[100];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = RandomCharacter.getLowerCaseRandomChar();
        }

        return arr;
    }

    public static void countFreq(char[] charArr, int[] countArr) {
        for(int i = 0; i < charArr.length; i++) {
            countArr[charArr[i] - 'a']++;
        }
    }

    public static void display(int[] countArr) {
        System.out.println("Counting of characters...");

        for(int i = 0; i < countArr.length; i++) {
            System.out.println((char)(i + 'a') + " - " + countArr[i]);
        }
    }
}
