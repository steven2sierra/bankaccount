
public class BankAccountTest {

	public static void main(String[] args)
	{
		// user1
		/*
		BankAccount user1 = new BankAccount();
		user1.deposit("checking",50.0);
		user1.totalMoney();
		user1.withdraw("checking", 25.0);
		user1.totalMoney();
		*/
		BankAccount user2 = new BankAccount();
		user2.deposit("savings", 500.0);
		user2.totalMoney();
		user2.withdraw("checking", 50.0); // still allowed to withdraw 
		user2.totalMoney();
	}

}
