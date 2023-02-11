/*

Maximum difference array

medium
hint
Hint

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given an array of integers of size N, your task is to find the maximum parity index of this array.
Parity Index is the maximum difference between two indices i and j (1 <= i < j <= N) of an array A such that Ai < Aj.
Input
The first line contains a single integer N, next line contains N space-separated integers depicting the values of the array.

Constraints:-
1 < = N < = 105
1 < = Arr[i] < = 105
Output
Print the maximum value of j- i under the given condition, if no pair satisfies the condition print -1.
Example
Sample Input 1:-
5
1 2 3 4 5

Sample Output 1:-
4

Sample Input 2:-
5
5 4 3 2 1

Sample Output 2:-
-1

Explanation 1:
The maximum difference of jth - ith index is 4:(4th - 0th), also arr[4] > arr[0] */

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];

        for(int i = 0; i<N; i++){
            arr[i] = sc.nextInt();
                 }
        int[] leftMin = new int[N];
    int[] rightMax = new int[N];

    leftMin[0] = arr[0];

    for(int i =1; i< N; i++){
        leftMin[i] = Math.min(arr[i], leftMin[i-1]);
    }

    rightMax[N-1]  = arr[N-1];
    for(int j = N -2; j>= 0; j--){
        rightMax[j] = Math.max(arr[j], rightMax[j+1]);
    }

    int low = 0;
    int high =0;
    int maxDiff = -1;

    while(low < N && high <N){
        if(leftMin[low] < rightMax[high]){
            maxDiff = Math.max(maxDiff, high - low);
            high++;
        }else{
            low++;
        }
    }

    System.out.println(maxDiff);
    }

}