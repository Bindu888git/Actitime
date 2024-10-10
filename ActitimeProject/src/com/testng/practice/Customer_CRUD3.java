package com.testng.practice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Customer_CRUD3
{
	@Test (priority = -3)
	public void createCustomer()
	{
		Reporter.log("Creating a Customer", true);
	}

	@Test (priority = 0)
	public void retrieveCustomer()
	{
		Reporter.log("Retrieving a Customer", true);
	}

	@Test (priority = 1)
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
