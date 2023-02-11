/*

Rotate the matrix

easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given a matrix of N*N dimensions (Mat). Print the matrix rotated by 90 degrees and 180 degrees.
Input
The first line contains N.
N lines follow each containing N space-separated integers.

Constraints
2 <= N <= 100
1 <= Mat[i][j] <= 10000
Output
Output 2*N+1 lines.
First N lines should contain the Matrix rotated by 90 degrees.
Then print a blank line.
Then N lines should contain the Matrix rotated by 180 degrees.
Example
Sample Input 1:
2
3 4
7 6

Sample Output 1:
7 3
6 4

6 7
4 3

Sample Input 2:
2
1 2
3 4

Sample Output 2:
3 1
4 2

4 3
2 1
*/

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
                      Scanner scn = new Scanner(System.in);
                      int n = scn.nextInt();
                      int arr[][] = new int [n][n];
                      for(int i=0;i<n;i++){
                          for(int j=0;j<n;j++){
                              arr[i][j] =  scn.nextInt();
                          }
                      }
        Transpose(arr);
        rotate90(arr);
        display(arr);
        System.out.println();
        Transpose(arr);
        rotate90(arr);
        //rotate90(arr);
        display(arr);

                     
    }
    public static void Transpose(int arr[][]){
          for(int i=0;i<arr.length;i++){
              for(int j=i;j<arr[0].length;j++){
                  int temp = arr[i][j];
                  arr[i][j]= arr[j][i];
                  arr[j][i]=temp;
              }
          }
         
    }
    public static void rotate90(int arr[][]){
        for(int i=0;i<arr.length;i++){
            int li =0;
            int ri= arr[i].length-1;
            while(li<ri){

                int temp = arr[i][li];
                arr[i][li]= arr[i][ri];
                arr[i][ri]=temp;

                li++;
                ri--;
            }
        }
    }
    public static void display(int arr[][]){
         for(int i=0;i<arr.length;i++){
                          for(int j=0;j<arr[0].length;j++){
                              System.out.print(arr[i][j]+" ");
                          }
                          System.out.println();
                      }
    }
}