package net.codefink.tpdb.dataservice;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("api/v1/customers")
public class CustomerController {

  private final CustomerService customerService;

  public CustomerController(CustomerService customerService) {
    this.customerService = customerService;
  }

  public void registerCustomer(@RequestBody CustomerRegistrationRequest request) {
    log.info("Registering customer {} ",request);
    customerService.registerCustomer(request);
  }
}
