package budget_manager;

import java.util.Scanner;

public class CalculateExpenses {
	static Scanner scanner=new Scanner(System.in);
	public static void main(String[] args) 
	{
		int budget=0;
		CalculateExpenses calculate_expense=new CalculateExpenses();
		System.out.print("Enter the budget: ");
		if(scanner.hasNextInt())
		{
			budget=scanner.nextInt();
		}
		int totalExpense=calculate_expense.calculateAmount();
		System.out.println("You have spent"+totalExpense+" out of "+budget);
		System.out.println("Percentage: "+getPercentage(totalExpense, budget));
		System.out.println(getStatus(totalExpense));
	}
	public int calculateAmount()
	{
		int totalExpenses=0,choice=0;
		System.out.println("Enter the amount spent on: ");
		while(true)
		{
			System.out.println(" Select the option to update expenses:  ");
			System.out.println("1. Food: ");
			System.out.println("2. Toiletries: ");
			System.out.println("3. Luxury Items: ");
			System.out.println("4. Entertainment: ");
			System.out.println("5. Necessity: ");
			System.out.println("6. Hobbies: ");
			System.out.println("7.Other expenses: ");
			System.out.print("Press any other key to exit ");
			if(scanner.hasNextInt())
			{	
				choice=scanner.nextInt();
			}
			switch(choice)
			{
			case 1:
				if(scanner.hasNextInt())
				{
					Food food=new Food();
					food.setAmount(scanner.nextInt());
					totalExpenses+=food.getAmount();
				}
				break;
			case 2:
				if(scanner.hasNextInt())
				{
					Toiletries toiletries=new Toiletries();
					toiletries.setAmount(scanner.nextInt());
					totalExpenses+=toiletries.getAmount();
					}
				break;
			case 3:
				if(scanner.hasNextInt())
				{
					LuxuryItems luxury=new LuxuryItems();
					luxury.setAmount(scanner.nextInt());
					totalExpenses+=luxury.getAmount();
					}
				break;
			case 4:
				if(scanner.hasNextInt())
				{
					Entertainment entertainment=new Entertainment();
					entertainment.setAmount(scanner.nextInt());
					totalExpenses+=entertainment.getAmount();
					}
				break;
			case 5:
				if(scanner.hasNextInt())
				{
					Necessity necessity=new Necessity();
					necessity.setAmount(scanner.nextInt());
					totalExpenses+=necessity.getAmount();
					}
				break;
			case 6:
				if(scanner.hasNextInt())
				{
					Hobbies hobbies=new Hobbies();
					hobbies.setAmount(scanner.nextInt());
					totalExpenses+=hobbies.getAmount();
					}
				break;
			case 7:
				if(scanner.hasNextInt())
				{
					Others others=new Others();
					others.setAmount(scanner.nextInt());
					totalExpenses+=others.getAmount();
					}
				break;
				default:
					System.out.println("You have entered all of your expenses for the day");
					return totalExpenses;
			}
		}
	}
	public static float getPercentage(int totalExpense,int budget)
	{
		return (totalExpense/(float)budget)*100 ;
	}
	public static String getStatus(float percentage)
	{
		return (percentage<100)?"You are under your budget":"You have over-expended your budget";
	}
}
