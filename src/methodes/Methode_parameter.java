package methodes;

public class Methode_parameter

{
	
	
	

	public static void main(String[] args) 
	
	
	{
		addition(10, 20);
		addition(20, 30);
		
		Methode_parameter mp=new Methode_parameter();
		mp.multiplication(8, 2);
	}
	
	public static void    addition(int num1, int num2)   //ststic
	{
		int a=num1;
		int b=num2;
		int sum=a+b;
		System.out.println("addition is "+sum);
		
	}
		
		public void multiplication(int num3, int num4)
		{
			
			int c=num3;
			int d=num4;
			int mul =c*d;
			System.out.println("multiplication is "+mul);
			
			
			
		}
		
		
		
	}
	
	
	  
	
	


