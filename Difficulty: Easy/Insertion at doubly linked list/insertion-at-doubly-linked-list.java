/*
class Node
{
    int data;
    Node next;
    Node prev;
    Node(int data)
    {
        this.data = data;
        next = prev = null;
    }
}
*/

class Solution {
    Node insertAtPos(Node head, int p, int x) {
        // code here
        Node temp=new Node(x);
        Node y=head;
    
        for(int i=0;i<p;i++)
        {
            y=y.next;
        }
        if(y.next==null)
        {
            y.next=temp;
            temp.prev=y;
            return head;
        }
        Node z=y.next;
        y.next=temp;
        temp.prev=y;
        temp.next=z;
        z.prev=temp;
        return head;
    }
}