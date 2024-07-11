package day20;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {

//Declaration:--
		ArrayList mylist=new ArrayList();
	//  List mylist=new ArrayList(); //	List is ParentClass
	//	ArrayList <String>mylist=new ArrayList<String>(); //we want to store sepecific datatype
		
//Adding data into arraylist:--
//can store duplicate values and multiple nulls	
//In same order they will  save. ArrayList follow Indexing techinque
		mylist.add(100);
		mylist.add(10.5);
		mylist.add("welcome");
		mylist.add('A');
		mylist.add(true);
		mylist.add(100);
		mylist.add(null);
		mylist.add(null);

//size of a arraylist:--
		System.out.println("Size of arraylist:"+mylist.size());//8
		
//Printing arraylist elements:--		
		System.out.println("priniting elements:"+mylist);//[100, 10.5, welcome, A, true, 100, null, null]
		
//Remove one of the element from arraylist
		System.out.println(mylist.remove(5));//here 5 is index
		System.out.println("After removing:"+mylist);//[100, 10.5, welcome, A, true, null, null]
		
//Insert element in arraylist:-- insert in middle of arraylist
		mylist.add(2, "java");//here 2 is index
		System.out.println("After inserting:"+mylist);//[100, 10.5, java, welcome, A, true, null, null]

//Modify element in arraylist:- modify/replace/change/update
		mylist.set(2, "selenium");//here 2 is index
		System.out.println("After modifying:"+mylist);//[100, 10.5, selenium, welcome, A, true, null, null]
	
//Access specific element from arraylist:-
		System.out.println(mylist.get(2));//here 2 is index
		
		
//Reading all elements from Arraylist:-- 3 ways(forloop,foreach,Iterator)		
		
//1) for loop:---
		for(int i=0;i<mylist.size();i++)
		{
			System.out.println(mylist.get(i));
		}
		
//2)for each loop:---		
		
		for(Object x:mylist)
		{
			System.out.println(x);
		}
		
//3) Iternator
		
		Iterator it=mylist.iterator();
		
		while(it.hasNext()) //hasNext() is used to check the next element present or not
		{
		
			System.out.println(it.next());
			//next() is used to return the value from element
	    }
		
//remove multiple elements from arraylist at a time:--
//No direct method avaiable to remove. It is workaround
		ArrayList mylist2=new ArrayList();
		mylist2.add('A');
		mylist2.add(10.5);
		mylist2.add(null);
		
		mylist.removeAll(mylist2);//here will remove all duplicate values also null
		System.out.println("After removing multiple elements:"+mylist);
		
//Checking arraylist empty or not:--
		System.out.println("Is arraylist empty?"+mylist.isEmpty());
		
		
		
//To Remove all elements from arraylist:--
		mylist.clear();
		System.out.println("After removing all elements:"+mylist);
		System.out.println("Is arraylist empty?"+mylist.isEmpty());
		
		
		
		
	}
}
