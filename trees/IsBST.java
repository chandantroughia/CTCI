/* Implement a function to check if a binary tree is binary search tree. */
public static boolean isBST(Node root, int min, int max){
  /* Base condition */
  if(root == null) return true;

  /* check for boundry conditions */
  if(root.data < min || root.data > max) return false;

  /* Recurse */
  return isBST(root.left, min, root.data) && isBST(root.right, root.data, max);
}

public static boolean isBST(Node root){
  /* call overloaded isBST(Node root, int min, int max) */
  return isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
}
