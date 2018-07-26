package Test;

import java.util.Arrays;
import java.util.Stack;
class Sort {
    public static void pri(TreeNode root) {
//非递归写法
        Stack<TreeNode> stack1 = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();
        stack1.push(root);
        while (!stack1.empty()) {
            TreeNode tmp = stack1.pop();
            stack2.push(tmp);
            if (tmp.left != null) {
                stack1.push(tmp.left);
            }
            if (tmp.right != null) {
                stack1.push(tmp.right);
            }
        }
        while (!stack2.isEmpty()) {
            System.out.println(stack2.pop().val);
        }
    }



}

class Solution {
    public static void pri2(TreeNode root) {
//递归算法
        if(root!=null){
            pri2(root.left);
            pri2(root.right);
            System.out.print(root.val);
        }
    }
    public static void main(String[] args) throws InterruptedException {

        TreeNode root = new TreeNode("A");
        TreeNode B = new TreeNode("B");
        TreeNode C = new TreeNode("C");
        TreeNode D = new TreeNode("D");
        root.left = B;
        root.right = C;
        C.left = null;
        C.right = null;
        B.left = D;
        B.right = null;
        D.left = null;
        D.right = null;
pri2(root);
    }
}