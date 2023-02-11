/*
Bubble Sort (descending order)
easy
asked in interviews by 23 companies
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given an array, sort the array in reverse order by simply swapping its adjacent elements.
Input
First line of the input contains an integer, N, which denotes the length of the array. Next N inputs are elements of the array that is to be sorted in descending order.

Constraints
1<=N<=1000
-10000<=Arr[i]<=100000
Output
Output sorted array in descending order where each element is space separated.
*/

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
     int N = sc.nextInt();
     int temp =0;
     int A[] = new int[N];
     for(int i=0; i<N; i++){
         A[i] = sc.nextInt();
     }
     for(int i=0; i<N-1; i++){
         for(int j=0; j<N-i-1; j++){
             if(A[j]<A[j+1]){
                 temp = A[j];
                 A[j] = A[j+1];
                 A[j+1] = temp;
             }
         }
     }
     for(int i=0; i<N; i++){
         System.out.print(A[i]+" ");
     }

    }
}