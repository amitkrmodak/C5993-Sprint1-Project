package com.project.dao;
/*
 * Amit Kumar Modak 
 */
public interface CustomerDao {

	void addCustomer();

	void viewCustomer();

	void deleteCustomer();

	void updateCustomer(int customerLoginId);

	void deleteCustomer(int id);

	int isCustomerAccount(String customer_email);

}
