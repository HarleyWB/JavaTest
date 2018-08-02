package Test;

class Sort {
    public static void adjustHeap(int[] arr, int i, int length) {
        int temp = arr[i];//先取出当前元素i
        for (int k = i * 2 + 1; k < length; k = k * 2 + 1) {//从i结点的左子结点开始，也就是2i+1处开始
            if (k + 1 < length && arr[k] < arr[k + 1]) {//如果左子结点小于右子结点，k指向右子结点
                k++;
            }
            if (arr[k] > temp) { //如果子节点大于父节点，将子节点值赋给父节点（不用进行交换）
                arr[i] = arr[k];
                i = k;
            } else {
                break;
            }
        }
        arr[i] = temp;//将temp值放到最终的位置
    }


}

class Solution {
    public static void pri2(TreeNode root) {
//递归算法
        if (root != null) {
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