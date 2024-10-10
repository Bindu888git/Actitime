package com.testng.practice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Customer_CRUD12
{
	@Test (dependsOnMethods = "updateCustomer")
	public void createCustomer()
	{
		Reporter.log("Creating a Customer", true);
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
