/*

Matrix ZigZag Traversal

easy
hint
Hint

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given a 2d matrix of size M*N, print the zig traversal of the matrix as shown:-

Consider a matrix of size 5*4
1 2 3 4
5 6 7 8
9 10 11 12
13 14 15 16
17 18 19 20

ZigZag traversal:-

1
5 2
9 6 3
13 10 7 4
17 14 11 8
18 15 12
19 16
20
Input
First line of input contains two integers M and N. Next M lines contains N space- separated integers each.

Constraints:-
1 <= M, N <= 100
1 <= Matrix[i][j] <= 100000
Output
Print the zig- zag traversal of the matrix as shown.
Example
Sample Input:-
4 3
1 2 3
4 5 6
7 8 9
10 11 12

Sample Output:-
1
4 2
7 5 3
10 8 6
11 9
12
*/

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here

        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        
        int a[][] = new int[M][N];
        
        for(int i=0;i<M;i++){
            for(int j=0;j<N;j++)
                a[i][j]=sc.nextInt();
        }
        
        for(int ds=0;ds<M+N-1;ds++){
            for(int i=0;i<N;i++){
                for(int j=0;j<M;j++){
                    if(i+j==ds)
                        System.out.print(a[j][i]+" ");
                }
            }
            System.out.println();
        }
    }
}