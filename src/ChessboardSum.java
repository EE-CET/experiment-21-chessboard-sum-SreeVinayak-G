import java.util.*;
public class ChessboardSum {
        private static int[] checkSum(int[][] matrix, int n, int blackSum, int whiteSum) {
                for(int i=0;i<n;i++){
                        for(int j=0;j<n;j++){
                                if((i+j)%2==0){
                                        blackSum += matrix[i][j];
                                } else {
                                        whiteSum += matrix[i][j];
                                }
                        }
                }
                return new int[]{blackSum, whiteSum};

        }
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                int[][] matrix = new int[n][n];
                for(int i=0;i<n;i++){
                        for(int j=0;j<n;j++){
                                matrix[i][j] = sc.nextInt();
                        }
                }
                int[] ans = checkSum(matrix, n, 0, 0);
                System.out.println(ans[0]);
                System.out.println(ans[1]);
        }

}
