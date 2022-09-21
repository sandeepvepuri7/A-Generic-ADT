/**
 * 
 * accorindto  prof notes this is a biant tree that tthe node that cotian data
 * a name and two reft one is node chiledr
 * 
 *
 * 
 */
public class TreeNode <E>{
	private E item;
	private TreeNode<E> Right;
	private TreeNode<E> Left;
	public TreeNode() {
		this(null, null, null);
	}
	public TreeNode(E item) {
		this(item, null, null);	
//		this.item = item;
//		this.Right = new TreeNode(0);
//		this.Left = new TreeNode(0);
	}
	public TreeNode(E item, TreeNode<E> Left, TreeNode<E> Right) {
		this.item = item; 
		this.Left = Left;
		this.Right = Right;
	}
	public E getitem() {
		return this.item;

	}
	public void  setitem(E item) {
		this.item = item;
	}
	public TreeNode <E> getLeft(){
		return this.Left;
	}
	public void setLeft(TreeNode<E> Left) {
		this.Left = Left;
	}
	public TreeNode <E> getRight(){
		return this.Right;
	}
	public void setRight(TreeNode<E> Right) {
		this.Right = Right;
	}
//	public void print() {
//		if(item!=null) {
//			System.out.println("this is item "+item);
//			if(Right != null) {
//				System.out.println("this is right"+Right.getitem());
//			}
//			TreeNode right = Right;
//			while (right!=null){
//				right = Right.getRight();
//				if(right !=null) {
//					right.print();
//				}
//			}
//			if(Left != null) {
//				System.out.println("This is left"+Left.getitem());
//			}
//			TreeNode left = Left;
//			while (left!=null){
//				left = Left.getLeft();
//				if(left !=null) {
//					Left.print();
//				}
//			}
//		}
//	}
	
}
