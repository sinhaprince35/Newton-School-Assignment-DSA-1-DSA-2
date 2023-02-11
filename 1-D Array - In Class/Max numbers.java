/*

Max numbers

medium
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given an array A of size N, you need to find its maximum, 2nd maximum and 3rd maximum element.
Try solving it in O(N) per test case
Input
The first line of the input contains the number of test cases T.
For each test case, the first line of the input contains an integer N denoting the number of elements in the array A. The following line contains N (space-separated) elements of A.


Constraints:
1 <= T <= 100
3 <= N <= 106
1 <= A[i] <= 109
Note:-It is guaranteed that the sum of N over all text cases does not exceed 106
Output
For each test case, output the first, second and third maximum elements in the array.
Example
Sample Input:
3
5
1 4 2 4 5
6
1 3 5 7 9 8
7
11 22 33 44 55 66 77

Sample Output:
5 4 4
9 8 7
77 66 55

Explanation:
Testcase 1:
[1 4 2 4 5]
First max = 5
Second max = 4
Third max = 4 */

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args)throws IOException {
                      // Your code here

            //Scanner sc = new Scanner(System.in);
            //int testCase = sc.nextInt();
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int testCase = Integer.parseInt(br.readLine());
            

            for (int t=0; t<testCase; t++)
            {
                int n = Integer.parseInt(br.readLine());
                String s = br.readLine();
                String [] s1 = s.split(" ");
                int [] arr = new int[n];
                
                for (int i=0; i<n; i++)
                {
                    arr [i] = Integer.parseInt(s1[i]); 
                }
                
                threeNumbersOne(n,arr);
             
			    System.out.println(); 

            }
    }

    public static void threeNumbersOne(int n, int [] arr)
    {
        int first= arr[0];
        int second= 0;
        int third= 0;

        for(int i=1; i<n; i++)
        {
            if(arr[i]> first)
            {
                third= second;
                second= first;
                first= arr[i];
            }
            else if(arr[i]> second)
            {
                third = second;
                second= arr[i];
            }
            else if(arr[i]>third)
            {
                third = arr[i];
            }
        }
        System.out.print(first+" "+second+" "+third);
    }

}