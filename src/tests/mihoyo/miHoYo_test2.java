package tests.mihoyo;

import java.util.Scanner;

/***
 * ①输入描述：第一行输入两个正整数M，N，M<=15，N<=200，接下来的M行每行有N个1或0的整数，中间用空格分隔；
 * ②输出描述：若能满足上述要求，输出"YES"，否则输出"NO"
 * #示例1
 * 输入
 * 2 3
 * 0 1 0
 * 0 0 1
 *
 * 输出
 * NO
 *
 * #示例2
 * 输入
 * 4 4
 * 0 0 0 1
 * 1 0 0 0
 * 1 1 1 0
 * 0 0 0 0
 *
 * 输出
 * YES
 *
 */

public class miHoYo_test2 {
    public int[][] matrix(int m, int n){
        int[][] matrix = new int[m][n];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                matrix[i][j] = Math.random()>0.5?1:0;
            }
        }

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        return matrix;
    }

    public boolean twoRowsMatching(int[] row1, int[] row2){
        int[] result = new int[row1.length];
        for(int i = 0; i < row1.length; i++){
            if(row1[i] == 1){
                result[i] = 1;
            }
        }
        for(int i = 0; i < row2.length; i++){
            if(row2[i] == 1){
                if(result[i] == 1){
                    return false;
                }
                else{
                    result[i] = 1;
                }
            }
        }
        for(int i : result){
            if(i == 0){
                return false;
            }
        }
        return true;
    }

    public boolean newMatrix(int m, int n){
        if(m <= 15 && n <= 200){
            int[][]matrix = matrix(m,n);
            int counter1 = 0;
            while(counter1 != m-1){
                for(int i = counter1+1; i < m; i++){
                    if(twoRowsMatching(matrix[counter1], matrix[i])) return true;
                }
                counter1++;
            }
        }
        return false;
    }

    public static void main(String[] args){
        miHoYo_test2 m = new miHoYo_test2();
        Scanner sc = new Scanner(System.in);
        System.out.print("M:");
        int M = sc.nextInt();
        System.out.print("N:");
        int N = sc.nextInt();
        String y = "YES";
        String n = "NO";
        if(m.newMatrix(M,N)){
            System.out.println(y);
        }
        else{
            System.out.println(n);
        }
    }
}
