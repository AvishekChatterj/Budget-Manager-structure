package budget_manager;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculate_amount 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter your budget: ");
		int budget=sc.nextInt();
		int total_expense=new Calculate_amount().budget_calc(budget);
		System.out.println("You have spent "+total_expense+" out of "+budget);
		if(total_expense==budget)
			System.out.println("You have reached 100% your budget ");
		else if(total_expense>budget)
			System.out.println("You have over-expended your budget");
		else
		System.out.println("You have reached "+ (total_expense/(float)budget)*100+"% of your budget");
		sc.close();
	}
		public int budget_calc(int budget)
		{
			int total_expense=0,choice;
			System.out.println("Enter the amount spent on: ");
			loop:
			while(total_expense<budget)
			{
			System.out.println(" Select the option to update expenses:  ");
			System.out.println("1. Food: ");
			System.out.println("2. Toiletries: ");
			System.out.println("3. Luxury Items: ");
			System.out.println("4. Entertainment: ");
			System.out.println("5.Other expenses: ");
			System.out.print("Press any other key to exit ");
			try
			{
				choice=sc.nextInt();
			}
			catch(Exception e)
			{
				break;
			}
			switch(choice)
			{
			case 1:
				try
				{
				int food=sc.nextInt();
				total_expense+=food;
				}
				catch(InputMismatchException ime)
				{
					System.out.println("The entered character is not a amount");
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}break;
			case 2:
				try
				{
				int toiletries=sc.nextInt();
				total_expense+=toiletries;
				}
				catch(InputMismatchException ime)
				{
					System.out.println("The entered character is not a amount");
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}break;
			case 3: 
				try
				{
				int luxury_items=sc.nextInt();
				total_expense+=luxury_items;
				}
				catch(InputMismatchException ime)
				{
					System.out.println("The entered character is not a amount");
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}break;
			case 4:
				try
				{
				int entertainment=sc.nextInt();
				total_expense+=entertainment;
				}
				catch(InputMismatchException ime)
				{
					System.out.println("The entered character is not a amount");
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
				break;
			case 5:
				try
				{
				int other_expenses=sc.nextInt();
				total_expense+=other_expenses;
				}
				catch(InputMismatchException ime)
				{
					System.out.println("The entered character is not a amount");
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
				break;
			default:
				System.out.println("You have entered all of your expenses for the day");
				break loop;
			}
		}
		return total_expense;
		}
}
