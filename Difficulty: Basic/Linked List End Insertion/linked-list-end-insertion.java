/*
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/
class Solution {
    public Node insertAtEnd(Node head, int x) {
        // code here
         Node i=new Node(x);
        if(head==null)
        {
           return new Node(x);
        }
        if(head.next==null)
        {
             head.next=i;
        }
        Node temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=i;
        return head;
    }
}