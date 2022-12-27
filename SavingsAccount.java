//package bankapp;

/**
*
* SavingsAccount class
*/
public class SavingsAccount {

private String accountNumber; //account number
private double balance; //balance in account
private double interestRate; //interest rate

/**
* Constructor
* @param accountNumber
* @param balance
* @param interestRate
*/
public SavingsAccount(String accountNumber, double balance, double interestRate) {
this.accountNumber = accountNumber;
this.balance = balance;
this.interestRate = interestRate;
}

/**
* @return account number
*/
public String getAccountNumber() {
return accountNumber;
}

/**
* sets account number
* @param accountNumber
*/
public void setAccountNumber(String accountNumber) {
this.accountNumber = accountNumber;
}

/**
* @return balance of account
*/
public double getBalance() {
return balance;
}

/**
* sets balance of account
* @param balance
*/
public void setBalance(double balance) {
this.balance = balance;
}

/**
* @return interest rate of account
*/
public double getInterestRate() {
return interestRate;
}

/**
* sets interest rate of account
* @param interestRate
*/
public void setInterestRate(double interestRate) {
this.interestRate = interestRate;
}
}