/*
Subarray Product
medium
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given an array, A of N integers. Find the product of maximum values for every subarray of size K. Print the answer modulo 109+7.
A subarray is any contiguous sequence of elements in an array.
Input
The first line contains two integers N and K, denoting the size of the array and the size of the subarray respectively.
The next line contains N integers denoting the elements of the array.

Constarints
1 <= K <= N <= 1000000
1 <= A[i] <= 1000000
Output
Print a single integer denoting the product of maximums for every subarray of size K modulo 1000000007 */

#include <bits/stdc++.h> // header file includes every Standard library
using namespace std;
void printKMax(int arr[], int n, int k){
    std::deque<int> Qi(k);
    int i;
    long res = 1;
    for (i = 0; i < k; ++i){
        while ((!Qi.empty()) && arr[i] >= arr[Qi.back()])
            Qi.pop_back();
        Qi.push_back(i);
    }
    for (; i < n; ++i){
        res = (res * arr[Qi.front()])%1000000007;
        while ((!Qi.empty()) && Qi.front() <= i - k)
            Qi.pop_front();
        while ((!Qi.empty()) && arr[i] >=
                             arr[Qi.back()])
            Qi.pop_back();
        Qi.push_back(i);
    }
    res = (res * arr[Qi.front()])%1000000007;
    cout<<res<<endl;
    return;
}
int main() {
    int n,k;
    cin>>n>>k;
    int a[n];
    for(int i=0;i<n;i++)
        cin>>a[i];
    printKMax(a,n,k);
    return 0;
}