package com.testng.practice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Customer_CRUD8
{
	@Test (priority = 2, invocationCount = 3)
	public void createCustomer()
	{
		Reporter.log("Creating a Customer", true);
	}

	@Test (priority = 1, invocationCount = 1)
	public void retrieveCustomer()
	{
		Reporter.log("Retrieving a Customer", true);
	}

	@Test (priority = 3, enabled = false)
	public void updateCustomer()
	{
		Reporter.log("Updating a Customer", true);
	}

	@Test (priority = 1, enabled = true)
	public void deleteCustomer()
	{
		Reporter.log("Deleting a Customer", true);
	}
}
