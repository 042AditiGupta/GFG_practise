class Solution {
    public String removeSpaces(String s) {
        // code here
        String ans="";
       
        for(int i=0;i<s.length();i++)
        {
             int ascii=(int)s.charAt(i);
            if(ascii>=65 && ascii<=97)
            {
                ans+=s.charAt(i);
            }
            else if(ascii>=97 && ascii<=122)
            {
                ans+=s.charAt(i); 
            }
        }
        return ans;
    }
}