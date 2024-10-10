package com.testng.practice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Customer_CRUD9
{
	@Test (priority = 1)
	public void createCustomer()
	{
		Reporter.log("Creating a Customer", true);
	}

	@Test (priority = 2)
	public void retrieveCustomer()
	{
		Reporter.log("Retrieving a Customer", true);

		int x = 25;
		int y = x / 0;

		Reporter.log("ArithmeticException : " + y , true);
	}

	@Test (priority = 3, dependsOnMethods = "retrieveCustomer")
	public void updateCustomer()
	{
		Reporter.log("Updating a Customer", true);
	}

	@Test (priority = 4)
	public void deleteCustomer()
	{
		Reporter.log("Deleting a Customer", true);
	}
}
