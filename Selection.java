package auto;
import java.util.Scanner;
public class Selection {
	static int i;
static String userid;
static String pass;
static String b="Cooldude";
static String a="Admin@123";
static                                                  //implementation of static block
{ 
	Selection ref= new Selection();
	Scanner sc= new Scanner(System.in);
	 System.out.print("USER ID:");
		userid= sc.next();
 System.out.print("PASSWORD:");
		pass= sc.next();
}
	

  
public void retry()                                     //non static method
{ 
	Selection ref= new Selection();
   Scanner sc= new Scanner(System.in);
	 System.out.print("USER ID:");
		userid= sc.next();
 System.out.print("PASSWORD:");
		pass= sc.next();
		 if(userid.equals(a) && pass.equals(b))         //checking for user ID & Password
		 {
			 ref.start();
		 }
		 else
		 { System.out.println("INVALID USER");
			 retry();
		 }
    System.gc();    
}
public static void Selection_1()
{ Scanner sc = new Scanner(System.in);
   int i= sc.nextInt();
	switch (i)
	{
	case 2:Two_wheeler.out_two_wheeler();    //to select two wheeler class
    break;
    case 3:Three_wheeler.out_three_wheeler();  //to select three wheeler class
    break;
	case 4:Four_wheeler.out_four_wheeler();//to select four wheeler class
	System.out.println("Available Models in 2 Wheeler & 3 Wheeler");
	   System.out.println("PLEASE ENTER THE DATA FROM ABOVE");
	Selection_1();
	break;
    case 6:Four_wheeler.out_six_wheeler();//to select six wheeler class
	System.out.println("Available Models in 2 Wheeler & 3 Wheeler"); 
	   System.out.println("PLEASE ENTER THE DATA FROM ABOVE");
    Selection_1();
    break;
    default:System.out.println("XXXXXXX--No data found--XXXXXXX");
            System.out.println("PLEASE ENTER THE DATA FROM ABOVE");
    	    Selection_1();
    break;
	}
}
void start ()
{    Selection sec= new Selection();
	 if(userid.equals(a) && pass.equals(b))
	 {
	        System.out.println("welcome to Auto World !!!");
	        System.out.println("Please select type of vehicle from below:");
	        System.out.println("Press [2] for Two wheeler");
	        System.out.println("Press [3] for Three wheeler");
	        System.out.println("Press [4] for Four wheeler");
	        System.out.println("Press [6] for Six wheeler");
	 
	 }
	 else 
	 {
	 	 System.out.println("INVALID USER");
	     sec.retry();
	 }
}
public class Payment 
{   
	static int a;
	static int b;
	static int c;
	static double total;
	int amount;
    int tax;
    static double gst= 0.28;
    double Final;
    Payment()
    {
    }
    Payment(int amount,int tax) 
    {   this();
    	this.Final=(amount+tax)*gst;
		this.amount=amount;
        this.tax=tax;
         System.out.println("GST ACCORDING TO 28% IS:"+Final);
          System.out.println("ON ROAD TAX:"+tax);
          System.out.println("SHOW ROOM PRICE:"+amount);
    }
   public void cash(int amount,int tax)
{  
   Payment pay = new Payment(amount,tax);
   total=pay.amount+pay.tax+pay.Final;
   System.out.println("FINAL AMOUNT:"+total);	
}
   public  void upi(int amount,int tax)
{  
   Payment pay= new Payment(amount,tax);
   total=pay.amount+pay.tax+pay.Final;
   System.out.println("FINAL AMOUNT:"+total);
   System.out.println("PAY TO UPI NO.8945327@hdfcbank");	
}
   public void emi(int amount,int tax)
   {
	   Payment pay= new Payment(amount,tax);
       total=pay.amount+pay.tax+pay.Final;
       System.out.println("FINAL AMOUNT:"+total);
       a = (int)total/3;
       System.out.println("--------------------------");
       System.out.println("EMI FOR 3 MONTHS:"+a+"*3");
       b = (int)total/6;
       System.out.println("--------------------------");
       System.out.println("EMI FOR 6 MONTHS:"+b+"*6");
       c = (int)total/12;
       System.out.println("--------------------------");
       System.out.println("EMI FOR 12 MONTHS:"+c+"*12");
   }
}	

public static void main(String[] args) 
	{Selection ref=new Selection ();
	ref.start();
	Selection.Selection_1();
	
	}
}


