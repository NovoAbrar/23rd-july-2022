package methodes;

public class methode_paramete {

	public static void main(String[] args)
	
	{
		addition(20, 30);//multipac condtion we can run 
		addition(20, 60);

		methode_paramete mp=new methode_paramete();
		mp.multiplication(5, 90);
		mp.multiplication(5, 5);
				
	}
	

	
	  public static void addition(int a,int b)
		
		{
			int sum=a+b;
			System.out.println("akc"+sum);
			
		}
		  
		  public void multiplication(int c, int d)  {
		     
			  int mul=c*d;
			  System.out.println("mul " +mul);
		  
		  } 
		  
		  
		  
		  
		  
		  
		  
}
