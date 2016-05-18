package io.pivotal.util;

import java.sql.ResultSet;
import java.sql.SQLException;

import io.pivotal.domain.Customer;

import org.springframework.jdbc.core.RowMapper;

public class CustomerMapper implements RowMapper<Customer> {

	@Override
	public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {
		Customer customer = new Customer();
		
		customer.setId(rs.getString("SSN")+rs.getString("PurchaseDate")+rs.getString("PurchaseAmount"));
		customer.setFirstName(rs.getString("FirstName"));
		customer.setLastName(rs.getString("LastName"));
		customer.setSsn(rs.getString("SSN"));
		customer.setAddress(rs.getString("Address"));
		customer.setPurchaseDate(rs.getString("PurchaseDate"));
		customer.setPurchaseAmount(rs.getString("PurchaseAmount"));
		
		return customer;
	}

}
