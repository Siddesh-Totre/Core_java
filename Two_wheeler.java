package auto;
import java.util.*;

import auto.Selection.Payment;
public class Two_wheeler {
	  String colour_1;
	  String colour_2;
	  String colour_3;
	  String colour_4;
	  int seat;                                       // non static var for changing data acc to model
	  String fuel_type;
	  String company;
	  String model;
	  static int type;                                  // static bcoz taken for comparision
	static                                                     //implementation of static block
	{
		System.out.println("you have selected 2 Wheeler");
	    System.out.println("Please select type from below:");
	    System.out.println("Press [1] for bike");
	    System.out.println("Press [2] for Scooty");
	}
	public String toString()                                                   //implementation of toString method
	{ System.out.println("1:"+colour_1);
	 System.out.println("2:"+colour_2);
	 System.out.println("3:"+colour_3);
	 System.out.println("4:"+colour_4);
	 return"";
	}
	public static void out_two_wheeler()                       //static method
	{  Two_wheeler ref= new Two_wheeler(); 
	   bike b= new bike ();
	   Scooty s=new Scooty();
	   Scanner sc= new Scanner(System.in);
	    type= sc.nextInt();
	     if (type == 1)
	    {
	    System.out.println("you have selected:bike");
	    b.select_bike_brand();
	    }
	    else if (type == 2)
	    {
	    System.out.println("you have selected:scooty");
	    s.select_scooty_brand();
	    }
	    else 
	    {
			 System.out.println("XXXXXXX--No data found--XXXXXXX");
	          System.out.println("Please select between below:");
	         System.out.println("Press [1] for bike");
	         System.out.println("Press [2] for Scooty");
	         out_two_wheeler();
	      
	    } 
	}
	}
	class bike extends Two_wheeler                                   //single level inheritance
	{
	int gears;
    String braking_system;
	double tyre_size;
	public int select_bike_brand()
	{   
		System.out.println("you have selected bike");
	    System.out.println("Please select type from below:");
	    System.out.println("Press [1] for Yamaha");
	    System.out.println("Press [2] for KTM");
	    Scanner sc= new Scanner(System.in);
	    int type= sc.nextInt();
	    if (type == 1)
	    {
	    System.out.println("you have selected:Yamaha");
	    Yamaha.model_description();
	    }
	    else if (type == 2)
	    {
	    System.out.println("you have selected:KTM");
	    Ktm.model_description();
	    }
	    else 
	    {
			 System.out.println("XXXXXX--No data found--XXXXXX");
	         select_bike_brand();
	    } 
	return type;
	}
	}
    class Yamaha extends bike                                                       // multi level inheritance
    { 
    	Yamaha()                                                                   //Parameterised Constuctor
    	{
    
    	}
    	Yamaha(double tyre_size)                                                  //Parameterised Constuctor
    	{this();
    	this.tyre_size=tyre_size;
    	}
    	Yamaha(int gears, int seat,double tyre_size)                              //Parameterised Constuctor
    	{this (tyre_size);                                                        // CONSTUCTOR CHAINING
    	this.gears=gears;
    	this.seat=seat;    	
    	}
    	
    	Yamaha(String model,String fuel_type,int gears,String braking_system,double tyre_size, int seat)       //Parameterised Constuctor
    	{this (gears,seat,tyre_size);
    	this.model=model;
    	this.braking_system=braking_system;
    	this.fuel_type=fuel_type;
    	this.tyre_size=tyre_size;
    	
    	}
    	public String toString()                                                   //implementation of toString method
    	{ System.out.println("MODEL NAME:"+model);
   	 System.out.println("FUEL TYPE:"+fuel_type);
   	 System.out.println("NO. OF GEARS:"+gears);
   	 System.out.println("BRAKES:"+braking_system);
   	 System.out.println("SIZE OF TYRE:"+tyre_size+"MM");
   	 System.out.println("NO. OF SEATS:"+seat);
    		return"";
    	}
    	
    	public static void model_description()
    	{
    	Yamaha model_1= new Yamaha ("MT15","PETROL",5,"WITHOUT ABS",431.8,2);    //CONSTUCTOR CALLING STATEMENT
    	Yamaha model_2= new Yamaha ("R15","PETROL",6,"WITH ABS",451.8,2);
    	Yamaha model_3= new Yamaha ("FZ25","PETROL",6,"WITH ABS",445.8,2);
    	System.out.println("===================================");
    	System.out.println("AVAILABLE MODELS:");
    	 System.out.println("MODEL NAME:"+model_1.model);
    	 System.out.println("---------------------------");
    	 System.out.println("MODEL NAME:"+model_2.model);
    	 System.out.println("---------------------------");
    	 System.out.println("MODEL NAME:"+model_3.model);
    	 System.out.println("---------------------------");
    	 System.out.println("PLEASE SELECT MODEL FROM BELOW TO SEE DETAILS:");
    	 System.out.println("PRESS [1] FOR MT15");
    	 System.out.println("PRESS [2] FOR R15");
    	 System.out.println("PRESS [3] FOR FZ25");
    	 Scanner sc =new Scanner(System.in);
    	 int i = sc.nextInt();
    	 if(i== 1)
    	 {
         System.out.println(model_1);                                     //use of toString method
    	 System.out.println("---------------------------");
    	 System.out.println("DO WANT TO SEE ANOTHER DETAILS:");
    	 System.out.println("ENTER 'YES'");
    	 System.out.println("ENTER 'NO'");
    	 String a = sc.next();
    	 if (a.equalsIgnoreCase("YES"))
    	 {
    		 model_description();
    	 }
    	 else
    	 {
    		 System.out.println("DO YOU WANT MAKE PAYMENT:");
    		 System.out.println("PRESS 1 FOR CONFIRMATION");
    		 System.out.println("PRESS 2 FOR CANCEL");
    		 Scanner pay= new Scanner(System.in);
    		 int enter = pay.nextInt();
    		 if(enter==1)
    		 {   System.out.println("<<<<<<<<<<<<<<>>>>>>>>>>>>>>");
    			 System.out.println("CHOOSE PAYMENT MODE:");
    			 System.out.println("PRESS 1 FOR (CASH PAYMENT)");
    			 System.out.println("PRESS 2 FOR (UPI ONLINE PAYMENT)");
    			 System.out.println("PRESS 3 FOR (EMI)");
    			 Scanner soc=new Scanner(System.in);
    			 int pay_mode = soc.nextInt();
    			 Selection S = new Selection();
    			 Payment p = S.new Payment();
    			 if(pay_mode==1)
    			 {
    			 System.out.println("MODEL NAME:"+model_1.model);
    			 System.out.println("///////////////////////////////////////////////////");
    				
    				 p.cash(80000,2000);
    			 }
    			 else if(pay_mode==2)
    			 {
    			 System.out.println("MODEL NAME:"+model_1.model);
    			 System.out.println("///////////////////////////////////////////////////");
    				 p.upi(80000,2000);
    			 }
    			 else if (pay_mode==3)
    			 {
    				 System.out.println("MODEL NAME:"+model_1.model);
        			 System.out.println("///////////////////////////////////////////////////");
        				 p.emi(80000,2000);
    			 }
    		 }
    		 else
    		 { 
    			 System.out.println("THANKS FOR VISITING US !!!!");
    		 }
    	 }
    	 }
    	 else if(i==2)
    	 {
    		 System.out.println(model_2);                                         //use of toString method
    	    	 System.out.println("---------------------------");
    	    	 System.out.println("DO WANT TO SEE ANOTHER DETAILS:");
    	    	 System.out.println("ENTER 'YES'");
    	    	 System.out.println("ENTER 'NO'");
    	    	 String a = sc.next();
    	    	 if (a.equalsIgnoreCase("YES"))
    	    	 {
    	    		 model_description();
    	    	 }
    	    	 else
    	    	 {
    	    		 System.out.println("DO YOU WANT MAKE PAYMENT:");
    	    		 System.out.println("PRESS 1 FOR CONFIRMATION");
    	    		 System.out.println("PRESS 2 FOR CANCEL");
    	    		 Scanner pay= new Scanner(System.in);
    	    		 int enter = pay.nextInt();
    	    		 if(enter==1)
    	    		 {   System.out.println("<<<<<<<<<<<<<<>>>>>>>>>>>>>>");
    	    			 System.out.println("CHOOSE PAYMENT MODE:");
    	    			 System.out.println("PRESS 1 FOR (CASH PAYMENT)");
    	    			 System.out.println("PRESS 2 FOR (UPI ONLINE PAYMENT)");
    	    			 System.out.println("PRESS 3 FOR (EMI)");
    	    			 Scanner soc=new Scanner(System.in);
    	    			 int pay_mode = soc.nextInt();
    	    			 Selection S = new Selection();
    	    			 Payment p = S.new Payment();
    	    			 if(pay_mode==1)
    	    			 {
    	    			 System.out.println("MODEL NAME:"+model_2.model);
    	    			 System.out.println("///////////////////////////////////////////////////");
    	    				
    	    				 p.cash(100000,2300);
    	    			 }
    	    			 else if(pay_mode==2)
    	    			 {
    	    			 System.out.println("MODEL NAME:"+model_2.model);
    	    			 System.out.println("///////////////////////////////////////////////////");
    	    				 p.upi(100000,2300);
    	    			 }
    	    			 else if (pay_mode==3)
    	    			 {
    	    				 System.out.println("MODEL NAME:"+model_2.model);
    	        			 System.out.println("///////////////////////////////////////////////////");
    	        				 p.emi(100000,2300);
    	    			 }
    	    		 }
    	    		 
    	    		 else
    	    		 { 
    	    			 System.out.println("THANKS FOR VISITING US !!!!");
    	    		 }
    	    	 }
    	 }
    	 else if (i==3)
    	 {
    		     System.out.println(model_3);                                 //use of toString method
    	    	 System.out.println("---------------------------");
    	    	 System.out.println("DO WANT TO SEE ANOTHER DETAILS:");
    	    	 System.out.println("ENTER 'YES'");
    	    	 System.out.println("ENTER 'NO'");
    	    	 String a = sc.next();
    	    	 if (a.equalsIgnoreCase("YES"))
    	    	 {
    	    		 model_description();
    	    	 }
    	    	 else
    	    	 {
    	    		 System.out.println("DO YOU WANT MAKE PAYMENT:");
    	    		 System.out.println("PRESS 1 FOR CONFIRMATION");
    	    		 System.out.println("PRESS 2 FOR CANCEL");
    	    		 Scanner pay= new Scanner(System.in);
    	    		 int enter = pay.nextInt();
    	    		 if(enter==1)
    	    		 {   System.out.println("<<<<<<<<<<<<<<>>>>>>>>>>>>>>");
    	    			 System.out.println("CHOOSE PAYMENT MODE:");
    	    			 System.out.println("PRESS 1 FOR (CASH PAYMENT)");
    	    			 System.out.println("PRESS 2 FOR (UPI ONLINE PAYMENT)");
    	    			 System.out.println("PRESS 3 FOR (EMI)");
    	    			 Scanner soc=new Scanner(System.in);
    	    			 int pay_mode = soc.nextInt();
    	    			 Selection S = new Selection();
    	    			 Payment p = S.new Payment();
    	    			 if(pay_mode==1)
    	    			 {
    	    			 System.out.println("MODEL NAME:"+model_3.model);
    	    			 System.out.println("///////////////////////////////////////////////////");
    	    				
    	    				 p.cash(75000,5600);
    	    			 }
    	    			 else if(pay_mode==2)
    	    			 {
    	    			 System.out.println("MODEL NAME:"+model_3.model);
    	    			 System.out.println("///////////////////////////////////////////////////");
    	    				 p.upi(75000,5600);
    	    			 }
    	    			 else if (pay_mode==3)
    	    			 {
    	    				 System.out.println("MODEL NAME:"+model_3.model);
    	        			 System.out.println("///////////////////////////////////////////////////");
    	        				 p.emi(75000,5600);
    	    			 }
    	    		 }
    	    		 
    	    		 else
    	    		 { 
    	    			 System.out.println("THANKS FOR VISITING US !!!!");
    	    		 }
    	    	 }
    	 }
    	 else 
    	 {
    		 System.out.println("************NO DATA FOUND*************"); 
    		 model_description();
    	 }
    	 System.gc();                                                             //Garbage collection method
    	}
    	
    }
    class Ktm extends bike                                                       // HIERARCHICAL level inheritance
    { 
    	Ktm()                                                                   //Parameterised Constuctor
    	{
    
    	}
    	Ktm(double tyre_size)                                                  //Parameterised Constuctor
    	{this();
    	this.tyre_size=tyre_size;
    	}
    	Ktm(int gears, int seat,double tyre_size)                              //Parameterised Constuctor
    	{this (tyre_size);                                                        // CONSTUCTOR CHAINING
    	this.gears=gears;
    	this.seat=seat;    	
    	}
    	
    	Ktm(String model,String fuel_type,int gears,String braking_system,double tyre_size, int seat)       //Parameterised Constuctor
    	{this (gears,seat,tyre_size);
    	this.model=model;
    	this.braking_system=braking_system;
    	this.fuel_type=fuel_type;
    	this.tyre_size=tyre_size;
    	}
    	public String toString()                                                   //implementation of toString method
    	{ System.out.println("MODEL NAME:"+model);
   	 System.out.println("FUEL TYPE:"+fuel_type);
   	 System.out.println("NO. OF GEARS:"+gears);
   	 System.out.println("BRAKES:"+braking_system);
   	 System.out.println("SIZE OF TYRE:"+tyre_size+"MM");
   	 System.out.println("NO. OF SEATS:"+seat);
    		return"";
    	}
    	
    	public static void model_description()
    	{
    		Ktm model_1= new Ktm ("DUKE150","PETROL",5,"WITHOUT ABS",422.8,2);    //CONSTUCTOR CALLING STATEMENT
    		Ktm model_2= new Ktm ("DUKE350","PETROL",6,"WITH ABS",435.5,2);
    		Ktm model_3= new Ktm ("RC200","PETROL",6,"WITH ABS",445.8,2);
    	System.out.println("===================================");
    	System.out.println("AVAILABLE MODELS:");
    	 System.out.println("MODEL NAME:"+model_1.model);
    	 System.out.println("---------------------------");
    	 System.out.println("MODEL NAME:"+model_2.model);
    	 System.out.println("---------------------------");
    	 System.out.println("MODEL NAME:"+model_3.model);
    	 System.out.println("---------------------------");
    	 System.out.println("PLEASE SELECT MODEL FROM BELOW TO SEE DETAILS:");
    	 System.out.println("PRESS [1] FOR DUKE150");
    	 System.out.println("PRESS [2] FOR DUKE350");
    	 System.out.println("PRESS [3] FOR RC200");
    	 Scanner sc =new Scanner(System.in);
    	 int i = sc.nextInt();
    	 if(i== 1)
    	 {
    		 System.out.println(model_1);
    	 System.out.println("---------------------------");
    	 System.out.println("DO WANT TO SEE ANOTHER DETAILS:");
    	 System.out.println("ENTER 'YES'");
    	 System.out.println("ENTER 'NO'");
    	 String a = sc.next();
    	 if (a.equalsIgnoreCase("YES"))
    	 {
    		 model_description();
    	 }
    	 else
    	 {
    		 System.out.println("DO YOU WANT MAKE PAYMENT:");
    		 System.out.println("PRESS 1 FOR CONFIRMATION");
    		 System.out.println("PRESS 2 FOR CANCEL");
    		 Scanner pay= new Scanner(System.in);
    		 int enter = pay.nextInt();
    		 if(enter==1)
    		 {   System.out.println("<<<<<<<<<<<<<<>>>>>>>>>>>>>>");
    			 System.out.println("CHOOSE PAYMENT MODE:");
    			 System.out.println("PRESS 1 FOR (CASH PAYMENT)");
    			 System.out.println("PRESS 2 FOR (UPI ONLINE PAYMENT)");
    			 System.out.println("PRESS 3 FOR (EMI)");
    			 Scanner soc=new Scanner(System.in);
    			 int pay_mode = soc.nextInt();
    			 Selection S = new Selection();
    			 Payment p = S.new Payment();
    			 if(pay_mode==1)
    			 {
    			 System.out.println("MODEL NAME:"+model_1.model);
    			 System.out.println("///////////////////////////////////////////////////");
    				
    				 p.cash(90000,1690);
    			 }
    			 else if(pay_mode==2)
    			 {
    			 System.out.println("MODEL NAME:"+model_1.model);
    			 System.out.println("///////////////////////////////////////////////////");
    				 p.upi(90000,1690);
    			 }
    			 else if (pay_mode==3)
    			 {
    				 System.out.println("MODEL NAME:"+model_1.model);
        			 System.out.println("///////////////////////////////////////////////////");
        				 p.emi(90000,1690);
    			 }
    		 }
    		 else
    		 { 
    			 System.out.println("THANKS FOR VISITING US !!!!");
    		 }
    	 }
    	 }
    	 else if(i==2)
    	 {
    		 System.out.println(model_2);
    	    	 System.out.println("---------------------------");
    	    	 System.out.println("DO WANT TO SEE ANOTHER DETAILS:");
    	    	 System.out.println("ENTER 'YES'");
    	    	 System.out.println("ENTER 'NO'");
    	    	 String a = sc.next();
    	    	 if (a.equalsIgnoreCase("YES"))
    	    	 {
    	    		 model_description();
    	    	 }
    	    	 else
    	    	 {
    	    		 System.out.println("DO YOU WANT MAKE PAYMENT:");
    	    		 System.out.println("PRESS 1 FOR CONFIRMATION");
    	    		 System.out.println("PRESS 2 FOR CANCEL");
    	    		 Scanner pay= new Scanner(System.in);
    	    		 int enter = pay.nextInt();
    	    		 if(enter==1)
    	    		 {   System.out.println("<<<<<<<<<<<<<<>>>>>>>>>>>>>>");
    	    			 System.out.println("CHOOSE PAYMENT MODE:");
    	    			 System.out.println("PRESS 1 FOR (CASH PAYMENT)");
    	    			 System.out.println("PRESS 2 FOR (UPI ONLINE PAYMENT)");
    	    			 System.out.println("PRESS 3 FOR (EMI)");
    	    			 Scanner soc=new Scanner(System.in);
    	    			 int pay_mode = soc.nextInt();
    	    			 Selection S = new Selection();
    	    			 Payment p = S.new Payment();
    	    			 if(pay_mode==1)
    	    			 {
    	    			 System.out.println("MODEL NAME:"+model_2.model);
    	    			 System.out.println("///////////////////////////////////////////////////");
    	    				
    	    				 p.cash(150000,300);
    	    			 }
    	    			 else if(pay_mode==2)
    	    			 {
    	    			 System.out.println("MODEL NAME:"+model_2.model);
    	    			 System.out.println("///////////////////////////////////////////////////");
    	    				 p.upi(150000,300);
    	    			 }
    	    			 else if (pay_mode==3)
    	    			 {
    	    				 System.out.println("MODEL NAME:"+model_2.model);
    	        			 System.out.println("///////////////////////////////////////////////////");
    	        				 p.emi(150000,300);
    	    			 }
    	    		 }
    	    		 
    	    		 else
    	    		 { 
    	    			 System.out.println("THANKS FOR VISITING US !!!!");
    	    		 }
    	    	 }
    	 }
    	 else if (i==3)
    	 {
    		 System.out.println(model_3);
    	    	 System.out.println("---------------------------");
    	    	 System.out.println("DO WANT TO SEE ANOTHER DETAILS:");
    	    	 System.out.println("ENTER 'YES'");
    	    	 System.out.println("ENTER 'NO'");
    	    	 String a = sc.next();
    	    	 if (a.equalsIgnoreCase("YES"))
    	    	 {
    	    		 model_description();
    	    	 }
    	    	 else
    	    	 {
    	    		 System.out.println("DO YOU WANT MAKE PAYMENT:");
    	    		 System.out.println("PRESS 1 FOR CONFIRMATION");
    	    		 System.out.println("PRESS 2 FOR CANCEL");
    	    		 Scanner pay= new Scanner(System.in);
    	    		 int enter = pay.nextInt();
    	    		 if(enter==1)
    	    		 {   System.out.println("<<<<<<<<<<<<<<>>>>>>>>>>>>>>");
    	    			 System.out.println("CHOOSE PAYMENT MODE:");
    	    			 System.out.println("PRESS 1 FOR (CASH PAYMENT)");
    	    			 System.out.println("PRESS 2 FOR (UPI ONLINE PAYMENT)");
    	    			 System.out.println("PRESS 3 FOR (EMI)");
    	    			 Scanner soc=new Scanner(System.in);
    	    			 int pay_mode = soc.nextInt();
    	    			 Selection S = new Selection();
    	    			 Payment p = S.new Payment();
    	    			 if(pay_mode==1)
    	    			 {
    	    			 System.out.println("MODEL NAME:"+model_3.model);
    	    			 System.out.println("///////////////////////////////////////////////////");
    	    				
    	    				 p.cash(120000,600);
    	    			 }
    	    			 else if(pay_mode==2)
    	    			 {
    	    			 System.out.println("MODEL NAME:"+model_3.model);
    	    			 System.out.println("///////////////////////////////////////////////////");
    	    				 p.upi(120000,600);
    	    			 }
    	    			 else if (pay_mode==3)
    	    			 {
    	    				 System.out.println("MODEL NAME:"+model_3.model);
    	        			 System.out.println("///////////////////////////////////////////////////");
    	        				 p.emi(120000,600);
    	    			 }
    	    		 }
    	    		 
    	    		 else
    	    		 { 
    	    			 System.out.println("THANKS FOR VISITING US !!!!");
    	    		 }
    	    	 }
    	 }
    	 else 
    	 {
    		 System.out.println("************NO DATA FOUND*************"); 
    		 model_description(); 
    	 }
    	 
     	 System.gc();                                                             //Garbage collection method
    	}
    }
	class Scooty extends Two_wheeler                                   //HIERARCHICAL level inheritance
	{
	int gears;
    String braking_system;
	double tyre_size;
	public int select_scooty_brand()
	{   
		System.out.println("you have selected bike");
	    System.out.println("Please select type from below:");
	    System.out.println("Press [1] for HONDA");
	    System.out.println("Press [2] for TVS");
	    Scanner sc= new Scanner(System.in);
	    int type= sc.nextInt();
	    if (type == 1)
	    {
	    System.out.println("you have selected:Honda");
	    Honda.model_description();
	    }
	    else if (type == 2)
	    {
	    System.out.println("you have selected:TVS");
	    Tvs.model_description();
	    }
	    else 
	    {
			 System.out.println("XXXXXX--No data found--XXXXXX");
	         select_scooty_brand();
	    } 
	return type;
	}
	}
    class Honda extends bike                                                       // multi level inheritance
    { 
    	Honda()                                                                   //Parameterised Constuctor
    	{
    
    	}
    	Honda(double tyre_size)                                                  //Parameterised Constuctor
    	{this();
    	this.tyre_size=tyre_size;
    	}
    	Honda(int gears, int seat,double tyre_size)                              //Parameterised Constuctor
    	{this (tyre_size);                                                        // CONSTUCTOR CHAINING
    	this.gears=gears;
    	this.seat=seat;    	
    	}
    	
    	Honda(String model,String fuel_type,int gears,String braking_system,double tyre_size, int seat)       //Parameterised Constuctor
    	{this (gears,seat,tyre_size);
    	this.model=model;
    	this.braking_system=braking_system;
    	this.fuel_type=fuel_type;
    	this.tyre_size=tyre_size;
    	
    	}
    	public String toString()                                                   //implementation of toString method
    	{ System.out.println("MODEL NAME:"+model);
   	 System.out.println("FUEL TYPE:"+fuel_type);
   	 System.out.println("ENGINE CAPACITY:"+gears+"CC");
   	 System.out.println("BRAKES:"+braking_system);
   	 System.out.println("SIZE OF TYRE:"+tyre_size+"MM");
   	 System.out.println("NO. OF SEATS:"+seat);
    		return"";
    	}
    	
    	public static void model_description()
    	{
    	Honda model_1= new Honda ("ACTIVA 6G","PETROL",110,"WITHOUT ABS",230.8,2);    //CONSTUCTOR CALLING STATEMENT
    	Honda model_2= new Honda ("GRAZIA","PETROL",115,"WITH ABS",250.8,2);
    	Honda model_3= new Honda ("DIO","PETROL",125,"WITHOUT ABS",249.8,2);
    	System.out.println("===================================");
    	System.out.println("AVAILABLE MODELS:");
    	 System.out.println("MODEL NAME:"+model_1.model);
    	 System.out.println("---------------------------");
    	 System.out.println("MODEL NAME:"+model_2.model);
    	 System.out.println("---------------------------");
    	 System.out.println("MODEL NAME:"+model_3.model);
    	 System.out.println("---------------------------");
    	 System.out.println("PLEASE SELECT MODEL FROM BELOW TO SEE DETAILS:");
    	 System.out.println("PRESS [1] FOR ACTIVA 6G");
    	 System.out.println("PRESS [2] FOR GRAZIA");
    	 System.out.println("PRESS [3] FOR DIO");
    	 Scanner sc =new Scanner(System.in);
    	 int i = sc.nextInt();
    	 if(i== 1)
    	 {
         System.out.println(model_1);                                     //use of toString method
    	 System.out.println("---------------------------");
    	 System.out.println("DO WANT TO SEE ANOTHER DETAILS:");
    	 System.out.println("ENTER 'YES'");
    	 System.out.println("ENTER 'NO'");
    	 String a = sc.next();
    	 if (a.equalsIgnoreCase("YES"))
    	 {
    		 model_description();
    	 }
    	 else
    	 {
    		 System.out.println("DO YOU WANT MAKE PAYMENT:");
    		 System.out.println("PRESS 1 FOR CONFIRMATION");
    		 System.out.println("PRESS 2 FOR CANCEL");
    		 Scanner pay= new Scanner(System.in);
    		 int enter = pay.nextInt();
    		 if(enter==1)
    		 {   System.out.println("<<<<<<<<<<<<<<>>>>>>>>>>>>>>");
    			 System.out.println("CHOOSE PAYMENT MODE:");
    			 System.out.println("PRESS 1 FOR (CASH PAYMENT)");
    			 System.out.println("PRESS 2 FOR (UPI ONLINE PAYMENT)");
    			 System.out.println("PRESS 3 FOR (EMI)");
    			 Scanner soc=new Scanner(System.in);
    			 int pay_mode = soc.nextInt();
    			 Selection S = new Selection();
    			 Payment p = S.new Payment();
    			 if(pay_mode==1)
    			 {
    			 System.out.println("MODEL NAME:"+model_1.model);
    			 System.out.println("///////////////////////////////////////////////////");
    				
    				 p.cash(70000,1100);
    			 }
    			 else if(pay_mode==2)
    			 {
    			 System.out.println("MODEL NAME:"+model_1.model);
    			 System.out.println("///////////////////////////////////////////////////");
    				 p.upi(70000,1100);
    			 }
    			 else if (pay_mode==3)
    			 {
    				 System.out.println("MODEL NAME:"+model_1.model);
        			 System.out.println("///////////////////////////////////////////////////");
        				 p.emi(70000,1100);
    			 }
    		 }
    		 else
    		 { 
    			 System.out.println("THANKS FOR VISITING US !!!!");
    		 }
    	 }
    	 }
    	 else if(i==2)
    	 {
    		 System.out.println(model_2);                                         //use of toString method
    	    	 System.out.println("---------------------------");
    	    	 System.out.println("DO WANT TO SEE ANOTHER DETAILS:");
    	    	 System.out.println("ENTER 'YES'");
    	    	 System.out.println("ENTER 'NO'");
    	    	 String a = sc.next();
    	    	 if (a.equalsIgnoreCase("YES"))
    	    	 {
    	    		 model_description();
    	    	 }
    	    	 else
    	    	 {
    	    		 System.out.println("DO YOU WANT MAKE PAYMENT:");
    	    		 System.out.println("PRESS 1 FOR CONFIRMATION");
    	    		 System.out.println("PRESS 2 FOR CANCEL");
    	    		 Scanner pay= new Scanner(System.in);
    	    		 int enter = pay.nextInt();
    	    		 if(enter==1)
    	    		 {   System.out.println("<<<<<<<<<<<<<<>>>>>>>>>>>>>>");
    	    			 System.out.println("CHOOSE PAYMENT MODE:");
    	    			 System.out.println("PRESS 1 FOR (CASH PAYMENT)");
    	    			 System.out.println("PRESS 2 FOR (UPI ONLINE PAYMENT)");
    	    			 System.out.println("PRESS 3 FOR (EMI)");
    	    			 Scanner soc=new Scanner(System.in);
    	    			 int pay_mode = soc.nextInt();
    	    			 Selection S = new Selection();
    	    			 Payment p = S.new Payment();
    	    			 if(pay_mode==1)
    	    			 {
    	    			 System.out.println("MODEL NAME:"+model_2.model);
    	    			 System.out.println("///////////////////////////////////////////////////");
    	    				
    	    				 p.cash(100000,1300);
    	    			 }
    	    			 else if(pay_mode==2)
    	    			 {
    	    			 System.out.println("MODEL NAME:"+model_2.model);
    	    			 System.out.println("///////////////////////////////////////////////////");
    	    				 p.upi(100000,1300);
    	    			 }
    	    			 else if (pay_mode==3)
    	    			 {
    	    				 System.out.println("MODEL NAME:"+model_2.model);
    	        			 System.out.println("///////////////////////////////////////////////////");
    	        				 p.emi(100000,1300);
    	    			 }
    	    		 }
    	    		 
    	    		 else
    	    		 { 
    	    			 System.out.println("THANKS FOR VISITING US !!!!");
    	    		 }
    	    	 }
    	 }
    	 else if (i==3)
    	 {
    		     System.out.println(model_3);                            
    	    	 System.out.println("---------------------------");
    	    	 System.out.println("DO WANT TO SEE ANOTHER DETAILS:");
    	    	 System.out.println("ENTER 'YES'");
    	    	 System.out.println("ENTER 'NO'");
    	    	 String a = sc.next();
    	    	 if (a.equalsIgnoreCase("YES"))
    	    	 {
    	    		 model_description();
    	    	 }
    	    	 else
    	    	 {
    	    		 System.out.println("DO YOU WANT MAKE PAYMENT:");
    	    		 System.out.println("PRESS 1 FOR CONFIRMATION");
    	    		 System.out.println("PRESS 2 FOR CANCEL");
    	    		 Scanner pay= new Scanner(System.in);
    	    		 int enter = pay.nextInt();
    	    		 if(enter==1)
    	    		 {   System.out.println("<<<<<<<<<<<<<<>>>>>>>>>>>>>>");
    	    			 System.out.println("CHOOSE PAYMENT MODE:");
    	    			 System.out.println("PRESS 1 FOR (CASH PAYMENT)");
    	    			 System.out.println("PRESS 2 FOR (UPI ONLINE PAYMENT)");
    	    			 System.out.println("PRESS 3 FOR (EMI)");
    	    			 Scanner soc=new Scanner(System.in);
    	    			 int pay_mode = soc.nextInt();
    	    			 Selection S = new Selection();
    	    			 Payment p = S.new Payment();
    	    			 if(pay_mode==1)
    	    			 {
    	    			 System.out.println("MODEL NAME:"+model_3.model);
    	    			 System.out.println("///////////////////////////////////////////////////");
    	    				
    	    				 p.cash(85000,5600);
    	    			 }
    	    			 else if(pay_mode==2)
    	    			 {
    	    			 System.out.println("MODEL NAME:"+model_3.model);
    	    			 System.out.println("///////////////////////////////////////////////////");
    	    				 p.upi(85000,5600);
    	    			 }
    	    			 else if (pay_mode==3)
    	    			 {
    	    				 System.out.println("MODEL NAME:"+model_3.model);
    	        			 System.out.println("///////////////////////////////////////////////////");
    	        				 p.emi(85000,5600);
    	    			 }
    	    		 }
    	    		 
    	    		 else
    	    		 { 
    	    			 System.out.println("THANKS FOR VISITING US !!!!");
    	    		 }
    	    	 }
    	 }
    	 else 
    	 {
    		 System.out.println("************NO DATA FOUND*************"); 
    		 model_description();
    	 }
    	 System.gc();                                                             //Garbage collection method
    	}
    	
    }
    class Tvs extends Scooty                                                       // HIERARCHICAL level inheritance
    { 
    	Tvs()                                                                   //Parameterised Constuctor
    	{
    
    	}
    	Tvs(double tyre_size)                                                  //Parameterised Constuctor
    	{this();
    	this.tyre_size=tyre_size;
    	}
    	Tvs(int gears, int seat,double tyre_size)                              //Parameterised Constuctor
    	{this (tyre_size);                                                        // CONSTUCTOR CHAINING
    	this.gears=gears;
    	this.seat=seat;    	
    	}
    	
    	Tvs(String model,String fuel_type,int gears,String braking_system,double tyre_size, int seat)       //Parameterised Constuctor
    	{this (gears,seat,tyre_size);
    	this.model=model;
    	this.braking_system=braking_system;
    	this.fuel_type=fuel_type;
    	this.tyre_size=tyre_size;
    	}
    	public String toString()                                                   //implementation of toString method
    	{ System.out.println("MODEL NAME:"+model);
   	 System.out.println("FUEL TYPE:"+fuel_type);
   	 System.out.println("Engine Capacity:"+gears+"cc");
   	 System.out.println("BRAKES:"+braking_system);
   	 System.out.println("SIZE OF TYRE:"+tyre_size+"MM");
   	 System.out.println("NO. OF SEATS:"+seat);
    		return"";
    	}
    	
    	public static void model_description()
    	{
    		Tvs model_1= new Tvs ("Jupiter","PETROL",125,"WITHOUT ABS",222.8,2);  //SUB CONSTUCTOR CALLING STATEMENT
       		Tvs model_2= new Tvs ("Zest","PETROL",125,"WITH ABS",205.5,2);
    		Tvs model_3= new Tvs ("pep plus","PETROL",110,"WITHOUT ABS",245.8,2);
    	System.out.println("===================================");
    	System.out.println("AVAILABLE MODELS:");
    	 System.out.println("MODEL NAME:"+model_1.model);
    	 System.out.println("---------------------------");
    	 System.out.println("MODEL NAME:"+model_2.model);
    	 System.out.println("---------------------------");
    	 System.out.println("MODEL NAME:"+model_3.model);
    	 System.out.println("---------------------------");
    	 System.out.println("PLEASE SELECT MODEL FROM BELOW TO SEE DETAILS:");
    	 System.out.println("PRESS [1] FOR Jupiter");
    	 System.out.println("PRESS [2] FOR Zest");
    	 System.out.println("PRESS [3] FOR pep plus");
    	 Scanner sc =new Scanner(System.in);
    	 int i = sc.nextInt();
    	 if(i== 1)
    	 {
    		 System.out.println(model_1);
    	 System.out.println("---------------------------");
    	 System.out.println("DO WANT TO SEE ANOTHER DETAILS:");
    	 System.out.println("ENTER 'YES'");
    	 System.out.println("ENTER 'NO'");
    	 String a = sc.next();
    	 if (a.equalsIgnoreCase("YES"))
    	 {
    		 model_description();
    	 }
    	 else
    	 {
    		 System.out.println("DO YOU WANT MAKE PAYMENT:");
    		 System.out.println("PRESS 1 FOR CONFIRMATION");
    		 System.out.println("PRESS 2 FOR CANCEL");
    		 Scanner pay= new Scanner(System.in);
    		 int enter = pay.nextInt();
    		 if(enter==1)
    		 {   System.out.println("<<<<<<<<<<<<<<>>>>>>>>>>>>>>");
    			 System.out.println("CHOOSE PAYMENT MODE:");
    			 System.out.println("PRESS 1 FOR (CASH PAYMENT)");
    			 System.out.println("PRESS 2 FOR (UPI ONLINE PAYMENT)");
    			 System.out.println("PRESS 3 FOR (EMI)");
    			 Scanner soc=new Scanner(System.in);
    			 int pay_mode = soc.nextInt();
    			 Selection S = new Selection();
    			 Payment p = S.new Payment();
    			 if(pay_mode==1)
    			 {
    			 System.out.println("MODEL NAME:"+model_1.model);
    			 System.out.println("///////////////////////////////////////////////////");
    				
    				 p.cash(90000,1990);
    			 }
    			 else if(pay_mode==2)
    			 {
    			 System.out.println("MODEL NAME:"+model_1.model);
    			 System.out.println("///////////////////////////////////////////////////");
    				 p.upi(90000,1990);
    			 }
    			 else if (pay_mode==3)
    			 {
    				 System.out.println("MODEL NAME:"+model_1.model);
        			 System.out.println("///////////////////////////////////////////////////");
        				 p.emi(90000,1990);
    			 }
    		 }
    		 else
    		 { 
    			 System.out.println("THANKS FOR VISITING US !!!!");
    		 }
    	 }
    	 }
    	 else if(i==2)
    	 {
    		 System.out.println(model_2);
    	    	 System.out.println("---------------------------");
    	    	 System.out.println("DO WANT TO SEE ANOTHER DETAILS:");
    	    	 System.out.println("ENTER 'YES'");
    	    	 System.out.println("ENTER 'NO'");
    	    	 String a = sc.next();
    	    	 if (a.equalsIgnoreCase("YES"))
    	    	 {
    	    		 model_description();
    	    	 }
    	    	 else
    	    	 {
    	    		 System.out.println("DO YOU WANT MAKE PAYMENT:");
    	    		 System.out.println("PRESS 1 FOR CONFIRMATION");
    	    		 System.out.println("PRESS 2 FOR CANCEL");
    	    		 Scanner pay= new Scanner(System.in);
    	    		 int enter = pay.nextInt();
    	    		 if(enter==1)
    	    		 {   System.out.println("<<<<<<<<<<<<<<>>>>>>>>>>>>>>");
    	    			 System.out.println("CHOOSE PAYMENT MODE:");
    	    			 System.out.println("PRESS 1 FOR (CASH PAYMENT)");
    	    			 System.out.println("PRESS 2 FOR (UPI ONLINE PAYMENT)");
    	    			 System.out.println("PRESS 3 FOR (EMI)");
    	    			 Scanner soc=new Scanner(System.in);
    	    			 int pay_mode = soc.nextInt();
    	    			 Selection S = new Selection();
    	    			 Payment p = S.new Payment();
    	    			 if(pay_mode==1)
    	    			 {
    	    			 System.out.println("MODEL NAME:"+model_2.model);
    	    			 System.out.println("///////////////////////////////////////////////////");
    	    				
    	    				 p.cash(50000,5300);
    	    			 }
    	    			 else if(pay_mode==2)
    	    			 {
    	    			 System.out.println("MODEL NAME:"+model_2.model);
    	    			 System.out.println("///////////////////////////////////////////////////");
    	    				 p.upi(50000,5300);
    	    			 }
    	    			 else if (pay_mode==3)
    	    			 {
    	    				 System.out.println("MODEL NAME:"+model_2.model);
    	        			 System.out.println("///////////////////////////////////////////////////");
    	        				 p.emi(50000,5300);
    	    			 }
    	    		 }
    	    		 
    	    		 else
    	    		 { 
    	    			 System.out.println("THANKS FOR VISITING US !!!!");
    	    		 }
    	    	 }
    	 }
    	 else if (i==3)
    	 {
    		 System.out.println(model_3);
    	    	 System.out.println("---------------------------");
    	    	 System.out.println("DO WANT TO SEE ANOTHER DETAILS:");
    	    	 System.out.println("ENTER 'YES'");
    	    	 System.out.println("ENTER 'NO'");
    	    	 String a = sc.next();
    	    	 if (a.equalsIgnoreCase("YES"))
    	    	 {
    	    		 model_description();
    	    	 }
    	    	 else
    	    	 {
    	    		 System.out.println("DO YOU WANT MAKE PAYMENT:");
    	    		 System.out.println("PRESS 1 FOR CONFIRMATION");
    	    		 System.out.println("PRESS 2 FOR CANCEL");
    	    		 Scanner pay= new Scanner(System.in);
    	    		 int enter = pay.nextInt();
    	    		 if(enter==1)
    	    		 {   System.out.println("<<<<<<<<<<<<<<>>>>>>>>>>>>>>");
    	    			 System.out.println("CHOOSE PAYMENT MODE:");
    	    			 System.out.println("PRESS 1 FOR (CASH PAYMENT)");
    	    			 System.out.println("PRESS 2 FOR (UPI ONLINE PAYMENT)");
    	    			 System.out.println("PRESS 3 FOR (EMI)");
    	    			 Scanner soc=new Scanner(System.in);
    	    			 int pay_mode = soc.nextInt();
    	    			 Selection S = new Selection();
    	    			 Payment p = S.new Payment();
    	    			 if(pay_mode==1)
    	    			 {
    	    			 System.out.println("MODEL NAME:"+model_3.model);
    	    			 System.out.println("///////////////////////////////////////////////////");
    	    				
    	    				 p.cash(120000,1600);
    	    			 }
    	    			 else if(pay_mode==2)
    	    			 {
    	    			 System.out.println("MODEL NAME:"+model_3.model);
    	    			 System.out.println("///////////////////////////////////////////////////");
    	    				 p.upi(120000,1600);
    	    			 }
    	    			 else if (pay_mode==3)
    	    			 {
    	    				 System.out.println("MODEL NAME:"+model_3.model);
    	        			 System.out.println("///////////////////////////////////////////////////");
    	        				 p.emi(120000,1600);
    	    			 }
    	    		 }
    	    		 
    	    		 else
    	    		 { 
    	    			 System.out.println("THANKS FOR VISITING US !!!!");
    	    		 }
    	    	 }
    	 }
    	 else 
    	 {
    		 System.out.println("************NO DATA FOUND*************"); 
    		 model_description(); 
    	 }
     	 System.gc();                                                             //Garbage collection method
    	}
    }



