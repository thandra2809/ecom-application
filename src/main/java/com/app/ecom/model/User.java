package com.app.ecom.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class User {

    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private UserRole role = UserRole.CUSTOMER;

    // @OneToOne(cascade = CascadeType.ALL,orphanRemoval = true)
    // @JoinColumn(name= "address_id", referencedColumnName = "id")
    private Address address;
}
