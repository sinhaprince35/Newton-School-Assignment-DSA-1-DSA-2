/*
Sum of minimum and maximum elements of subarrays
medium
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given an array of size N, your task is to calculate the total sum of maximum and minimum elements in each subarray of size K.
See example for better understanding.
Input
First line of input contains an two space separated integers depicting values of N and K, next line contains N space separated integers depicting values of Arr[i].

Constraints:-
1 < = k < = N < = 100000
-100000 < = Arr[i] < = 100000
Output
Print the required sum */

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		long a[] = new long[n];
		for(int i = 0; i < n; i++){
			a[i] = sc.nextInt();
		}

		Deque<Integer> S = new LinkedList<>();
		Deque<Integer> G = new LinkedList<>();

		int i;
		for(i = 0; i < k; i++){
			//removing useless
			while(!S.isEmpty() && a[S.peekLast()] >= a[i]){
				S.removeLast();
			}
			while(!G.isEmpty() && a[G.peekLast()] <= a[i]){
				G.removeLast();
			}
			S.addLast(i);
			G.addLast(i);
		}
		long sum = 0;
		for(; i <n ; i++){
			sum += a[S.peekFirst()] + a[G.peekFirst()];
			
			//removing expired
			while(!S.isEmpty() && S.peekFirst() <= i - k){
				S.removeFirst();
			}
			while(!G.isEmpty() && G.peekFirst() <= i - k){
				G.removeFirst();
			}			
			//removing useless
			while(!S.isEmpty() && a[S.peekLast()] >= a[i]){
				S.removeLast();
			}
			while(!G.isEmpty() && a[G.peekLast()] <= a[i]){
				G.removeLast();
			}
			S.addLast(i);
			G.addLast(i);
		}
		sum += a[S.peekFirst()] + a[G.peekFirst()];
		System.out.println(sum);
	}
}