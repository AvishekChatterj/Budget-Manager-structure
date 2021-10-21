package budget_manager;

import java.util.Scanner;

public class Calculate_amount 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your budget: ");
			int budget=sc.nextInt();
		System.out.println("Enter the amout spent on: ");
		System.out.print("Food: ");
			int food=sc.nextInt();
		System.out.print("Toiletries: ");
			int toiletries=sc.nextInt();
		System.out.print("Luxury Items: ");
			int luxury_items=sc.nextInt();
		System.out.print("OTT platforms: ");
			int ott_bill=sc.nextInt();
			
		int total_expense=food+luxury_items+toiletries+ott_bill;
		
		System.out.println("You have spent "+total_expense+" out of "+budget);
		if(total_expense==budget)
			System.out.println("You have reached 100% your budget ");
		else if(total_expense>budget)
			System.out.println("You have over-expended your budget");
		else
		System.out.println("You have reached"+ (total_expense/(float)budget)*100+" of your budget");
		sc.close();
	}
}
