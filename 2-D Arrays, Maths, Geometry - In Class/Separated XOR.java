/*

Separated XOR

easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given n and m and a matrix of size n x m. print sum of XOR of all SEPERATED ELEMENT.
A element a is said to be SEPERATED element from an element B if a will not share any side with b or vice versa.
Input
first line contain two element n and m.
next n line contains m space separated integer i. e. element of matrix.

Constraints:
1<=n,m<=100
Output
print sum of XOR.
Example
Sample input 1:
3 4
1 2 3 4
2 3 4 5
3 4 5 6
Sample Output 1:
4

Explanation:
XOR of first part of SEPERATED ELEMENTS is 2.
XOR of second part of SEPERATED ELEMENTS is 2.
sum of both part equal to 4.
*/

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int m=sc.nextInt();
      int [][]mat=new int [n][m];
      for(int i=0;i<n;i++){
          for(int j=0;j<m;j++){
               mat[i][j]=sc.nextInt();
          }
      }
      int ans=0;
      for(int i=0;i<n;i++){
              if(i%2==0)
                for(int j=0;j<m;j+=2){
                   ans=ans^mat[i][j];
               }
               else
               for(int j=1;j<m;j+=2){
                   ans=ans^mat[i][j];
               }
          }
       int ans1=0;
       for(int i=0;i<n;i++){
           if(i%2==0)
           for(int j=1;j<m;j+=2){
               ans1=ans1^mat[i][j];
           }
           else
           for(int j=0;j<m;j+=2){
               ans1=ans1^mat[i][j];
           }
       }
       System.out.print(ans+ans1);
    }
}