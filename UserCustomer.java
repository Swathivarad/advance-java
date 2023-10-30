package hibernate_demo.controller;

import javax.persistence.Persistence;

import hibernate_demo.dao.Customercrud;
import hibernate_demo.dto.Customer;

public class UserCustomer {

	public static void main(String[] args) {
//		 Persistence.createEntityManagerFactory("radha");
		Customercrud crud=new Customercrud();
//		crud.saveCustomer(new Customer(1,"swathi","S@gmail.com",123,"hyd"));  //insert
//		crud.fetchCustomerByIdentifier(1);                                    //fetch
		crud.updateCustomerById(new Customer(1,"pooja","poo@gmail.com",2233,"ramanthapur"));  //update
		
//		        (or)
//		Customer customer=new Customer();
//		customer.setId(1);
//		customer.setName("swathi");
//		customer.setEmail("s@gmail.com");
//		customer.setPhone(7864);
//		customer.setAddress("hyd");
//		
//		crud.updateCustomerById(customer);
		crud.deleteCustomerById(0);                       //delete
		
		
		

	}

}
