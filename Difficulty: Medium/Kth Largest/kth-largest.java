class Solution {
    public static int kthLargest(int arr[], int k) {
        // code here
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        for(int ele:arr)
        {
            pq.add(ele);
        }
        while(pq.size()>k)
        {
            pq.poll();
        }
        return pq.peek();
    }
}