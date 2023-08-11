// // Question no 4(b)
// import java.util.*;

// class TreeNode {
//     int val;
//     TreeNode left;
//     TreeNode right;
//     TreeNode(int val) {
//         this.val = val;
//     }
// }

// public class BrothersInBinaryTree {
//     public boolean areBrothers(TreeNode root, int x, int y) {
//         if (root == null) {
//             return false;
//         }

//         Queue<TreeNode> queue = new LinkedList<>();
//         queue.offer(root);

//         while (!queue.isEmpty()) {
//             int levelSize = queue.size();
//             boolean foundX = false;
//             boolean foundY = false;
//             TreeNode parentX = null;
//             TreeNode parentY = null;

//             for (int i = 0; i < levelSize; i++) {
//                 TreeNode current = queue.poll();

//                 if (current.left != null) {
//                     queue.offer(current.left);
//                     if (current.left.val == x) {
//                         foundX = true;
//                         parentX = current;
//                     }
//                     if (current.left.val == y) {
//                         foundY = true;
//                         parentY = current;
//                     }
//                 }

//                 if (current.right != null) {
//                     queue.offer(current.right);
//                     if (current.right.val == x) {
//                         foundX = true;
//                         parentX = current;
//                     }
//                     if (current.right.val == y) {
//                         foundY = true;
//                         parentY = current;
//                     }
//                 }
//             }

//             if (foundX && foundY && parentX != parentY) {
//                 return true;
//             }
//         }

//         return false;
//     }

//     public static void main(String[] args) {
//         // Construct the binary tree
//         TreeNode root = new TreeNode(1);
//         root.left = new TreeNode(2);
//         root.right = new TreeNode(3);
//         root.left.left = new TreeNode(4);
        
//         int x = 4;
//         int y = 3;

//         BrothersInBinaryTree solution = new BrothersInBinaryTree();
//         boolean result = solution.areBrothers(root, x, y);
//         System.out.println("Nodes " + x + " and " + y + " are brothers: " + result);
//     }
// }
