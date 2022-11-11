/**
 * Author:		Andrew Lane
 * Date:		11/11/22
 * File:        CheckingAccount.java
 * Description: (replace w/ description of program)
 */



public class CheckingAccount {
	// member variables
	
	private String uniqueID;
	private double acctBalance;
	private double annualInterestRate;
	private java.util.Date dateCreated = new java.util.Date();
	
	// constructor
	
	public CheckingAccount() {
		// do-nothing
	}
	
	public void CheckingAccounnt(String uniqueID, double acctBalance) {
		this.uniqueID = uniqueID;
		this.acctBalance = acctBalance;			
	}
	
	// Getters
	
	public String getUniqueID() {
		
		return uniqueID;
	}

	public double getAcctBalance() {
		return acctBalance;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public java.util.Date getDateCreated() {	
		return dateCreated;
	}
	
	// Setters
	
	public void setUniqueID(String uniqueID) {
		this.uniqueID = uniqueID;
	}

	public void setAcctBalance(double acctBalance) {
		this.acctBalance = acctBalance;
	}

	public void setAnnualInterestRate(double annualIntrestRate) {
		this.annualInterestRate = annualIntrestRate;
	}

	

	
	public String toString() {
		return  "Account ID: " + uniqueID +"\nAccount Balance: $" + acctBalance +
				"\nAnnual interest rate %: " + annualInterestRate + "\nDate Account Created: " + dateCreated; 
				
	}
	
	// Methods
	
	public void depositCash(double deposit) {
		setAcctBalance( getAcctBalance() + deposit);
	}
	
	public double getDailyIntRate(double annualInterestRate){
		return (((getAnnualInterestRate() / 100) /365)* getAcctBalance());
	}
}

