/*
class Node {
    int data;
    Node next;

    Node(int d)
    {
        data = d;
        next = null;
    }
}*/

class Solution {
    public Node segregate(Node head) {
        // code here
        Node dummyzero=new Node(-1);
        Node dummyone=new Node(-1);
         Node dummytwo=new Node(-1);
         Node temp1=dummyzero;
         Node temp2=dummyone;
         Node temp3=dummytwo;
         Node temp=head;
         while(temp!=null)
         {
             if(temp.data==0)
             {
                temp1.next=temp;
                temp1=temp1.next;
             }
             else if(temp.data==1)
             {
                temp2.next=temp;
                temp2=temp2.next;
             }
             else
             {
                temp3.next=temp;
                temp3=temp3.next;
             }
             temp=temp.next;
         }
         temp1.next=(dummyone.next!=null)?(dummyone.next):(dummytwo.next);
         temp2.next=dummytwo.next;
         temp3.next=null;
         return dummyzero.next; 
    }
}