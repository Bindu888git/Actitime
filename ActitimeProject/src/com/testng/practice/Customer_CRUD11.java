package com.testng.practice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Customer_CRUD11
{
	@Test (priority = 2, dependsOnMethods = "updateCustomer")
	public void createCustomer()
	{
		Reporter.log("Creating a Customer", true);
	}

	@Test (priority = 3, dependsOnMethods = "createCustomer")
	public void updateCustomer()
	{
		Reporter.log("Updating a Customer", true);
	}

	@Test (priority = 1)
	public void deleteCustomer()
	{
		Reporter.log("Deleting a Customer", true);
	}
}
