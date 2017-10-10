package abstractImpliment;

public class Abstract {

	public static void main(String[]args){  
		
		Mobile obj = new AndroidMobile();
		//here we cannot  instantiate the object class
		//so we create object of AndroidMobile which is not an abstract class

		obj.call();

		obj.message();

		obj.video();

		obj.music();

	}

}

    abstract class Mobile{ //a class is declared as abstract is known as abstract class

    	// here i have created a parent class .if we define abstract methods so that class must be an abstract class

    	public void call(){ //if i have created a method and i have declared it 

    		   System.out.println(" mobile features :calling");

    	   }

      public abstract void message(); //here i have defined the abstract methods  

      public abstract void video();

      public abstract void music();

       }



  class AndroidMobile extends Mobile{   //here i have extended the parent to the child class

	   public void  message(){  //here i have implemented them in this class

		   System.out.println("android mobiles has a feature : message");
		
		   

	   }

	   public  void video(){

		   System.out.println("android mobiles has an another feature :video");  

	   }

	   public  void music(){

		   System.out.println("android mobiles has  one more feature : music");

	   }

   }
