package net.codefink.tpdb.dataservice;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class CustomerRegistrationRequest {
    String firstName;
        String lastName;
        String email;

}
