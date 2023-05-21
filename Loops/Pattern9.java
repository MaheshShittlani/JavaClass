    /**
    ###########
    #         #
    #         #
    #         #
    ########### 
*/
class Pattern9 {
    public static void main(String[] args) {
        for(int i = 1; i <= 9; i++) {
            for(int j = 1; j <= 21; j++) {
                if(i == 1 || i == 9 || j == 1 || j == 21) {
                    System.out.print("#");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
    }
}