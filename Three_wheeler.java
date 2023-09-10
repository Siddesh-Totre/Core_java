package auto;

import java.util.Scanner;

import auto.Selection.Payment;

public class Three_wheeler {
	  int seat;                                       // non static var for changing data acc to model
	  String fuel_type;
	  String company;
	  String model;
	  static int type;                                  // static bcoz taken for comparision
	static                                                     //implementation of static block
	{
		System.out.println("you have selected 3 Wheeler");
	    System.out.println("Please select type from below:");
	    System.out.println("Press [1] for Auto");
	    System.out.println("Press [2] for Ape");
	}
	public static void out_three_wheeler()                       //static method
	{  Three_wheeler ref= new Three_wheeler(); 
	    Auto b= new Auto ();
	    Ape a=new Ape();
	   Scanner sc= new Scanner(System.in);
	    type= sc.nextInt();
	     if (type == 1)
	    {
	    System.out.println("you have selected:Auto");
	    b.select_auto_brand();
	    }
	    else if (type == 2)
	    {
	    System.out.println("you have selected:Ape");
	    Ape.model_description();
	    }
	    else 
	    {
			 System.out.println("XXXXXXX--No data found--XXXXXXX");
	          System.out.println("Please select between below:");
	         System.out.println("Press [1] for Auto");
	         System.out.println("Press [2] for Ape");
	         out_three_wheeler();
	      
	    } 
	}
	}
	class Auto extends Three_wheeler                                   //single level inheritance
	{
	int gears;
    String braking_system;                                 //here it is used for capacity size
	double tyre_size;
	public int select_auto_brand()
	{   
		System.out.println("you have selected Auto_RICKSHAW");
	    System.out.println("Please select type from below:");
	    System.out.println("Press [1] for Bajaj");
	    System.out.println("Press [2] for Mahendra&Mahendra");
	    Scanner sc= new Scanner(System.in);
	    int type= sc.nextInt();
	    if (type == 1)
	    {
	    System.out.println("you have selected:Bajaj");
	    Bajaj.model_description();
	    }
	    else if (type == 2)
	    {
	    System.out.println("you have selected:Mahendra&Mahendra");
	    Mahendra_Mahendra.model_description();
	    }
	    else 
	    {
			 System.out.println("XXXXXX--No data found--XXXXXX");
	         select_auto_brand();
	    } 
	return type;
	}
	}
    class Bajaj extends Auto                                                       // multi level inheritance
    { 
    	Bajaj()                                                                   //Parameterised Constuctor
    	{
    
    	}
    	Bajaj(double tyre_size)                                                  //Parameterised Constuctor
    	{this();
    	this.tyre_size=tyre_size;
    	}
    	Bajaj(int gears, int seat,double tyre_size)                              //Parameterised Constuctor
    	{this (tyre_size);                                                        // CONSTUCTOR CHAINING
    	this.gears=gears;
    	this.seat=seat;    	
    	}
    	
    	Bajaj(String model,String fuel_type,int gears,String braking_system,double tyre_size, int seat)       //Parameterised Constuctor
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
   	 System.out.println("CAPACITY:"+braking_system+"kg");
   	 System.out.println("SIZE OF TYRE:"+tyre_size+"MM");
   	 System.out.println("NO. OF SEATS:"+seat);
    		return"";
    	}
    	
    	public static void model_description()
    	{
    	Bajaj model_1= new Bajaj ("Compact RE BS6","CNG",4,"445",231.8,3);    //CONSTUCTOR CALLING STATEMENT
    	Bajaj model_2= new Bajaj ("Compact RE BS5","PETROL+CNG",4,"455",251.8,3);
    	Bajaj model_3= new Bajaj ("Compact RA BS6","PETROL",5,"450",245.8,4);
    	System.out.println("===================================");
    	System.out.println("AVAILABLE MODELS:");
    	 System.out.println("MODEL NAME:"+model_1.model);
    	 System.out.println("---------------------------");
    	 System.out.println("MODEL NAME:"+model_2.model);
    	 System.out.println("---------------------------");
    	 System.out.println("MODEL NAME:"+model_3.model);
    	 System.out.println("---------------------------");
    	 System.out.println("PLEASE SELECT MODEL FROM BELOW TO SEE DETAILS:");
    	 System.out.println("PRESS [1] FOR Compact RE BS6");
    	 System.out.println("PRESS [2] FOR Compact RE BS5");
    	 System.out.println("PRESS [3] FOR Compact RA BS6");
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
    				
    				 p.cash(150000,1480);
    			 }
    			 else if(pay_mode==2)
    			 {
    			 System.out.println("MODEL NAME:"+model_1.model);
    			 System.out.println("///////////////////////////////////////////////////");
    				 p.upi(150000,1480);
    			 }
    			 else if (pay_mode==3)
    			 {
    				 System.out.println("MODEL NAME:"+model_1.model);
        			 System.out.println("///////////////////////////////////////////////////");
        				 p.emi(150000,1480);
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
    	    				
    	    				 p.cash(1350000,3560);
    	    			 }
    	    			 else if(pay_mode==2)
    	    			 {
    	    			 System.out.println("MODEL NAME:"+model_2.model);
    	    			 System.out.println("///////////////////////////////////////////////////");
    	    				 p.upi(1350000,3560);
    	    			 }
    	    			 else if (pay_mode==3)
    	    			 {
    	    				 System.out.println("MODEL NAME:"+model_2.model);
    	        			 System.out.println("///////////////////////////////////////////////////");
    	        				 p.emi(1350000,3560);
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
    	    				
    	    				 p.cash(1550000,590);
    	    			 }
    	    			 else if(pay_mode==2)
    	    			 {
    	    			 System.out.println("MODEL NAME:"+model_3.model);
    	    			 System.out.println("///////////////////////////////////////////////////");
    	    				 p.upi(1550000,590);
    	    			 }
    	    			 else if (pay_mode==3)
    	    			 {
    	    				 System.out.println("MODEL NAME:"+model_3.model);
    	        			 System.out.println("///////////////////////////////////////////////////");
    	        				 p.emi(1550000,590);
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
    class Mahendra_Mahendra extends Auto                                                       // HIERARCHICAL level inheritance
    { 
    	Mahendra_Mahendra()                                                                   //Parameterised Constuctor
    	{
    
    	}
    	Mahendra_Mahendra(double tyre_size)                                                  //Parameterised Constuctor
    	{this();
    	this.tyre_size=tyre_size;
    	}
    	Mahendra_Mahendra(int gears, int seat,double tyre_size)                              //Parameterised Constuctor
    	{this (tyre_size);                                                        // CONSTUCTOR CHAINING
    	this.gears=gears;
    	this.seat=seat;    	
    	}
    	
    	Mahendra_Mahendra(String model,String fuel_type,int gears,String braking_system,double tyre_size, int seat)       //Parameterised Constuctor
    	{this (gears,seat,tyre_size);
    	this.model=model;
    	this.braking_system=braking_system;
    	this.fuel_type=fuel_type;
    	this.tyre_size=tyre_size;
    	}
    	public String toString()                                                   //implementation of toString method
    	{ System.out.println("MODEL NAME:"+model);
   	 System.out.println("FUEL TYPE:"+fuel_type);
   	 System.out.println("BATTERY CAPACITY:"+gears+"HOURS ON FULL CHARGE");
   	 System.out.println("CAPACITY:"+braking_system+"kg");
   	 System.out.println("SIZE OF TYRE:"+tyre_size+"MM");
   	 System.out.println("NO. OF SEATS:"+seat);
    		return"";
    	}
    	
    	public static void model_description()
    	{
    		Mahendra_Mahendra model_1= new Mahendra_Mahendra ("E-Alfa","ELECTRIC",5,"400",422.8,3);    //CONSTUCTOR CALLING STATEMENT
    		Mahendra_Mahendra model_2= new Mahendra_Mahendra ("DIE","ELECTRIC",6,"500",435.5,3);
    		Mahendra_Mahendra model_3= new Mahendra_Mahendra ("TREO","ELECTRIC",4,"550",445.8,3);
    	System.out.println("===================================");
    	System.out.println("AVAILABLE MODELS:");
    	 System.out.println("MODEL NAME:"+model_1.model);
    	 System.out.println("---------------------------");
    	 System.out.println("MODEL NAME:"+model_2.model);
    	 System.out.println("---------------------------");
    	 System.out.println("MODEL NAME:"+model_3.model);
    	 System.out.println("---------------------------");
    	 System.out.println("PLEASE SELECT MODEL FROM BELOW TO SEE DETAILS:");
    	 System.out.println("PRESS [1] FOR E-Alfa");
    	 System.out.println("PRESS [2] FOR DIE");
    	 System.out.println("PRESS [3] FOR TREO");
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
    				
    				 p.cash(95000,1990);
    			 }
    			 else if(pay_mode==2)
    			 {
    			 System.out.println("MODEL NAME:"+model_1.model);
    			 System.out.println("///////////////////////////////////////////////////");
    				 p.upi(95000,1990);
    			 }
    			 else if (pay_mode==3)
    			 {
    				 System.out.println("MODEL NAME:"+model_1.model);
        			 System.out.println("///////////////////////////////////////////////////");
        				 p.emi(95000,1990);
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
    	    				
    	    				 p.cash(105000,1270);
    	    			 }
    	    			 else if(pay_mode==2)
    	    			 {
    	    			 System.out.println("MODEL NAME:"+model_2.model);
    	    			 System.out.println("///////////////////////////////////////////////////");
    	    				 p.upi(105000,1270);
    	    			 }
    	    			 else if (pay_mode==3)
    	    			 {
    	    				 System.out.println("MODEL NAME:"+model_2.model);
    	        			 System.out.println("///////////////////////////////////////////////////");
    	        				 p.emi(105000,1270);
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
    	    				
    	    				 p.cash(97000,1387);
    	    			 }
    	    			 else if(pay_mode==2)
    	    			 {
    	    			 System.out.println("MODEL NAME:"+model_3.model);
    	    			 System.out.println("///////////////////////////////////////////////////");
    	    				 p.upi(97000,1387);
    	    			 }
    	    			 else if (pay_mode==3)
    	    			 {
    	    				 System.out.println("MODEL NAME:"+model_3.model);
    	        			 System.out.println("///////////////////////////////////////////////////");
    	        				 p.emi(97000,1387);
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
    class Ape extends Three_wheeler                                                       // multi level inheritance
    { 	int gears;
    String braking_system;                                 //here it is used for capacity size
	double tyre_size;
    	Ape()                                                                   //Parameterised Constuctor
    	{
    
    	}
    	Ape(double tyre_size)                                                  //Parameterised Constuctor
    	{this();
    	this.tyre_size=tyre_size;
    	}
    	Ape(int gears, int seat,double tyre_size)                              //Parameterised Constuctor
    	{this (tyre_size);                                                        // CONSTUCTOR CHAINING
    	this.gears=gears;
    	this.seat=seat;    	
    	}
    	
    	Ape(String model,String fuel_type,int gears,String braking_system,double tyre_size, int seat)       //Parameterised Constuctor
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
    	Ape model_1= new Ape ("PIAGGIO APE","DIESEL",350,"WITHOUT ABS",450.8,4);    //CONSTUCTOR CALLING STATEMENT
    	Ape model_2= new Ape ("BAJAJ APE","DIESEL",450,"WITH ABS",455.8,6);
    	System.out.println("===================================");
    	System.out.println("AVAILABLE MODELS:");
    	 System.out.println("MODEL NAME:"+model_1.model);
    	 System.out.println("---------------------------");
    	 System.out.println("MODEL NAME:"+model_2.model);
    	 System.out.println("---------------------------");
    	 System.out.println("PLEASE SELECT MODEL FROM BELOW TO SEE DETAILS:");
    	 System.out.println("PRESS [1] FOR PIAGGIO APE");
    	 System.out.println("PRESS [2] FOR BAJAJ APE");
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
    				
    				 p.cash(200000,8000);
    			 }
    			 else if(pay_mode==2)
    			 {
    			 System.out.println("MODEL NAME:"+model_1.model);
    			 System.out.println("///////////////////////////////////////////////////");
    				 p.upi(200000,8000);
    			 }
    			 else if (pay_mode==3)
    			 {
    				 System.out.println("MODEL NAME:"+model_1.model);
        			 System.out.println("///////////////////////////////////////////////////");
        				 p.emi(200000,8000);
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
    	    				
    	    				 p.cash(180000,9780);
    	    			 }
    	    			 else if(pay_mode==2)
    	    			 {
    	    			 System.out.println("MODEL NAME:"+model_2.model);
    	    			 System.out.println("///////////////////////////////////////////////////");
    	    				 p.upi(180000,9780);
    	    			 }
    	    			 else if (pay_mode==3)
    	    			 {
    	    				 System.out.println("MODEL NAME:"+model_2.model);
    	        			 System.out.println("///////////////////////////////////////////////////");
    	        				 p.emi(180000,9780);
    	    			 }
    	    		 }
    	    		 
    	    		 else
    	    		 { 
    	    			 System.out.println("THANKS FOR VISITING US !!!!");
    	    		 }
    	    	 }
    	 }
    	}
    }
