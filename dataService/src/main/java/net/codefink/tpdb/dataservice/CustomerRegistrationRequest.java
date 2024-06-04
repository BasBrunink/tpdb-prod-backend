package net.codefink.tpdb.dataservice;


public record CustomerRegistrationRequest(
    String firstName,
        String lastName,
        String email
) {
}
