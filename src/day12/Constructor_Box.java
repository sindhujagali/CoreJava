package day12;

public class Constructor_Box {

//ConstructorOverloading Example:--	
	
	
	double width,height,depth;
	
	//First Constructor method. No parameters is default Constructor
	Constructor_Box() 
	{
		//width=0;
		//height=0;
		//depth=0;
		
		//OR
		width=height=depth=0;
		
	}
	
	//second Constructor method with 3 parameters.
	Constructor_Box(double w,double h,double d)
	{
		width=w;
		height=h;
		depth=d;
	}
	
	//third Constructor method with 1 parameter.
	
	Constructor_Box(double len)
	{
		width=height=depth=len;
	}
	
	
	//user defined method
	double volume()
	{
		return (width*height*depth);
	}
	
	
}
