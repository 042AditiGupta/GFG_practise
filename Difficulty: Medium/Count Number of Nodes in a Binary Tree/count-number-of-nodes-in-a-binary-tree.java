// User function Template for Java

class Solution {

    public static int countNodes(Node root) {
        // Code here
        int count=0;
        if(root==null)return 0;
        return 1+countNodes(root.left)+countNodes(root.right);
    }
}