public class RandomCharacter {
    // public static void main(String[] args) {
    //     System.out.println(getUpperCaseRandomChar());
    //     System.out.println(getLowerCaseRandomChar());
    //     System.out.println(getRandomDigitChar());
    // }

    public static char getUpperCaseRandomChar() {
        return (char)((int)(Math.random() * ('Z' - 'A' + 1)) + 'A');
    }

    public static char getLowerCaseRandomChar() {
        return (char)((int)(Math.random() * ('z' - 'a' + 1)) + 'a');
    }

    public static char getRandomDigitChar() {
        return (char)((int)(Math.random() * ('9' - '1' + 1)) + '1');
    }

}
