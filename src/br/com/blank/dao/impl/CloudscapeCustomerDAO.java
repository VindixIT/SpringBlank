package br.com.blank.dao.impl;

//CloudscapeCustomerDAO implementation of the 
//CustomerDAO interface. This class can contain all
//Cloudscape specific code and SQL statements. 
//The client is thus shielded from knowing 
//these implementation details.

import java.util.Collection;
import java.util.HashSet;

import javax.sql.RowSet;

import br.com.blank.dao.CustomerDAO;
import br.com.blank.to.CustomerTO;

public class CloudscapeCustomerDAO implements CustomerDAO {

	public CloudscapeCustomerDAO() {
		// initialization
	}

	// The following methods can use
	// CloudscapeDAOFactory.createConnection()
	// to get a connection as required

	public int insertCustomer() {
		// Implement insert customer here.
		// Return newly created customer number
		// or a -1 on error
		return 1;
	}

	public boolean deleteCustomer() {
		// Implement delete customer here
		// Return true on success, false on failure
		return true;
	}

	public CustomerTO findCustomer() {
		// Implement find a customer here using supplied
		// argument values as search criteria
		// Return a Transfer Object if found,
		// return null on error or if not found
		return null;
	}

	public boolean updateCustomer() {
		// implement update record here using data
		// from the customerData Transfer Object
		// Return true on success, false on failure or
		// error
		return true;
	}

	public RowSet selectCustomersRS() {
		// implement search customers here using the
		// supplied criteria.
		// Return a RowSet.
		return null;
	}

	public Collection<String> selectCustomersTO() {
		// implement search customers here using the
		// supplied criteria.
		// Alternatively, implement to return a Collection
		// of Transfer Objects.
		Collection<String> collection = new HashSet<String>();
		return collection;
	}

}