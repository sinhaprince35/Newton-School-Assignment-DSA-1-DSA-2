/*

Max sum column

easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given a matrix of size M*N, your task is to find the column having the maximum sum and print the sum.
Input
The first line of input contains two space-separated integers M and N. The following M lines of input contain N space-separated integers each depicting the values of the matrix.

Constraints:-
1 <= M, N <= 100
1 <= Matrix[][] <= 100000
Output
Print the maximum sum.
Example
Sample Input:-
3 3
1 2 3
4 5 6
7 8 9

Sample Output:-
18

Explanation:-
1 + 4 + 7 = 12
2 + 5 + 8 = 15
3 + 6 + 9 = 18
maximum = 18

Sample Input:-
3 2
1 4
9 6
9 1

Sample Output:-
19
*/

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
         
                     int M = s.nextInt();
                     int N = s.nextInt();
                    int[][] array = new int[M][N];
                    int sum=0,result = 0;
                     
        for(int i=0;i<M;i++)
        {
            for(int j=0;j<N;j++)
                array[i][j]=s.nextInt();
        }


        for(int j=0;j<N;j++)
        { 
        for(int i=M-1;i>=0;i--)
        {
            sum+=array[i][j];
        }
        if(result<sum)
        result = sum;
        sum=0;
        }

        System.out.print(result);

    }
}