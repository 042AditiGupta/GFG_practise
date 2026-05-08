class Solution {
    public char nonRepeatingChar(String s) {
        // code here
        char ch[]=s.toCharArray();
        for(int i=0;i<ch.length;i++)
        {
            boolean flag=false;
            for(int j=0;j<ch.length;j++)
            {
                if(i!=j && ch[i]==ch[j])
                {
                    flag=true;
                    break;
                }
            }
            if(flag==false)
            {
                return ch[i];
            }
        }
        return '$';
    }
    
}
