package budget_manager;

public class ExpenseStatus {
	public String getExpenseStatus(int totalExpense,int budget) {
		float percent=getPercentage(totalExpense,budget);
		return "Your percentage: "+percent+"\n"+getStatus(percent);
	}
	public String getStatus(float percent)
	{
		if(percent<100.0)
			return "You are under your budget";
		else if(percent==100.0)
			return "You have expended your budget";
		return "You have over expended your budget";
	}
	public float getPercentage(int totalExpense,int budget)
	{
		return (totalExpense/(float)budget)*100 ;
	}

}
