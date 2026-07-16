/*

Definition for singly Link List Node
class Node
{
    int data;
    Node next,prev;

    Node(int x){
        data = x;
        next = null;
        prev = null;
    }
}

You can also use the following for printing the link list.
Node.printList(Node node);
*/

class Solution {
    public static ArrayList<ArrayList<Integer>> findPairsWithGivenSum(int target,
                                                                      Node head) {
        // code here
        
        ArrayList<ArrayList<Integer>>res=new ArrayList<>();
        Node temp=head;
        Node tail=head;
        while(tail.next!=null)
        {
            tail=tail.next;
        }
        while(temp != null && tail != null &&
       temp != tail && temp != tail.next)
        {
            int sum=temp.data+tail.data;
            if(sum==target)
            {
                ArrayList<Integer>arr=new ArrayList<>();
                arr.add(temp.data);
                arr.add(tail.data);
                res.add(arr);
                temp=temp.next;
                tail=tail.prev;
            }
            else if(sum<target)
            {
                temp=temp.next;
            }
            else
            {
                tail=tail.prev;
            }
            
        }
        return res;
    }
}
