import java.util.ArrayList;

public class Database {
	private int ClassNumber;
	private String  CourseSubject;
	private int CatalogNumber;
	private String  ClassTitle;
	private String Level;
/**
 * 
 * @param ClassNumber
 * @param CourseSubject
 * @param CatalogNumber
 * @param ClassTitle
 * @param Level
 * just make so we cna use them
 * @return null
 */
	public Database(int ClassNumber, String CourseSubject, int CatalogNumber, String ClassTitle, String Level) {
		this.ClassNumber =ClassNumber;
		this.CourseSubject = CourseSubject;
		this.CatalogNumber = CatalogNumber;
		this.ClassTitle =ClassTitle;
		this.Level = Level;
	}
	
	BinarySearchTree  btree = new BinarySearchTree ();
	
	public ArrayList<Database> data = new ArrayList<>(); // creating the aray list 
	public void add(Database d ) {
		TreeNode tn = new TreeNode(d.getclassNumber());
		btree.Insert(tn);
		data.add(d);
	}
	/*
	 * @param null
	 * this return the class number
	 * @return null
	 */
	public int getclassNumber() {

		return this.ClassNumber;


	}
	
	ArrayList<TreeNode> array = new ArrayList<>();
	public  ArrayList btree2 (TreeNode r) {
		btshelper(r);
		return array;

	}
	/*@prama TreeNode r 
	 * this conver tree to an array list 
	 * @return null
	 */
	private void btshelper(TreeNode r) {
		if(r!=null) {
			btshelper(r.getLeft());
			array.add(r);
			btshelper(r.getRight());

		}

	}
	/** 
	 * @param null
	 * this return the size  
	 * @return data.size
	 */
	public int classSize() {
		return data.size();
	}
	/**
	 * @param null
	 * this make this empy 
	 * @return null
	 */
	public void empty() {
		System.out.println("it's empty");
		data = new ArrayList<>();
		btree = new BinarySearchTree ();
	}
	/*
	 * @param  int ClassNumber 
	 * you have to enter the class number 
	 * it will go trought bts to get you val 
	 * if what you look for is not thier it will return null
	 * else it will retrun you value you looking for 
	 * @retrun data.get(x);
	 */
	public Database search(int ClassNumber) {
		TreeNode temp = new TreeNode(ClassNumber);
		if(btree.Search(temp)==null) {
			return null;
		}else {
			for(int x =0 ; x<data.size(); x++) {
				if (data.get(x).getclassNumber()== ClassNumber) {
					return data.get(x);
				}
			}
		}return null;
	}
	/**
	 * @param null
	 * if it's empty it retrun true
	 * @return ture
	 * else it return false
	 * @return false 
	 */
	public Boolean isempty() {
		if(data.size()==0) {
			return true;
		}return false ;
	}
	/*
	 * @param null
	 * this make it look nicer
	 * @return null
	 */
	public void print() {
		String d = this.ClassNumber +" "+  this.CourseSubject  +" "+ this.CatalogNumber  +" "+ this.ClassTitle  +" "+  this.Level;
		System.out.println(d);
		
				}
	/**
	 * @param null
	 * look at the binart tree 
	 * only look at the item and prit it 
	 * @return null
	 */
	public void printall1() {
		System.out.println("ClassNumber	"+ "  CourseSubject"+ " 	CatalogNumber" + " 	ClassTitle" + " 	Level");
//		for(int x =0 ; x<data.size(); x++) {
//		data.get(x).print();
//			}
		for(int x =0 ; x<btree.list.size();x++) {
			int temp= (int) btree.list.get(x);
			for(int i =0 ; i<data.size();i++) {
				if (data.get(i).getclassNumber()==temp) {
				data.get(i).print();
				}
			}
		}
	
	}
	/**
	 * @param null 
	 * this print everything on the txt file
	 * @return null
	 */
	public void printall() {
		System.out.println("ClassNumber	"+ "  CourseSubject"+ " 	CatalogNumber" + " 	ClassTitle" + " 	Level");
		for(int x =0 ; x<data.size(); x++) {
		data.get(x).print();
			}
//		for(int x =0 ; x<btree.list.size();x++) {
//			data.get((int) btree.list.get(x)).print();
//		}
	
	}
	/*
	 * @param int a 
	 * this basic print what you are seaching for
	 * @return  null
	 */
	public void sea(int a) {
		for(int x =0; x<data.size();x++) {
			if(data.get(x).getclassNumber()== a) {
				data.get(x).print();
			}
		}
	}
	/*
	 * @parma  null
	 * @retrun null;
	 * this just get's the binary tree
	 */
	public BinarySearchTree getbi() {
		return btree;
	}
}
