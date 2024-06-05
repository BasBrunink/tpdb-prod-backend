package net.codefink.tpdb.dataservice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;

import org.mockito.MockitoAnnotations;


import static org.junit.jupiter.api.Assertions.assertEquals;


class CustomerServiceTests {

  @InjectMocks
  private CustomerService customerService;


  @BeforeEach
  public void setup() {
    MockitoAnnotations.openMocks(this);
  }

  @Test
  @DisplayName("Should register customer successfully")
  void registerCustomer() {
    CustomerRegistrationRequest request = new CustomerRegistrationRequest("John", "Doe", "test@example.com");
    String result = customerService.registerCustomer(request);
    assertEquals("Customer registered with firstName John", result);


  }
}
