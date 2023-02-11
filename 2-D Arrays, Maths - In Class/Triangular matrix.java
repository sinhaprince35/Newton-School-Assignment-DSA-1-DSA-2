/*

Triangular matrix

easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given a matrix of size N*N, your task is to find the sum of the upper triangular matrix and the lower triangular matrix.

For Matrix:-
M00 M01 M02
M10 M11 M12
M20 M21 M22

Upper Triangular:-
M00 M01 M02
_____M11 M12
__________M22

Lower Triangular:-
M00__________
M10 M11_____
M20 M21 M22
Input
The first line of input contains a single integer N, The next N lines of input contains N space- separated integers depicting the values of the matrix.

Constraints:-
1 <= N <= 500
1 <= Matrix[][] <= 100000
Output
Print the sum of Upper and Lower Triangular Matrix separated by a space.
Example
Sample Input:-
2
1 4
2 6

Sample Output:-
11 9

Sample Input:-
3
1 4 2
1 5 7
3 8 1

Sample Output:-
20 19
*/

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
      Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            // int m = sc.nextInt();
            int i, j, sum2=0, sum1=0;
            int[][] arr = new int[n][n];
            for (i = 0; i < n; i++) {
                for (j = 0; j < n; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }
            
            int col=n-1;
            int col2=n-1;

            for(i=n-1; i>=0; i--){
                for(j=col2; j>=0; j--){
                        sum1 = sum1+arr[j][i];
                    }col2--;
                }
            System.out.print(sum1+" ");

            for(i=n-1; i>=0; i--){
                for(j=col; j>=0; j--){
                        sum2 = sum2+arr[i][j];
                    }col--;
                }
            System.out.print(sum2+" ");

    }
}