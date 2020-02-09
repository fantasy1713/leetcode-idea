package tree;

public class BTree {
	public Node buildTree(int[] array){
		Node[] nodes = new Node[array.length];
		for(int i=0;i<array.length;i++){
			Node _node = new Node(array[i]);
			nodes[i] = _node;
		}
		
		for(int i=0;i<array.length;i++){
			int lIndex = i*2+1,rIndex = i*2+2;
			nodes[i].lc = lIndex<array.length?nodes[lIndex]:null;
			nodes[i].rc = rIndex<array.length?nodes[rIndex]:null;
		}
		return nodes[0];
	}

	public int getDepth(Node root){
		if(root==null)return 0;
		int ld = getDepth(root.lc);
		int rd = getDepth(root.rc);
		return 1+( ld>rd?ld:rd);
	}
	
	public int getMinDepth(Node root){
		if(root==null)return 0;
		int ld = getMinDepth(root.lc);
		int rd = getMinDepth(root.rc);
		return 1+( ld<rd?ld:rd);
	}
	public boolean isSameTree(Node r1,Node r2){
		if(r1==null&&r2==null)return true;
		else if(r1==null||r2==null)return false;
		else{
			return isSameTree(r1.lc,r2.lc)&&isSameTree(r1.rc,r2.rc);
		}
	}
	//判断对称树
	public boolean isSymmetric(Node root) {
        if(root==null)  return true;
        return isSymmetric(root.lc,root.rc);
    }
    private boolean isSymmetric(Node l,Node r){
        if(l==null&&r==null) return true;
        if(l==null||r==null) return false;
        if(l.value!=r.value) return false;
        return isSymmetric(l.lc,r.rc)&&isSymmetric(r.lc,l.rc);
    }
	
	public static void main(String[] args){
		BTree tree = new BTree();
		Node root = tree.buildTree(new int[]{1,2,3,4});
		Node root2 = tree.buildTree(new int[]{1,2,3,4,5});
		System.out.println(tree.isSameTree(root, root2));
		
		
	}
}
class Node{
	public Node(int i) {
		this.value = i;
	}
	int value;
	Node lc;
	Node rc;
}