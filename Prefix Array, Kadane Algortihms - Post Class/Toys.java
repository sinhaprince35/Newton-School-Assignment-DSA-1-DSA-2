/*

Toys

easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Sara want to buy a toy and for this purpose she goes to a toy shop, there is a special offer going in the toy shop that is if you buy one toy you can get extra k toys for free now Sara wonders what is the minimum amount of money she need to spend so that she can get all the toys.

You are given some queries containing values of k you need to print the minimum amount of cost Sara need to spend to get all the toys for each value of k.
Input
First line contain number of toys N and the number of queries Q
Second line contains the cost of the toys
Next Q line contains a single integer that is the value of k

Constraint:-
1<=N, Q<=100000
1<=Arr[i], k<=1000000
Output
Output the minimum cost for each query */

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
     Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Q = sc.nextInt();
        int arr[] = new int[N];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        for(int i=1;i<=Q;i++){
            int k = sc.nextInt();
            int totalBuy = N/(k+1);
            if(N%(k+1) != 0) totalBuy++;
            int res =0;
            for(int j=0;j<totalBuy;j++){
                res +=arr[j];
            }
            System.out.println(res);
    }
}
}