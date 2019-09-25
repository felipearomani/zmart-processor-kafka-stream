package com.github.felipearomano.zmartprocessor.models;

import lombok.Builder;
import lombok.Getter;

import java.util.Objects;

@Getter
public class PurchaseKey {

    private String customerId;
    private Long transactionDate;

    @Builder
    public PurchaseKey(String customerId, Long transactionDate) {
        this.customerId = customerId;
        this.transactionDate = transactionDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PurchaseKey that = (PurchaseKey) o;
        return Objects.equals(customerId, that.customerId) &&
                Objects.equals(transactionDate, that.transactionDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerId, transactionDate);
    }
}
