package budget_manager;

import java.util.Scanner;

public class Calculate_amount 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your budget: ");
		int budget=sc.nextInt();
		System.out.println("Enter the amout spent on: ");
		System.out.println("Food: ");
		int food=sc.nextInt();
		System.out.println("Toiletries: ");
		int toiletries=sc.nextInt();
		System.out.println("Luxury Items: ");
		int luxury_items=sc.nextInt();
		System.out.println("OTT platforms: ");
		int ott_bill=sc.nextInt();
		int sum=food+luxury_items+toiletries+ott_bill;
		
		System.out.println("You have spent "+sum+" out of "+budget);
		System.out.println("Percentage: "+ (sum/(float)budget)*100);
		sc.close();
	}
}
