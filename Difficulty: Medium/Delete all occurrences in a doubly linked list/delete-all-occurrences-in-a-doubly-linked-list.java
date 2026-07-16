/* Structure of Doubly Linked List
class Node {
    int data;
    Node next;
    Node prev;

    Node(int x) {
        data = x;
        next = null;
        prev = null;
    }
}
*/
class Solution {
    static Node deleteAllOccurOfX(Node head, int x) {
        // code here
        Node newHead=new Node(-1);
        Node temp=head;
        Node t=newHead;
        while(temp!=null)
        {
            if(temp.data!=x)
            {
                t.next=temp;
                temp.prev=t;
                temp=temp.next;
                t=t.next;
            }
            else
            {
                temp=temp.next;
            }
        }
        t.next=null;
        return newHead.next;
    }
}