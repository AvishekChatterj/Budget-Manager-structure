package budget_manager;

import java.util.Scanner;

public class Expenses {
	static Scanner scanner=new Scanner(System.in);
	public int calculateAmount()
	{
		int totalExpenses=0,choice=0;
		Item item;
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
			System.out.println("Press any other key to exit ");
			try
			{
			if(scanner.hasNextInt())
			{	
				choice=scanner.nextInt();
			}
			switch(choice)
			{
			case 1:
				System.out.print("Enter the amount expended:  ");
				if(scanner.hasNextInt())
				{
					item=new Food();
					item.setAmount(scanner.nextInt());
					totalExpenses+=item.getAmount();
				}
				break;
			case 2:
				System.out.print("Enter the amount expended:  ");
				if(scanner.hasNextInt())
				{
					item=new Toiletries();
					item.setAmount(scanner.nextInt());
					totalExpenses+=item.getAmount();
				}
				break;
			case 3:
				System.out.print("Enter the amount expended:  ");
				if(scanner.hasNextInt())
				{
					item=new LuxuryItems();
					item.setAmount(scanner.nextInt());
					totalExpenses+=item.getAmount();
					}
				break;
			case 4:
				System.out.print("Enter the amount expended:  ");
				if(scanner.hasNextInt())
				{
					item=new Entertainment();
					item.setAmount(scanner.nextInt());
					totalExpenses+=item.getAmount();
					}
				break;
			case 5:
				System.out.print("Enter the amount expended:  ");
				if(scanner.hasNextInt())
				{
					item=new Necessity();
					item.setAmount(scanner.nextInt());
					totalExpenses+=item.getAmount();
					}
				break;
			case 6:
				System.out.print("Enter the amount expended:  ");
				if(scanner.hasNextInt())
				{
					item=new Hobbies();
					item.setAmount(scanner.nextInt());
					totalExpenses+=item.getAmount();
					}
				break;
			case 7:
				System.out.print("Enter the amount expended:  ");
				if(scanner.hasNextInt())
				{
					item=new Others();
					item.setAmount(scanner.nextInt());
					totalExpenses+=item.getAmount();
					}
				break;
				default:
					System.out.println("You have entered all of your expenses for the day");
					return totalExpenses;
			}
		}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}
