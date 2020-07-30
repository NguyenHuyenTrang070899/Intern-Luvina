package BTVN_B4;

public class B_0 {
    public static void main(String args[]) {
        char[] result = {'A','B','C','D','C','D','B','B','A','D'};
        char[][] ans = {{'A','C','C','D','C','D','B','D','A','D'},
                {'A','B','C','D','B','D','B','B','A','D'},
                {'B','B','C','D','C','D','B','B','A','B'},
                {'A','C','D','A','C','D','B','C','A','B'},
                {'C','B','C','D','C','D','C','B','A','D'},
                {'A','D','C','D','C','D','B','B','A','A'},
                {'D','B','A','A','A','D','B','B','A','D'},
                {'A','B','C','D','C','D','B','B','A','D'},
                {'A','B','D','D','C','D','B','B','A','C'},
                {'B','D','C','D','C','D','B','A','A','D'},
        };
        int[] grade = new int[ans.length];
        for(int i=0; i<ans.length; i++){
            for(int j=0; j< result.length; j++){
                if(ans[i][j] == result[j]){
                    grade[i] +=1;
                }
            }
            System.out.println("Student " + (i+1) + ": " + grade[i]);
        }
    }
}
