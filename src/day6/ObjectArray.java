package day6;

public class ObjectArray {

	public static void main(String[] args) {


          Object  a[]= {100,10.5,"Welcome",'A',true};
          
          
          //Enchaned for loop
          
          for(Object x:a)
          {
        	  System.out.println(x);
          }
          
          //Normal for loop
          
          for(int i=0;i<a.length-1;i++)
          {
        	  System.out.println(a[i]);

          }
	}

}
