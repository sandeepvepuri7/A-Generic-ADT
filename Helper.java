/**
 * @author sandeep Vepuri 
 * 213 

 */


import java.io.File;
import java.io.FileNotFoundException;

import java.util.Scanner;

public class Helper {
	public static String[] apple (String a){
		
		return null; 
	}
	
	public static void start () throws FileNotFoundException {
		    BinarySearchTree bitree = new BinarySearchTree ();
			Database datapoint = null;
			int class1 = 0 ;
			
			File  reader  = new File("./src/class.txt");// the txt file to read it 
			Scanner sc = new Scanner(reader);
			while(sc.hasNext()) {// while statememake sure the code run until the while statement
				String text = " ";
				
				text = sc.next();
				System.out.println("my txt is " +text);
				String[] text1 = text.split(",");// space them out their is ","
				
				if (class1 == 0) {
				System.out.println("my size is "+ text1.length);
				int num1 =  Integer.parseInt(text1[0]);// convertign thing s to int 
				int num2 =  Integer.parseInt(text1[2]);// convertign thing s to int
				
				String asds = text1[3].replace("_"," ");// repalce _ of inx{3] with space
					datapoint = new Database(num1, text1[1], num2,asds,text1[4]);
					 TreeNode noti = new TreeNode(num1);
					 bitree.Insert(noti);
					datapoint.add(datapoint);
				class1++;
				}else {
					
					int num1 =  Integer.parseInt(text1[0]);
					int num2 =  Integer.parseInt(text1[2]);
					String asds = text1[3].replace("_"," ");
					datapoint.add(new Database(num1, text1[1], num2,asds,text1[4]));
					 TreeNode noti = new TreeNode(num1);
					 bitree.Insert(noti);
					 
				}
				   System.out.println("*******************");
			datapoint.printall();
//   datapoint.getbi());
				}
//	      datapoint.printall();
//	      
//	      datapoint.getbi().printall(datapoint.getbi().getroot());
//	      System.out.println();
//	 
//	      datapoint.getbi().it();
			//BinarySearchTree appl = new BinarySearchTree;
			//bitree.Delete(new TreeNode(9797),bitree.getroot());
			System.out.println();
			System.out.println("i conver it binary search tree into an array where all the class sections are sorted");
			bitree.iterator();// iteratior
			System.out.println();
			 System.out.println("this is my total size "+bitree.list.size()); // tell you the total size 
			 System.out.println();
		bitree.printall(bitree.Delete(new TreeNode(9797),bitree.getroot())); // this delte a number you are aking for 
		 System.out.println();
		bitree.iterator();// you call it for the size to work 
		 System.out.println();
		 System.out.println("this my size "+bitree.list.size());// get's the size after you delete
		 datapoint.btree = bitree;
		 datapoint.printall();// print ecerthing 
		 System.out.println(bitree.list);
		 datapoint.printall1();//  pritn all
		 bitree.root = datapoint.btree.root; // print hte root
		 System.out.println();
		 System.out.println( bitree.Search(new TreeNode(6666)).getitem());// look for 6666 and print it 
		 int i = (int)( bitree.Search(new TreeNode(6666)).getitem());// amke 6666 info eqaul to i 
		 datapoint.sea(i); // print i which all the info abotu 6666
		 
		
			
			
			}
	}
