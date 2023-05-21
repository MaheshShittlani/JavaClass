/**
* A
* AB
* ABC
* ABCD
* ABCDE
*/
class Pattern2 {
    public static void main(String[] args) {
        for(int i = 1; i <= 5; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print((char)(j+ 64)+" ");
            }
            System.out.println();
        }
    }
}