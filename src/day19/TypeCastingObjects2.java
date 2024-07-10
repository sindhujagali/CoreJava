package day19;

class Animal{}
class Dog extends Animal{}
class Cat extends Animal{}

//3 Rules for Type Casting

public class TypeCastingObjects2 {

	public static void main(String[] args) {

//Rule1:- Conversion is valid or not
//The Type of 'd' and 'C' must have some relationship(either child to parent or parent to child)
 //       Animal an=new Dog();
 //       Cat ct=(Cat)an; //valid as per rule1
        
     // Dog dg=new Dog();
     // Cat c=(Cat) dg; //Invalid as per rule 1,Compile time Error
     //No relationship b/w Dog & Cat classes   
        
      //  Cat ct=(Cat)an;	
     //    A   b   C  d ==>C and d having Child&Parent relationship here 
		
//Rule 2 : Assignment is valid or not
// 'C' must be either same or Child of 'A'
//        Animal an=new Dog();
//        Cat ct=(Cat)an; //Valid as per rule 2
          
//        Animal an=new Dog();
//        Cat ct=(Dog)an; //InValid as per rule 2,Compile time Error
        
//Exection will happen but will get runtime error if not follow rule 3
//Rule 3:- The Underlying object type of 'd' must be either same or Child of 'C'
		
//		Animal an=new Dog();
//		Cat ct=(Cat)an; //invalid as per Rule 3, runtime error
		
//Rule1,Rule2&Rule3:--
		
		Animal an=new Dog();
		Dog dg=(Dog) an; //Rule1-yes, Rule 2-yes, Rule 3-yes
		
	}

}
