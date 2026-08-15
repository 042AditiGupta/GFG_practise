class Solution {
    public String toggleCase(String s) {
        // code here
        String ans="";
        for(int i=0;i<s.length();i++)
        {
            int ascii=(int)s.charAt(i);
            //for upper case characters
            if(ascii>=65 && ascii<=90)
            {
                ascii+=32;
            }
            else if(ascii>=97 && ascii<=122)
            {
                ascii-=32;
                
            }
            ans+=(char)ascii;
        }
        return ans;
    }
}
