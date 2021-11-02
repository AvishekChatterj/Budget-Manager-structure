package budget_manager;

import java.util.Scanner;

public class Main 
{
	static Scanner scanner=new Scanner(System.in);
	static int totalBudget=0;
	public static void main(String[] args) 
	{
		int userChoice=0,totalExpenses=0;
		System.out.println("*--------WELCOME---------*");
		try
		{
			System.out.print("Currrent Budget : "+totalBudget);
		while(true)
		{
			System.out.println("\nPress 1 to Record a Expense");
			System.out.println("Press 2 update Budget");
			System.out.println("Press 3 to see the Expense Status");
			System.out.println("Press any other key to exit");
			if(scanner.hasNextInt())
			{
				userChoice=scanner.nextInt();
			}
			switch(userChoice)
			{
			case 1:
				if(Utilities.getValidation(totalBudget))
				{
					Expenses recordExpense=new Expenses();
					totalExpenses=recordExpense.calculateAmount();
				}
				else
					System.out.println("Please update your budget first");
				break;
			case 2:
				System.out.print("Enter the amount to be added:  ");
				if(scanner.hasNextInt())
				{
					int addedBudget=scanner.nextInt();
					if(Utilities.getValidation(addedBudget, addedBudget))
					{
						Budget budget=new Budget();
						totalBudget=budget.updateBudget(totalBudget,addedBudget);
						System.out.print("Currrent Budget : "+totalBudget);
					}
				}
				break;
			case 3:
				if(Utilities.getValidation(totalBudget))
				{
				ExpenseStatus expStatus=new ExpenseStatus();
				System.out.println(expStatus.getExpenseStatus(totalExpenses,totalBudget));
				}
				else
					System.out.println("Please update your budget first");
				break;
				default:
					System.out.println("*-----------Have a Good day------------*");
					System.exit(0);
			}
		}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
