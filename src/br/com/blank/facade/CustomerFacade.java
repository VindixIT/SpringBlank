package br.com.blank.facade;

import java.util.Collection;

import br.com.blank.dao.CustomerDAO;
import br.com.blank.dao.factory.DAOFactory;
import br.com.blank.to.CustomerTO;

public class CustomerFacade {

	public static void main(String[] args) {

		// create the required DAO Factory
		DAOFactory cloudscapeFactory = DAOFactory.getDAOFactory(DAOFactory.CLOUDSCAPE);

		// Create a DAO
		CustomerDAO custDAO = cloudscapeFactory.getCustomerDAO();

		// create a new customer
		int newCustNo = custDAO.insertCustomer();
		System.out.println(newCustNo);

		// Find a customer object. Get the Transfer Object.
		CustomerTO cust = custDAO.findCustomer();

		// modify the values in the Transfer Object.
		cust.setStreetAddress("Teste");
		cust.setName("Teste");
		// update the customer object using the DAO
		custDAO.updateCustomer();

		// delete a customer object
		custDAO.deleteCustomer();
		// select all customers in the same city
		CustomerTO criteria = new CustomerTO();
		criteria.setCity("New York");
		Collection<String> customersList = custDAO.selectCustomersTO();
		System.out.println(customersList);
		// returns customersList - collection of Customer
		// Transfer Objects. iterate through this collection to
		// get values.

	}
}
