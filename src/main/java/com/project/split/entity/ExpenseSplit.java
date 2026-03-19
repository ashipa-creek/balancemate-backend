package com.project.split.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "expense_splits")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ExpenseSplit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long expenseId;

    private Long userId; // who owes

    private Double amountOwed;
}