package Test;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Stack;
import java.util.Vector;

/**
 * 简单排序
 */
class Sort {
 public static void pri(TreeNode root){
     Stack<TreeNode> stack1=new Stack<>();
     Stack<TreeNode> stack2=new Stack<>();
     stack1.push(root);
     while (!stack1.empty()){
         TreeNode tmp=stack1.pop();
         stack2.push(tmp);
         if(tmp.left!=null){
             stack1.push(tmp.left);
         }
         if(tmp.right!=null){
             stack1.push(tmp.right);
         }
     }
     while (!stack2.isEmpty()){
         System.out.println(stack2.pop().val);
     }

 }

    public static void main(String[] args) {
        int a[] = {2, 3, 1, 5, 0};
      //  sort(a);
        System.out.print(Arrays.toString(a));

    }
}