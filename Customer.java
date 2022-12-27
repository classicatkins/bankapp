 //package bankapp;

/**
*
* Customer class
*/
public class Customer {
private int customerID; //id of customer
private String customerFirstName; //first name of customer
private String customerLastName; //last name of customer
private String customerAddress; //address of customer
private String customerPhoneNumber; //phone number of customer
private SavingsAccount savingsAccount; //savings account of customer

/**
* Constructor
* @param customerFirstName
* @param customerLastName
* @param customerAddress
* @param customerPhoneNumber
* @param savingsAccount
*/
public Customer(int customerID,String customerFirstName, String customerLastName, String customerAddress, String customerPhoneNumber, SavingsAccount savingsAccount) {
this.customerID = customerID;
this.customerFirstName = customerFirstName;
this.customerLastName = customerLastName;
this.customerAddress = customerAddress;
this.customerPhoneNumber = customerPhoneNumber;
this.savingsAccount = savingsAccount;
}

/**
*
* @return customer's ID
*/
public int getCustomerID() {
return customerID;
}

/**
*
* @return customer's first name
*/
public String getCustomerFirstName() {
return customerFirstName;
}

/**
* sets customer's first name
* @param customerFirstName
*/
public void setCustomerFirstName(String customerFirstName) {
this.customerFirstName = customerFirstName;
}

/**
*
* @return customer's last name
*/
public String getCustomerLastName() {
return customerLastName;
}

/**
* sets customer's last name
* @param customerLastName
*/
public void setCustomerLastName(String customerLastName) {
this.customerLastName = customerLastName;
}

/**
*
* @return customer's address
*/
public String getCustomerAddress() {
return customerAddress;
}

/**
* sets customer's address
* @param customerAddress
*/
public void setCustomerAddress(String customerAddress) {
this.customerAddress = customerAddress;
}

/**
*
* @return customer's phone number
*/
public String getCustomerPhoneNumber() {
return customerPhoneNumber;
}

/**
* sets customer's phone number
* @param customerPhoneNumber
*/
public void setCustomerPhoneNumber(String customerPhoneNumber) {
this.customerPhoneNumber = customerPhoneNumber;
}

/**
*
* @return customer's saving account
*/
public SavingsAccount getSavingsAccount() {
return savingsAccount;
}

/*public void setSavingsAccount(SavingsAccount savingsAccount) {
this.savingsAccount = savingsAccount;
}*/
}