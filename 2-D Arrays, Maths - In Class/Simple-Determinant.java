/*

Simple-Determinant

easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
You are given a 2X2 square matrix. You need to find the determinant of the matrix.
Input
The input contains two-line, each line contain two integers separated by spaces.

Each element of the matrix is from 1 to 100.
Output
Output a single integer, the determinant of the matrix.
Example
Sample Input
4 5
2 3

Sample Output
2

Sample Input
2 10
10 40

Sample Output
-20 */

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
		int[][] arr = new int[2][2];
		
		int rows, cols, determinant = 0;
		
		Scanner sc= new Scanner(System.in);
		
		for(rows = 0; rows < 2; rows++) {
			for(cols = 0; cols < 2; cols++) {
				arr[rows][cols] = sc.nextInt();
			}		
		}
		
		determinant = (arr[0][0] * arr[1][1]) - (arr[0][1] * arr[1][0]);

		System.out.println(determinant);
		
	}
    }