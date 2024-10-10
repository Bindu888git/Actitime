package com.testng.practice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Customer_CRUD13
{
	@Test (dependsOnMethods = "updateCustomer")
	public void CreateCustomer()
	{
		Reporter.log("Creating a Customer", true);
	}

	@Test (invocationCount = -1)	// Zero or any Negative value
	public void retrieveCustomer()
	{
		Reporter.log("Retrieving a Customer", true);
	}

	@Test
	public void updateCustomer()
	{
		Reporter.log("Updating a Customer", true);
	}

	@Test
	public void deleteCustomer()
	{
		Reporter.log("Deleting a Customer", true);
	}
}
