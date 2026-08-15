class Solution {
    public static char getMaxOccuringChar(String s) {
        // code here
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            if(!map.containsKey(s.charAt(i)))
            {
                map.put(s.charAt(i),1);
            }
            else
            {
                int freq=map.get(s.charAt(i));
                map.put(s.charAt(i),freq+1);
            }
        }
        int max=-1;
        char c='\0';
        for(char ele:map.keySet())
        {
            if(map.get(ele)>max ){
                max=map.get(ele);
                c=ele;
            }
            else if(map.get(ele)==max && ele<c )c=ele;
        }
        return c;
    }
}