import java.io.FileNotFoundException;

public class driver {	
//	static TreeNode node1 = new TreeNode(1);
	public static void main(String[] args)  {
		
//		File  reader  = new File("./src/class.txt");
//		Scanner sc = new Scanner(reader);
//		// while statememake sure the code run until the while statement
//			String text = "7122, ICSI,213, Data Structers, Undergraduate";
//			String[] text1 = text.split(",");
//			for(int x =0; x<text1.length ;x++) {
//				System.out.println(text1[x]);
//		
				try {
					Helper.start();
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	}
}

			
				// TODO Auto-generated catch block
			
		
				//TreeNode node1 = new TreeNode(1);
//				TreeNode node2 = new TreeNode(2);
//				TreeNode node3 = new TreeNode(3);
//				TreeNode node4 = new TreeNode(-4);
//				bigtree(node2, node3);
//				node2.print();
//				bigtree(node1, node3);
//				node1.print();
//				if(node1.getRight()==null) {
//					node1.setRight(node2);
//				}
//				else {
//					int numval1 = (int) node1.getRight().getitem();
//					int numval2 = (int) node2.getitem();
//					if(numval2<numval1) {
//						node1.getRight();
//						if(node1.getRight().getRight()!=null) {
//							int numval3 = (int) node1.getRight().getRight().getRight().getitem();
//							if (numval2>numval3) {
//								if(node1.getRight().getRight().getRight().getLeft()!=null) {
//									int numval4 = (int) node1.getRight().getRight().getRight().getLeft().getitem();
//								}
//							}
//
//						}else {
//							node1.setLeft(node2);
//						}
//					}else {
//
//					}
//
//				}
		
//	}
//	public static   TreeNode bigtree(TreeNode tree, TreeNode tree2) {
//		System.out.println("i an here");
//		if (tree == null) {
//			System.out.println("i a ni");	
//			tree = tree2;
//			return tree;
//		}else
//		{ 
//			int val1 = (int) tree.getitem();
//			int val2 = (int) tree2.getitem();
//			if(val1>val2) {
//				if(tree.getLeft()!=null) {
//					int numval2 = (int) tree.getLeft().getitem();
//					System.out.println("val "+numval2);
//					int numval3 = (int) tree2.getitem();
//					System.out.println(numval3);
//					if(numval2<numval3) {
//						tree.getRight();
//						bigtree(tree.getRight(),tree2);
//					}else { 
//						tree.getLeft();
//						bigtree(tree.getLeft(),tree2);
//					}
//				}else { System.out.println("3");
//					tree.setLeft(tree2);
//					return tree;
//					
//				}
//			} else { 
//				if(tree.getRight()!=null) {
//					int numval1 = (int) tree.getRight().getitem();
//					System.out.println(numval1);
//					int numval2 = (int) tree2.getitem();
//					System.out.println(numval2);
//					if(numval1<numval2) {
//						tree.getLeft();
//						bigtree(tree.getLeft(),tree2);
//					}else { System.out.println("5");
//						tree.getRight();
//						bigtree(tree.getRight(),tree2);
//					}
//				}else { System.out.println("6");
//					tree.setRight(tree2);
//					return tree;
//				}
//			}
			
//	
//			
//		}
//		return null;
	
