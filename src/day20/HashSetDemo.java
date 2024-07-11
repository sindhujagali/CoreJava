package day20;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {

//Declaration:--
				HashSet myset=new HashSet();
			//  Set myset=new HashSet(); //	Set is ParentClass
			//	HashSet <Integer>myset=new HashSet<Integer>(); //we want to store specify datatype
            //Integer is wrapper class for int (Hetrogenious data)
		
		
//Adding data into arraylist:--
//cannot  store duplicate values and multiple nulls	
//In same order they will not save. Hastset follow hasting techinque
				myset.add(100);
				myset.add(10.5);
				myset.add("welcome");
				myset.add('A');
				myset.add(true);
				myset.add(100);
				myset.add(null);
				myset.add(null);
//At compile time and runtime no error. Will store only unqiue values in elements
//Hashset not allowed duplicates and multiple nulls. Once added duplciates and multiple nulls will not saved in hastset		

				
//Printing Hashset
System.out.println(myset);	//[null, A, 100, 10.5, welcome, true]	

//Size of Hashset:--
System.out.println(myset.size());//6
		
//Remove element from set:--
      myset.remove(10.5);//direct value not index
      System.out.println("After remving:"+myset); //[null, A, 100, welcome, true]  
		
//Inserting element :-- NOT possible in hashing becoz it will not have index
      
//Access specify element:-- NOT possible in hashset becoz it will not have index
//Workaround is possible by converting Hashset to ArrayList
      ArrayList al=new ArrayList(myset);
      System.out.println(al);//[null, A, 100, welcome, true]
      System.out.println(al.get(3)); //here 3 is index

//Reading all elements from Hashset :-- 2 ways (foreach & Iterator)
//normal for loop is not possible becoz no index in hashset
      
//1) Using for each:--
      
      for(Object x:myset)
      {
    	  System.out.println(x);
      }
		
//2) By using Iterator
      
      Iterator it=myset.iterator();
      
      while(it.hasNext())
      {
    	  System.out.println(it.next());
      }
		
//Clearing all the elements in hashset
      myset.clear();
      System.out.println("After clearing:"+myset);
      System.out.println("Is empty?"+myset.isEmpty());
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
