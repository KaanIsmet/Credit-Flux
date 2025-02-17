package com.KaanIsmetOkul.CreditFlux.repository;

import com.KaanIsmetOkul.CreditFlux.entity.Expense;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface ExpenseRepository extends JpaRepository<Expense, UUID> {
}
