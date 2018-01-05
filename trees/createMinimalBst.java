/* Given a sorted array with unique elements, write an algorithm to create BST with minimal height */

/* Start from the mid of the array and make it as the root. The left half becomes the left sub tree and
right half of the array becomes the right subtree */
public static Node createMinimalBst(int[] nums, int low, int high){
  if(low > high) return null;

  int mid = low + (high - low)/2;
  Node n = new Node(nums[mid]);
  n.left = createMinimalBst(nums, low, mid - 1);
  n.right = createMinimalBst(nums, mid + 1, high);
  return n;
}

public static void createMinimalBst(int[] nums){
  return createMinimalBst(nums, 0, nums.length - 1);
}
