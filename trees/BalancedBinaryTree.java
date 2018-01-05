/*Implement a function to check if the Binary tree is balanced, the code below runs in O(N log N)*/
public static int getHeight(Node root){
  if(root == null) return 0;
  return Math.max(getHeight(root.left), getHeight(root.right)) + 1;
}

public static boolean isBalanced(Node root){
  if(root == null) return true;

  int heightDifference = getHeight(root.left) - getHeight(root.right);

  if(Math.abs(heightDifference) > 1){
    return false;
  }else{
    return isBalanced(root.left) && isBalanced(root.right);
  }
}

/* This function can be made more effecient by making less calls to getHeight, in fact getHeight can be used to determine
if the tree is balanced or not. if checkHeight returns -1, it means that the tree is not balanced, otherwise it will
return the height of the tree. The below code runs in O(N) time and O(H) space. H is the height of the tree. */

public static int checkHeight(Node root){

  if(root == null) return 0;

  /* Check if left subtree is balanced */
  int leftHeight = checkHeight(root.left);
  if(leftHeight == -1) return -1;

  /* Check if right subtree is balanced */
  int rightHeight = checkHeight(root.right);
  if(rightHeight == -1) return -1;

  /* Check if current node is balanced */
  int heightDifference = leftHeight - rightHeight;
  if(Math.abs(heightDifference) > 1){
    return -1;  //not balanced
  }else{
    return Math.max(leftHeight, rightHeight) + 1;
  }

}

//main function to call the checkHeight
public boolean isBalance(Node root){
  if(checkHeight(root) == -1){ /*If checkHeight(root) returns -1, then the tree is not balanced */
    return false;
  }else{
    return true;  /* Otherwise the tree is balanced */
  }
}
