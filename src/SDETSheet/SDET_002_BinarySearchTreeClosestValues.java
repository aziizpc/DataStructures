package SDETSheet;

import java.util.*;

class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class SDET_002_BinarySearchTreeClosestValues {
	
	public List<Integer> findClosestValues(TreeNode root, double target, int k) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> 
            Double.compare(Math.abs(target - b), Math.abs(target - a))
        );

        inorderTraversal(root, target, k, maxHeap);

        return new ArrayList<>(maxHeap);
    }

    private void inorderTraversal(TreeNode node, double target, int k, PriorityQueue<Integer> maxHeap) {
        if (node == null) return;

        inorderTraversal(node.left, target, k, maxHeap);

        maxHeap.offer(node.val);
        if (maxHeap.size() > k) {
            maxHeap.poll(); // Remove the farthest value
        }

        inorderTraversal(node.right, target, k, maxHeap);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(15);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(7);
        root.right.left = new TreeNode(12);
        root.right.right = new TreeNode(20);

        SDET_002_BinarySearchTreeClosestValues solution = new SDET_002_BinarySearchTreeClosestValues();
        System.out.println(solution.findClosestValues(root, 9, 3)); // Output: [10, 7, 12]
    }

}