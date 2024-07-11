package day20;

import java.util.Map;
import java.util.Map.Entry;
import java.util.HashMap;
import java.util.Iterator;

public class HashMapDemo {

	public static void main(String[] args) {

//Declaration:--
	 //  HashMap hm=new HashMap();
	 //  Map hm=new HashMap();
		 HashMap<Integer,String> hm=new HashMap<Integer,String>();
		 //This is mandatory
		
//Adding pairs in HashMap:-
		 hm.put(101, "Sindhu");
		 hm.put(102, "Dheeraj");
		 hm.put(103, "Manasa");
		 hm.put(102, "Suju"); //Here 102 is duplicate key
		 
		 System.out.println(hm);//{101=Sindhu, 102=Suju, 103=Manasa}
		 //Here 102 is updated/replaced with suju from Dheeraj
		
//Size of Hashmap:--
		 System.out.println(hm.size());//3
		 
//remove a pair from Hashmap:-
		 hm.remove(102); //102 is key of the pair
		 System.out.println("After removing pair:"+hm);//{101=Sindhu, 103=Manasa}
		 
//Access value of the key
		 System.out.println(hm.get(101)); //100 is key //Sindhu
		 
//Access all keys from Hashmap:--
		 System.out.println(hm.keySet()); //[101, 103]
		 
//Access all values from Hashmap:--
		 System.out.println(hm.values()); //[Sindhu, Manasa]
		 
//Access all keys & value(pair) from Hashmap:--
		 System.out.println(hm.entrySet()); //[101=Sindhu, 103=Manasa]
		 
//Reading data from Hashmap:- 2 ways(foreach and Iterator)
//1)By using for each
		 
		 for(int x:hm.keySet())
		 {
			 System.out.println(x+"  "+hm.get(x));
		 }
//2)By using Iterator:--
	//Cann't call Iterator method directly from hm 
		 
		 Iterator<Entry<Integer, String>> it=hm.entrySet().iterator();
			
		while(it.hasNext())		 
		{
			Entry<Integer,String> entry=it.next();
			System.out.println(entry.getKey()+"  "+entry.getValue());
		}
		
//Clear all pairs from hashmap:-
		
	       hm.clear();
	       System.out.println(hm.isEmpty());//true
		
		
		
		
	}

}
