public class FindGrades {
    public static void main(String[] args) {
        int[][] answers = {
                            {'A','C','B','D','A','C','B','A','D','B'},
                            {'B','A','D','B','A','C','B','D','A','C'},
                            {'B','A','D','A','B','A','C','B','D','C'},
                            {'B','A','D','B','A','C','B','D','A','C'},
                            {'A','C','B','A','C','B','D','D','B','A'},
                            {'B','A','D','B','A','C','B','D','A','C'},
                            {'B','A','D','B','A','B','A','C','B','D'},
                            {'B','A','D','B','A','A','C','A','C','B'},
                            {'C','B','D','A','C','B','A','D','B','A'},
                            {'B','A','C','B','D','A','C','A','C','B'}
                        };
        int[] key = {'B','C','A','D','A','C','D','A','B','A'};

        int[] scores = new int[answers.length];
        
        
        for(int student = 0; student < answers.length; student++) {
            for(int i = 0; i < key.length; i++) {
                if(answers[student][i] == key[i]) {
                    scores[student]++;
                }
            }
        }
        // Print Scores
    
        for(int i = 0; i < scores.length; i++) {
            System.out.println("Score of student ("+ (i + 1) +") is "+scores[i]);
        }
    }
}
