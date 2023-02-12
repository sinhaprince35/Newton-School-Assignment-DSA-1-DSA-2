/*
Reversing the Linked List
easy
asked in interviews by 8 companies
Problem Statement
Given a linked list of N nodes. The task is to reverse the list by changing links between nodes (i.e if the list is 1->2->3->4 then it becomes 1<-2<-3<-4) and return the head of the modified list.
Input
User Task:
Since this will be a functional problem, you don't have to take input. You just have to complete the function ReverseLinkedList that takes head node as parameter.

Constraints:
1 <=N <= 1000
1 <= Node.data<= 100
Output
Return the head of the modified linked list.
*/

/*
// information about the class Nodeclass Node {
    Node next;
    int val;

    Node(int val) {
        this.val = val;
        next = null;
    }
}
*/


public static Node ReverseLinkedList(Node head) {

    Node prev = null; 
    Node current = head; 
    Node next = null; 
    while (current != null) { 
        next = current.next; 
        current.next = prev; 
        prev = current; 
        current = next; 
    } 
    head = prev; 
    return head; 
    
}