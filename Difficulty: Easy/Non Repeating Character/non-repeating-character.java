class Solution {
    public char nonRepeatingChar(String s) {
        // code here
        LinkedHashMap<Character,Integer>map=new LinkedHashMap<>();
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
        for(char ele:map.keySet())
        {
            if(map.get(ele)==1)
            {
               return ele;
            }
            
        }
        return '$';
    }
}
