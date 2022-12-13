package methodes;

public class Stataic_nonststic
{

	public static void main(String[] args)
	
	{
		addition();
		
		
		Stataic_nonststic sn=new Stataic_nonststic();
		   sn.subtration();

	}

	
	public static void addition()   //ststic
	{
		int a=8;
		int b=8;
		int sum=a+b;
		System.out.println("Addition is "+sum);
		
	}
	
	
	    public void subtration()
	{
	    int b=8;
		int c=9;
		int sub=b-c;
		System.out.println("subtration is "+sub);
	}
  }
	
	
	
	
	
	
	





