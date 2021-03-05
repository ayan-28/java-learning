package com.ayan.ps.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ayan.ps.api.entity.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Integer> {

}
