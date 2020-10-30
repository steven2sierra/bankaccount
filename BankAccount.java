
import java.util.Random;
/*
 * 
 * 
 * 
 Create a BankAccount class. // done 

 The class should have the following attributes: (string) account number, (double) checking balance, (double) savings balance. // done

 Create a class member (static) that has the number of accounts created thus far. // done

 Create a class member (static) that tracks the total amount of money stored in every account created. // done

 Create a private method that returns a random ten digit account number.

 In the constructor, call the private method from above so that each user has a random ten digit account.

 In the constructor, be sure to increment the account count. // done

 Create a getter method for the user's checking account balance. // done

 Create a getter method for the user's saving account balance. // done

 Create a method that will allow a user to deposit money into either the checking or saving, be sure to add to total amount stored.

 Create a method to withdraw money from one balance. Do not allow them to withdraw money if there are insufficient funds.

 Create a method to see the total money from the checking and saving. // 

 Users should not be able to set any of the attributes from the class. // no setters, done, shouldn't allow users to set their balance
 * 
 * 
 * 
 */

public class BankAccount 
{
	// attributes
	private String accountNumber = "";
	private double checkingBalance;
	private double savingsBalance;
	// class members
	private static int numberOfAccounts = 0; 
	private static double total;  // not sure yet
	
	// constructor
	public BankAccount()
	{
		this.accountNumber = accountNumber(); // call the private method from above so that each user has a random ten digit account.
		this.checkingBalance = 0.0;
		this.savingsBalance = 0.0;
		numberOfAccounts++; // increment for every new account made
		System.out.println("Brand new user has an account number of " + accountNumber);
		System.out.println("Number of accounts created: " + numberOfAccounts);
	}
	
	// number of accounts
	public static int accountCount()
	{
		return numberOfAccounts;
	}
	
	private String accountNumber()
	{
		// 10 random digits
		String digits = "9876543210";
		String rand = "";
		// set a random string to accountNumber
		Random r = new Random(); // instance
		for(int j = 0; j < 10; j++)
		{
			char digit = digits.charAt(r.nextInt(10));
			rand += digit;
		}
		accountNumber = rand; // return rand as an account number
		return rand;
	}
	
	// getter for user's checking balance
	public double checking()
	{
		return checkingBalance;
	}
	
	// setter for user's checking balance
	public void setChecking(double checkingBalance)
	{
		this.checkingBalance = checkingBalance;
	}
	
	// setter for user's savings account balance
	public void setSavings(double savingsBalance)
	{
		this.savingsBalance = savingsBalance;
	}
	
	// getter for user's savings account balance
	public double savings()
	{
		return savingsBalance;
	}
	
	// deposit money
	public void deposit(String selection, double depositAmount)
	{
		// checking account
		if(selection == "checking" || selection == "Checking" || selection == "checkings") // user errors
		{
			setChecking(checking() + depositAmount);
			total += depositAmount; // accessed in a 'static way'
		}
		// savings account
		if(selection == "savings" || selection == "Savings" || selection == "saving")
		{
			setSavings(savings() + depositAmount);
			total += depositAmount; // accessed in a 'static way'
		}
		/*
		if(selection != "savings" || selection != "checking") {
			System.out.println("These are not the droids you are looking for...");
		}
		*/
	}
	
	// withdraw money
	public void withdraw(String selection, double withdrawAmount)
	{
		// checking account
		if(selection == "checking" || selection == "Checking" || selection == "checkings") // user errors
		{
				setChecking(checking() - withdrawAmount);
				total -= withdrawAmount;
		}
		else {
			System.out.println("I am not sure what you are looking for...");
		}
		// savings account
		if(selection == "savings" || selection == "Savings" || selection == "saving")
		{
			setSavings(savings() - withdrawAmount);
		}
	}
	
	// total money from checking and savings
	public double totalMoney()
	{
		total = savingsBalance + checkingBalance;
		System.out.println("Your savings balance is: " + "$" + savingsBalance);
		System.out.println("Your checking balance is: " + "$" +checkingBalance);
		System.out.println("Your total amount of money between checking and saving is " + total);
		return total;
	}
	
	
}
 