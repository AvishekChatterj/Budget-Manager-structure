package budget_manager;

public class Food implements Item
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
