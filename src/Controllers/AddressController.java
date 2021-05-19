package Controllers;

import Models.Address;
import Views.ViewAddress;

public class AddressController {
	public Address newAddress() {
		String street = ViewAddress.setStreet();
		Integer number = ViewAddress.setNumber();
		String cep = ViewAddress.setZipCode();
		
		Address address = new Address(number, street, cep);
		
		return address;
	}
}
