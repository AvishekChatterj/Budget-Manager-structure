package budget_manager;
public class Utilities
{
		public static boolean getValidation(int budget,int addedBudget)
		{
			int result=Integer.signum(addedBudget);
			if(result<0)
			{
				if(budget-addedBudget<0)
					return false;
			}
			return true;
		}
		public static boolean getValidation(int budget)
		{
			return (budget>0)?true:false;
		}
}