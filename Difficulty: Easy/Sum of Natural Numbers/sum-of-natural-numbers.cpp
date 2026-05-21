class Solution {
  public:
    int sumOfNaturals(int n) {
        // code here
        return sum(n);
        
    }
    int sum(int n)
    {
        if(n==0)return 0;
        return n+sum(n-1);
    }
};