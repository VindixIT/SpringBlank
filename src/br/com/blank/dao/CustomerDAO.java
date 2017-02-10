package br.com.blank.dao;

import java.util.Collection;

import javax.sql.RowSet;

import br.com.blank.to.CustomerTO;

//Interface that all CustomerDAOs must support
public interface CustomerDAO {
	
	public int insertCustomer();
	public boolean deleteCustomer();
	public CustomerTO findCustomer();
	public boolean updateCustomer();
	public RowSet selectCustomersRS();
	public Collection<String> selectCustomersTO();

}