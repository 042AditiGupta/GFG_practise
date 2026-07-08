/*
  class Node {
   int data;
    Node next;

    Node(int d)  { data = d;  next = null; }
}
*/
class Solution {
    public boolean searchKey(Node head, int key) {
        // Code here
        Node temp=head;
        int size=0;
        while(temp!=null)
        {
            temp=temp.next;
            size++;
        }
        for(int i=0;i<size;i++)
        {
            if(head.data==key)
            {
                return true;
            }
            head=head.next;
        }
        return false;
        
    }
}