package budget_manager;

public class Hobbies implements Item
{
	private int amount=0;
	@Override
	public int getAmount() {
		return amount;
	}
	@Override
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	
}
