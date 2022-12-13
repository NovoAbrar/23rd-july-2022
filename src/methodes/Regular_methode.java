package methodes;

public class Regular_methode {

	public static void main(String[] args)
	{
		//statice methode call from same class  
		
		//methode name 
		
		addition();
	    
		//call ststic methode from another class 
        //other class name .methdoename 
		
		Static_methoe01.subtration();
		
		//calling non ststic methode from same class
		//classname obejctname =new classname ()
		
		Regular_methode rm=new Regular_methode();
		//call methdoe using objcet and methode name 
		
		rm.multiplication();
		
		//calling non ststic methode from another  class
		
		//classname of that methode from another class 
		Static_methoe01 sm=new Static_methoe01();
		
		sm.division();
		
	}

	
	  //statice methode regular and complete methode 
	
	  public static void addition()
	
	{
		int a=20;
		int b=30;
		int sum=a+b;
		System.out.println("addition of " +a+ " and " +b+ " is " +sum);
		
	}
	  
	  public void multiplication()
	  {
		  int a=8;
		  int b=7;
		  int mul=a*b;
		  System.out.println("multiplication n of " +a+ " and " +b+ " is " +mul);
	  }
	
}
