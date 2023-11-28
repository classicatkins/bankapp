# Java Swing Banking Application

This repository contains a simple yet functional banking application developed in Java, utilizing the Swing framework for its graphical user interface. The application offers a range of features enabling the management of customer accounts and interactions within a banking system.

## Features

- **GUI Interface**: A user-friendly interface built using Java Swing, allowing for easy interaction with the application.
- **Customer Management**: Capabilities to add new customers, search for existing customers by first or last name, and update customer details.
- **Account Management**: Each customer is associated with a Savings Account, which includes functionality such as account creation and balance management.
- **Interest Calculation**: The application includes a feature to calculate interest based on the customer's account balance and interest rate.

## Components

The application is divided into several key classes:

- **BankAppGUI**: The main GUI class that handles user interactions and interfaces with other components of the application.
- **Customer**: A class representing a customer, containing personal information and a link to their savings account.
- **Customers**: A utility class managing a collection of Customer objects, including methods to add, search, and manage customers.
- **SavingsAccount**: A class representing a savings account, including properties like account number, balance, and interest rate.

## Getting Started

To run this application:

1. Clone the repository to your local machine.
2. Ensure you have Java and a suitable IDE (like Eclipse or IntelliJ IDEA) installed.
3. Import the project into your IDE and resolve any dependencies if required.
4. Run the `BankAppGUI` class to start the application.
