package com.robson.io.cleanarch.core.usecase;

import com.robson.io.cleanarch.core.domain.Customer;

public interface InsertCustomerUseCase {
	void insert(
		Customer customer,
		String zipCode
	);
}
