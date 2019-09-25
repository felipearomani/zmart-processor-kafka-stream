package com.github.felipearomano.zmartprocessor.models;

import lombok.Builder;
import lombok.Getter;

import java.io.Serializable;

@Getter
public class Purchase implements Serializable {

    private String firstName;
    private String lastName;
    private String customerId;
    private String creditCardNumber;
    private String itemPurchased;
    private String department;
    private String employeeId;
    private int quantity;
    private double price;
    private Long purchaseDate;
    private String zipCode;
    private String storeId;

    @Builder
    public Purchase(
            String firstName,
            String lastName,
            String customerId,
            String creditCardNumber,
            String itemPurchased,
            String department,
            String employeeId,
            int quantity,
            double price,
            Long purchaseDate,
            String zipCode,
            String storeId
    ) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.customerId = customerId;
        this.creditCardNumber = creditCardNumber;
        this.itemPurchased = itemPurchased;
        this.department = department;
        this.employeeId = employeeId;
        this.quantity = quantity;
        this.price = price;
        this.purchaseDate = purchaseDate;
        this.zipCode = zipCode;
        this.storeId = storeId;
    }
}
