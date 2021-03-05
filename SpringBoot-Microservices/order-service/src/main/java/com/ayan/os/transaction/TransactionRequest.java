package com.ayan.os.transaction;

import com.ayan.os.entity.Order;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TransactionRequest {
    Order order;
    Payment payment;
}
