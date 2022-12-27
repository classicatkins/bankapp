//package bankapp;

import java.util.ArrayList;

/**
*
* Customers class
*/
public class Customers {
private static ArrayList<Customer> customers = new ArrayList<>(); //collection of customers

/**
* searches customer by first name
* @param firstName
* @return first customer found
*/
public static Customer searchCustomerByFirstName(String firstName)
{
Customer foundCustomer=null;
for(Customer customer:customers)
{
if(customer.getCustomerFirstName().equalsIgnoreCase(firstName))
{
foundCustomer = customer;
break;
}
}
return foundCustomer;
}

/**
* searches customer by last name
* @param lastName
* @return first customer found
*/
public static Customer searchCustomerByLastName(String lastName)
{
Customer foundCustomer=null;
for(Customer customer:customers)
{
if(customer.getCustomerLastName().equalsIgnoreCase(lastName))
{
foundCustomer = customer;
break;
}
}
return foundCustomer;
}

/**
* adds a new customer
* @param customer
*/
public static void addCustomer(Customer customer)
{
customers.add(customer);
}

public static int getTotalCustomers()
{
return customers.size();
}
}