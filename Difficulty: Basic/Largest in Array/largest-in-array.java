class Solution {
    public static int largest(int[] arr) {
        // code here
        PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<arr.length;i++)
        {
            pq.add(arr[i]);
        }
        return pq.peek();
    }
}
