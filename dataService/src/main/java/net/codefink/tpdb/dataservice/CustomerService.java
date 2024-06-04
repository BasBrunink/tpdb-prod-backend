package net.codefink.tpdb.dataservice;

import org.springframework.stereotype.Service;

@Service
public class CustomerService {

  public String registerCustomer(CustomerRegistrationRequest request) {
    Customer customer = Customer.builder()
        .firstName(request.firstName())
        .lastName(request.lastName())
        .email(request.email())
        .build();
    return "Customer registered with firstName " + customer.getFirstName();
  }
}
