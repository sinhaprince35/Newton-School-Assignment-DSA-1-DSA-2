/*
So many chocolates? (Contest)
easy
hint
Hint

Time Limit: 2 sec
Memory Limit: 128000 kB



Problem Statement
It's Solo's 1st birthday and everyone is gifting her chocolates. There are N guests invited, the ith guest gives Solo A[i] chocolates.

Find the total number of chocolates that Solo receives.
Input
The first line of the input contains an integer N, the number of guests.
The second line of the input contains N integers A[1], A[2],. , A[N]

Constraints
1 <= N <= 100
1 <= A[i] <= 100
Output
Output a single integer, the total number of chocolates that Solo receives.
Example
Sample Input
5
1 2 4 3 2

Sample Output
12

Explanation: Solo receives a total of 1+2+4+3+2 = 12 chocolates.

Sample Input
1
2

Sample Output
2
*/




import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
        Scanner in= new Scanner(System.in);
        int N=in.nextInt();
        int []arr=new int[N];
        for (int i=0;i<N;i++){
            arr[i]=in.nextInt();
        }
        int sum = 0;
        for (int i = 0; i<arr.length;i++){
            sum=sum+arr[i];
        }
        System.out.println(sum);
    }
}