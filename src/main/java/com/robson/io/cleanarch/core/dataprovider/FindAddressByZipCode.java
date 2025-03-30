package com.robson.io.cleanarch.core.dataprovider;

import com.robson.io.cleanarch.core.domain.Address;

public interface FindAddressByZipCode {
	Address find(final String zipCode);
}
