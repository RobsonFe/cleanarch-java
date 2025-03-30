package com.robson.io.cleanarch.core.usecase.impl;
import com.robson.io.cleanarch.core.dataprovider.FindAddressByZipCode;
import com.robson.io.cleanarch.core.dataprovider.InsertCustomer;
import com.robson.io.cleanarch.core.domain.Customer;
import com.robson.io.cleanarch.core.usecase.InsertCustomerUseCase;

public class InsertCustomerUseCaseImpl implements InsertCustomerUseCase {

	private final FindAddressByZipCode findAddressByZipCode;
	private final InsertCustomer insertCustomer;

	public InsertCustomerUseCaseImpl(FindAddressByZipCode findAddressByZipCode, InsertCustomer insertCustomer) {
		this.insertCustomer = insertCustomer;
		this.findAddressByZipCode = findAddressByZipCode;
	}

	@Override
	public void insert(Customer customer, String zipCode) {
		var address = findAddressByZipCode.find(zipCode);
		customer.setAddress(address.toString());
		insertCustomer.insert(customer);
	}
	
}
