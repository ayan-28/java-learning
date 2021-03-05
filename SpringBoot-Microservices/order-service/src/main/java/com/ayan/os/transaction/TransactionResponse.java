package com.ayan.os.transaction;

import com.ayan.os.entity.Order;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TransactionResponse {
    Order order;
    double amount;
    String transactionId;
    String message;
}
