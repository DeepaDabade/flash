package trainings;

public class methodoverloading {
   public float printSum(float a, float b)
   {
	   return a+b; 
   }
public float printSum(int a, int b)
{ 
	return a+b;
	}
public static void main(String[] args) 
	{ 
	methodoverloading obj=new methodoverloading(); 
    System.out.println(obj.printSum(10,20.5f));
  }
} 