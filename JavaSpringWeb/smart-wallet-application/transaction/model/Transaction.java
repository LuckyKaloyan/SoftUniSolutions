package app.transaction.model;


import app.user.model.User;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Currency;
import java.util.UUID;


@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @ManyToOne
    private User owner;

    @Column(nullable = false)
    private String sender;

    @Column(nullable = false)
    private String receiver;

    @Column(nullable = false)
    private BigDecimal amount;

    @Column(nullable = false)
    private BigDecimal balanceLeft;

    @Column(nullable = false)
    private Currency currency;

    @Column(nullable = false)
    private TransactionType type;

    @Column(nullable = false)
    private TransactionStatus status;

    @Column(nullable = false)
    private String description;

    private String failureReason;

    @Column(nullable = false)
    private LocalDate createdOn;
}
