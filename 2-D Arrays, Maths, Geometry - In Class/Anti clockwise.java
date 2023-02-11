/*

Anti clockwise

easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given an N*N matrix. Print the elements of the matrix in anticlockwise order (see the sample for better understanding).
Input
First line contains N.
N lines follow each containing N space seperated integers.

Constraints:-
2 <= N <= 500
1 <= Mat[i][j] <= 1000
Output
Output N*N integers in a single line separated by spaces, which are the elements of the matrix in anti-clockwise order.
Example
Sample Input
4
1 2 3 4
5 6 7 8
9 10 11 12
13 14 15 16

Sample output
1 5 9 13 14 15 16 12 8 4 3 2 6 10 11 7

Explanation:
We start from 1 , go down till 13 and then go right till 16 then go up till 4 , then we go left till 2 then down and so on in anti-clockwise fashion .

Sample Input
3
1 2 3
4 5 6
7 8 9

Sample output
1 4 7 8 9 6 3 2 5
*/

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void antiClockWiseMat(int a[][],int startRow, int startcol, int endRow, int endcol, int element){

        //for top to bottom
        for(int i=startRow;i<=endRow && element>0; ++i, element--){
            System.out.print(a[i][startRow]+" ");
        }

        //for left to right
        for(int i=startRow+1;i<=endcol && element>0; ++i,element--){
            System.out.print(a[endRow][i]+" ");
        }

        //for bottom to top
        for(int i=endRow-1;i>startRow && element>0;--i,element--){
            System.out.print(a[i][endcol]+" ");
        }

        //for bottom to top
        for(int i=endcol;i>startcol && element>0;--i,element--){
            System.out.print(a[startRow][i]+" ");
        }
        if(startRow+1<=endRow-1 && element>0){
            antiClockWiseMat(a, startRow+1, startcol+1, endRow-1, endcol-1, element);
        }
    }
    public static void main (String[] args) {
                      // Your code here
                      Scanner sc= new Scanner(System.in);
                      int n= sc.nextInt();
                      int a[][]= new int[n][n];

                      for(int i=0;i<n;i++){
                          for(int j=0;j<n;j++){
                              a[i][j]= sc.nextInt();
                          }
                      }
                     int row=a.length;
                     int col= a[0].length;
                     int element= row*col;

                      // Print result
        antiClockWiseMat(a, 0, 0, 
            row - 1, col - 1, element);
    }
}