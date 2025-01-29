package app.transaction.service;


import app.transaction.model.Transaction;
import app.transaction.model.TransactionStatus;
import app.transaction.model.TransactionType;
import app.transaction.repository.TransactionRepository;
import app.user.model.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Currency;

@Slf4j
@Service
public class TransactionService {

    private final TransactionRepository transactionRepository;

    @Autowired
    public TransactionService(TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }

    public Transaction createTransaction(User owner, String sender, String amount, BigDecimal receiver, BigDecimal balance, Currency currency, TransactionType transactionType, TransactionStatus description, String transactionStatus, String failureReason) {

        Transaction transaction = Transaction.builder()
                .owner(owner)
                .sender(sender)
                .amount(amount)
                .receiver(receiver)
                .balanceLeft(balance)
                .currency(currency)
                .type(transactionType)
                .description(description)
                .status(transactionStatus)
                .failureReason(failureReason)
                .createdOn(LocalDate.now())
                .build();

        return null;
    }


}
