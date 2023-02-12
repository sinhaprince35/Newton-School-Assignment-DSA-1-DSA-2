/*
Delete the Middle of the Linked List
easy
asked in interviews by 2 companies
Problem Statement
Given a singly linked list, delete middle node of the linked list. For example, if given linked list is 1->2->3->4->5 then linked list should be modified to 1->2->4->5.

If there are even nodes, then there would be two middle nodes, we need to delete the second middle element. For example, if given linked list is 1->2->3->4->5->6 then it should be modified to 1->2->3->5->6.

In case of a single node return the head of a linked list containing only 1 node which has value -1
Input
User Task:
Since this will be a functional problem, you don't have to take input. You just have to complete the function deleteMiddleElement() that takes head node of the linked list as parameter.

Constraints:
1 <=N<= 1000
1 <=value<= 1000
Output
Return the head of the modified linked list */

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

public static Node deleteMiddleElement(Node head) {
    int cnt = 0;
    Node temp = head;
    while (temp != null) {
        cnt++;
        temp = temp.next;
    }
    if (cnt == 1) {
        head.val = -1;
        return head;
    }
    if (cnt == 2) {
        head.next = null;
        return head;
    }
    temp = head;
    int I = 1;
    cnt = cnt / 2;
    while (I != cnt) {
        temp = temp.next;
        I++;
    }
    temp.next = temp.next.next;
    return head;
}
		// return the head of the modified Linked List