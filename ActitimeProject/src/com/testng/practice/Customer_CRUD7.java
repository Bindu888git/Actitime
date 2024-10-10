package com.testng.practice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Customer_CRUD7
{
	@Test (priority = 1, dependsOnMethods = "updateCustomer", invocationCount = 3)
	public void createCustomer()
	{
		Reporter.log("Creating a Customer", true);
	}

	@Test (priority = 0, enabled = false)
	public void retrieveCustomer()
	{
		Reporter.log("Retrieving a Customer", true);
	}

	@Test (priority = 2, invocationCount = 2, enabled = true)
	public void updateCustomer()
	{
		Reporter.log("Updating a Customer", true);
	}

	@Test (priority = 1, dependsOnMethods = "updateCustomer")
	public void deleteCustomer()
	{
		Reporter.log("Deleting a Customer", true);
	}
}
