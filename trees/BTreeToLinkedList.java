/* Given a binary tree, design an algorithm which creates a LinkedList of all athe nodes of each depth
(e.g if you have tree of D depth, there will be D LinkedLists) */
public List<List<Integer>> convert(Node root){
  Queue<Node> q = new LinkedList<Node>();
  List<List<Node>> result = new LinkedList<List<Node>>();

  if(root == null) return root;
  q.add(root);

  while(!q.isEmpty()){
    int level = q.size();
    LinkedList<Node> subList = new LinkedList<Node>();
    for(int i = 0; i < level; i++){
      Node temp = q.poll();
      subList.add(temp);
      if(root.left != null) q.add(root.left);
      if(root.right != null) q.add(root.right);
    }
    result.add(subList);
  }

  return result;
}
