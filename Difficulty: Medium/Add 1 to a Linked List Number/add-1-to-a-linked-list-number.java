/* Structure of linked list Node
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
    public Node rev(Node head)
    {
        Node prev=null;
        Node Next=null;
        Node curr=head;
        while(curr!=null)
        {
            Next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=Next;
        }
        return prev;
    }
    public Node addOne(Node head) {
        // code here.
       
        Node r=rev(head);
        int carry=1;
        Node dummy=new Node(1);
        Node temp=dummy;
        while(r!=null || carry>0)
        {
              int val=0;
              if(r!=null)val=r.data;
              int num=val+carry;
               Node node=new Node(num%10);
                temp.next=node;
                temp=temp.next;
                
                if(num>9)carry=1;
                else carry=0;
              if(r!=null)r=r.next;
        }
    
    Node res=rev(dummy.next);
      return res;
    }
}