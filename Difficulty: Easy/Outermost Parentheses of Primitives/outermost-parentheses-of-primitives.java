class Solution {
    public String removeOuter(String s) {
        // code here
        int open=1;
        StringBuilder sb=new StringBuilder();
        for(int i=1;i<s.length();i++)
        {
            if(s.charAt(i)=='(')
            {
                open++;
                if(open>1)sb.append('(');
            }
            else
            {
                if(open>1)
                {
                    sb.append(')');
                }
                 open--;
            }
        }
        return sb.toString();
    }
}