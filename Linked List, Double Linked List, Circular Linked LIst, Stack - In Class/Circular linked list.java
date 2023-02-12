/*
Circular linked list
easy
asked in interviews by 2 companies
Problem Statement
Given a linked list consisting of N nodes, your task is to check if the given list is circular or not.

Note: Sample Input and Output just show how a linked list will look depending on the questions. Do not copy-paste as it is in custom input
Input
User Task:
Since this will be a functional problem, you don't have to take input. You just have to complete the function check() that takes the head node as a parameter.

Note: 0 and 1 in sample input just show given LL is CLL or not. 1 denotes it is CLL, 0 denotes not

Constraints:
1 <=N <= 1000
1 <= Node.data<= 1000

Output
Return 1 if the given linked list is circular else return 0. */

/*
class Node {
    Node next;
    int val;

    Node(int val) {
        this.val = val;
        next = null;
    }
}
*/

public static int check(Node head) {
    Node temp = head.next;
while(temp != null && temp != head){
    temp = temp.next;
}
if(temp == null)
    return 0;
return 1;
}