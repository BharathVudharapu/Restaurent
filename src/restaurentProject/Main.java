package restaurentProject;
import java.util.Scanner;
public class Main {
public static Scanner  input=new Scanner(System.in);
public static int Choice,Quantity=1;
public static String again;
public static double total=0,pay;
public static void menu() {
	System.out.println("-_-_-_-_-_-_-_-_");
	System.out.println("\tWELLCOME TO OUR RESTAURENT");
	System.out.println("\tRestaurent MENU");
	System.out.println("\t1.Barger BDT $80.00");
	System.out.println("\t2.Pizza  BDT $ 100.00");
	System.out.println("\t3.coffe   BDT $60.00");
	System.out.println("\t4.cancle   ");
	}
public static void order(){
	System.out.println("1 to Berger ||2 to Pizza || 3 to Coffe");
	System.out.println("press you want to order");
	Choice=input.nextInt();
	if (Choice==1) {
		System.out.println("your choice is Berger");
		System.out.println("How Many Bergers You Want to order");
		Quantity=input.nextInt();
		total=total+(Quantity*80);
		System.out.println("You Want to Buy Again :");
		System.out.println(" Press Y for [YES] and N For [No]");
		again=input.next();
		if (again.equalsIgnoreCase("Y")) 
			order();
			else {
				System.out.println("Enter payment :");
		         pay=input.nextDouble();
		         if(pay<total)
		        	 System.out.println("No,ned more money ");
		         else {
		        	 System.out.println("total=+total");
		        	 total=pay-total ;
		        	 System.out.println("Customer's return" +total+"tk");	
	          }
          }
	   }   
	else if (Choice==2) {
		System.out.println("your choice is pizza");
		System.out.println("How Many pizza You Want to ordeer");
		Quantity=input.nextInt();
		total=total+(Quantity*100);
		System.out.println("You Want to Buy Again :");
		System.out.println(" Press Y for [YES] and N For [No]");
		again=input.next();
		if (again.equalsIgnoreCase("Y")) 
			order();
			else {
				System.out.println("Enter payment :");
		         pay=input.nextDouble();
		         if(pay<total)
		        	 System.out.println("No,ned more ");
		         else {
		        	 System.out.println("total=+total");
		        	 total=pay-total ;
		        	 System.out.println("Customer's return" +total+"tk");	
	          }
          }
	   } 
	else if (Choice==3) {
		System.out.println("your choice isCoffee");
		System.out.println("How Many coffees You Want to order");
		Quantity=input.nextInt();
		total=total+(Quantity*60);
		System.out.println("You Want to Buy Again :");
		System.out.println(" Press Y for [YES] and N For [No]");
		again=input.next();
		if (again.equalsIgnoreCase("Y")) 
			order();
			else {
				System.out.println("Enter payment :");
		         pay=input.nextDouble();
		         if(pay<total)
		        	 System.out.println("No,ned more ");
		         else {
		        	 System.out.println("total=+total");
		        	 total=pay-total ;
		        	 System.out.println("Customer's return" +total+"tk");	
	          }
          }
	   }
	else  if (Choice==4) {
		System.exit(0);
	}
	else {
		System.out.println("choose a food in this item : ");
		order();
	}
	}

	public static void main(String[] args) {
		menu();
		order();
	}

}
