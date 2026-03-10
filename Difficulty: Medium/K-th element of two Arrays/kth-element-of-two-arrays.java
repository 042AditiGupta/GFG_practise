class Solution {
    public int kthElement(int a[], int b[], int k) {
        // code here
        //int c[]=new int[a.length+b.length];
        ArrayList<Integer>arr=new ArrayList<>();
        for(int ele: a)
        {
             arr.add(ele);
        }
        for(int ele:b)
        {
            arr.add(ele);
        }
        Collections.sort(arr);
        int ans=arr.get(k-1);
        return ans;
    }
}