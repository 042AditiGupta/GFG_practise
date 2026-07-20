class Solution {
    public int longestSubarray(int[] arr, int k) {
        // code here
        //prefix sum
        int count=0;
        long maxLength=0;
        long length=0;
        long sum=0;
        HashMap<Long,Integer>map=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
            if(sum==k)
            {
                maxLength=Math.max(maxLength,i+1);
            }
            long rem=sum-k;
            if(map.containsKey(rem))
            {
                length=i-map.get(rem);
                maxLength=Math.max(maxLength,length);
            }
            if(!map.containsKey(sum))
            {
                map.put(sum,i);
            }
            
        }
        return (int)maxLength;
    }
}
