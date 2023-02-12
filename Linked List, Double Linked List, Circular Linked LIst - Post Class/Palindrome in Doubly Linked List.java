/*
Palindrome in Doubly Linked List
medium
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
You are given head which is a reference node to a doubly- linked list of characters. Complete the function isPalin which returns true if the doubly linked list of characters is palindrome otherwise return false.
Input
User task:
Since this will be a functional problem, you don't have to take input. You just have to complete the function isPalin that takes the head of the linked list as parameter.

Constraints:
0 <= Number of nodes <= 10^5.
Output
Return true if the doubly linked list of characters is palindrome otherwise return false. */

public static Node ReverseAlternateK(Node head,int k){
    //enter your code here
    
    if (k==1)
    return head;
    // If k is not 1
    //Node s=head;
    Node rev=null;
    Node revStart=null;
    Node sp=null;
    int c=0,l=0;
    boolean st=true;
    Node s=head;
    
    while(s!=null)
    {
       if(st)
       {
    
           if(revStart==null)
           {   
               l++;
               rev=addFirst(s.val,rev);
               revStart=rev;
               
           }
           else
           rev=addFirst(s.val,rev);
       }
       c++;
       if(c==k)
       {
    
           if(st)
           {    
               revStart.next=s.next;
               if(l==1)
               head=rev;
               else
               {sp.next=rev;
               sp=null;
               }
               revStart=null;
               rev=null;
               st=false;
           }
           else{
           st=true;
           sp=s;
           }
        c=0;
       }
        
        s=s.next;
    }
    if(sp!=null)
        sp.next=rev;
    
    
    
    return head;
    }
    static Node addFirst(int k, Node tail)
    {
        Node temp=new Node(k);
        if(tail==null)
        tail=temp;
        else
        {
            temp.next=tail;
            tail=temp;
        }
        return tail;
    }