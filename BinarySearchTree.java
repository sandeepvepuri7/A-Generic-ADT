import java.util.Comparator;
import java.util.LinkedList;
import java.util.ListIterator;

public class BinarySearchTree <E extends Comparable<E>>{
	TreeNode root =null;
	private Comparator<E> comparator;
	private int compare(E x, E y)
	{
		if(comparator == null) return x.compareTo(y);
		else
			return comparator.compare(x,y);
	} 
	/**
	 * 
	 * @param val1
	 * @param val2
	 * this is a helper method can't expalin it runnign out of tien 
	 * @return val1
	 */
	private TreeNode insterhelper(TreeNode val1,TreeNode val2) {
		if(val1==null) {
//			val1.setitem(val2.getitem());
//			return val1;
			val1 = new TreeNode(val2.getitem());
			return val1;
		}
		int num1 = (int )val1.getitem();
		int num3 = (int) val2.getitem();
		if(num1>num3) {
			val1.setLeft(this.insterhelper(val1.getLeft(), val2));
			
		}else {
			val1.setRight(this.insterhelper(val1.getRight(), val2));
		} 

		return val1;
	}
//	private TreeNode  insterhelper1 (TreeNode val1  , TreeNode val2) {
//
//
//		//		try {
//		
//		if(val1.getRight()!= null) {
//
//			System.out.println("Here right sode");
//			int num1 = (int )val1.getRight().getitem();
//			int num3 = (int) val2.getitem();
//			if(num1>num3) {
//				this.insterhelper(val1.getLeft(), val2);
//			}else {
//				this.insterhelper(val1.getRight(), val2);
//			} 
//
//		}else { 
//			int num = (int )val1.getitem();
//			int num2 = (int) val2.getitem();
//			if(num<num2) {
//				System.out.println("Here SETTT");
//				  val1.setRight(val2);
//				  return val1;
//
//			}
//		}
//		//		} catch (Exception e) {
//		//			// TODO Auto-generated catch block
//		//			e.printStackTrace();
//		//			
//		//		}
//		//		try {
//		if(val1.getLeft()!=null) {
//			System.out.println("Here SETTkjjkjhkT");
//
//			int num1 = (int)val1.getLeft().getitem();
//			int num2 = (int)val2.getitem();
//			if(num1>num2)
//				this.insterhelper(val1.getLeft(), val2);
//			else {
//				this.insterhelper(val1.getRight(), val2);
//			}
//		}	else {
//			int num = (int )val1.getitem();
//			int num2 = (int) val2.getitem();
//			if(num>num2) {
//				val1.setLeft(val2);
//				
//				System.out.println("Here SETTT");
//				return val1;
//			}
//		}
//		return val1;
//		//		} catch (Exception e) {
//		//			// TODO Auto-generated catch block
//		//			e.printStackTrace();
//		//		}
//	}
//
/**
 * 
 * @param add
 * in this method we are suff to tree 
 * so we look for if left side is biiger or cheak if has to right side 
 * @return null
 */
	public void Insert(TreeNode add){
		//		System.out.println("Here");
		if(root== null) {
			

			root = add;
		}else {
			

			int val1 = (int)root.getitem();
			int val2 = (int)add.getitem();
			
			if(val1<val2 )
			{
				if(root.getRight()==null) {
					System.out.println("this geting right SIDE");
					root.setRight(add);
					
				}else {
					System.out.println("Here RIGHT SIDE");
					
					root.setRight(insterhelper(root.getRight(),add));	
				}

			}else {
				
				if(root.getLeft()==null) {
					System.out.println("this geting Left SIDE");
					root.setLeft(add);
				}else {
					System.out.println("Here Left SIDE");
					root.setLeft(insterhelper(root.getLeft(),add));
					
				}
			}


		}
	}
	/**
	 * 
	 * @param val
	 * @param root
	 * In the delete method 
	 * we cheak it
	 * if both null are we jsutt remove it cheack if it leaf node a coverthe parent node to null
	 * iif don't find it it will say no found;
	 * 
	 * @return root
	 */
	public TreeNode Delete(TreeNode val, TreeNode root) {
		
		
		if(root== null) {
			System.out.println("NO Node EXIST");

		}else {
			this.printall(root);
			TreeNode current = root;
			TreeNode parent = null;
			int val1 = (int)current.getitem();
			int val2 = (int)val.getitem() ;
			while (current != null && val1!= val2) {
				parent = current;
     			val1 = (int)current.getitem();
//				int val2 = (int)val.getitem() ;
				if(val1>val2) {
					current = current.getLeft();
				}else {
					current = current.getRight();
				}
			}
			if(current==null) {
				System.out.println("this is not found");
				return root;
			}
			if(current.getRight()==null && current.getLeft()==null) {
				//if(parent.getLeft().getitem()== current.getitem()) {
//					parent.getLeft();
//				}else {
//					parent.getRight();
//				}
				if(current != root) {
					if(parent.getLeft()==current) {
						parent.setLeft(null);
					}else 
						parent.setRight(null);
				}
			} else if(current.getRight()!=null && current.getLeft()!=null) {
				TreeNode succersor = current.getRight();
				while(succersor!= null) {
					succersor = succersor.getLeft();
				}
				Object suc = succersor.getitem();
				Delete(succersor,root);
				current.setitem(suc);
			}else if (current.getLeft()!=null){
				
				if(current!= root) {
//					int cur= (int) current.getitem();
//					int L = (int) parent.getitem();
							
					if(current==parent.getLeft()) {
						parent.setLeft(current.getLeft());
					}else {
						parent.setRight(current.getLeft());
					}
				}
				else {
					root = current.getLeft();
				}
				//parent.setLeft(current.getLeft());
			}else
			{
				
				if(current!= root) {
					
//					int cur= (int) current.getitem();
//					int L = (int) parent.getitem();
							
					if(current==parent.getLeft()) {
						parent.setLeft(current.getRight());
					}else {
						parent.setRight(current.getRight());
					}
				//parent.setRight(current.getRight());
			}
				else {
					root = current.getRight();
				}
		
		} 
	}
		return root;
	}
	/**
	 * 
	 * @param key
	 * in this mehtod this tkae treenode jey that 
	 * will cheack it it equall to somthing if not it will retrun null 
	 * or it will give what you are look for
	 * @return null/ thing you looking for 
	 */
	public TreeNode Search(TreeNode key) {
		
		if(root == null) {
			System.out.println("can't be found");
		}else {
			TreeNode current = root;
			while (current !=null) {
                 int curr =  (int) current.getitem();
                 int ans = (int) key.getitem();
				if(curr == ans) {
					return current; 
					

				}
				int val = (int) key.getitem();
				int val1 = (int) current.getitem();
				if (val>val1) {
				current =  current.getRight();

				}else 
					current =  current.getLeft();
			}
			System.out.println("Not found");
		}

		return null;
	}
	/**
	 * @param null
	 * this get thee root 
	 * @return root
	 */
	public TreeNode getroot() {	
		return root;
	}
	LinkedList <E> list  = new LinkedList<>();
	/**
	 * @param null
	 * this help iterator 
	 * @return null
	 */
	public void iterator() {
		TreeNode current = root;
		list = new LinkedList<E>();
		this.printall(current);
		if(current!=null) {
			helper(current);
		}

	}
	/**
	 * @param null
	 * this help you iterator 
	 * @return null
	 */
	public void it() {
		this.iterator();
		ListIterator<E> num = (ListIterator<E>) list.iterator();
		//			
		while(num.hasNext()) {

			System.out.println(num.next());
			num.remove();
			}
		//		System.out.println(list);
		//		for(int x=0;x<list.size();x++) {
		//			int some = (int)list.get(x);
		//			System.out.println("Iterator "+some);
		//		}
	}
	/**
	 * 
	 * @param a
	 * this is a helper method 
	 * this cheack of treenode is a left/right 
	 * this add 
	 * @return null
	 */
	public void helper(TreeNode a) {
		if (a.getRight()!=null) {
		//	list.add((E)a.getitem());
			helper(a.getRight());
		}
		if(a.getLeft()!=null) {
			//list.add((E)a.getitem());
			helper(a.getLeft());
		}
		list.add((E)a.getitem());
		
	}
	/**
	 * 
	 * @param r
	 * this print everything
	 * @return null
	 */
	public void printall(TreeNode r) {
		if(r==null) {
			return ;
		}
		printall(r.getLeft());
		System.out.print(" " + r.getitem());
		printall(r.getRight());
	}

}
