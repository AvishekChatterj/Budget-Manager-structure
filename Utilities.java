package budget_manager;
public class Utilities
{
		public boolean isNegetive(int addedbudget)
		{
			int result=Integer.signum(addedbudget);
			return (result<0)?true:false;
		}
		public static boolean getValidation(int budget)
		{
			return (budget>0)?true:false;
		}
		
}