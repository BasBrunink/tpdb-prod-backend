package net.codefink.tpdb.dataservice;

import org.springframework.stereotype.Service;

@Service
public class CustomerService {

  public String registerCustomer(CustomerRegistrationRequest request) {
    Customer customer = Customer.builder()
        .firstName(request.getFirstName())
        .lastName(request.getLastName())
        .email(request.getEmail())
        .build();
    return "Customer registered with firstName " + customer.getFirstName();
  }
}
