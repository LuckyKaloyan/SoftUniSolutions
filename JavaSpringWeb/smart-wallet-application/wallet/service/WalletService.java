package app.wallet.service;

import app.exception.DomainException;
import app.transaction.model.Transaction;
import app.transaction.model.TransactionStatus;
import app.transaction.model.TransactionType;
import app.transaction.service.TransactionService;
import app.user.model.User;
import app.wallet.model.Wallet;
import app.wallet.model.WalletStatus;
import app.wallet.repository.WalletRepository;
import jakarta.transaction.Transactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Currency;
import java.util.UUID;

@Slf4j
@Service
public class WalletService {

    private final WalletRepository walletRepository;
    private final TransactionService transactionService;

    @Autowired
    public WalletService(WalletRepository walletRepository, TransactionService transactionService) {
        this.walletRepository = walletRepository;
        this.transactionService = transactionService;
    }

    public void createNewWallet(User user){
             Wallet wallet = initializeWallet(user);
             walletRepository.save(wallet);
             log.info("New wallet created with ID: " + wallet.getId()+"and balance"+wallet.getBalance());
    }

    private Wallet initializeWallet(User user){
        return Wallet.builder()
                .owner(user)
                .status(WalletStatus.ACTIVE)
                .balance(new BigDecimal("20.00"))
                .currency(Currency.getInstance("EUR"))
                .createdOn(LocalDateTime.now())
                .updatedOn(LocalDateTime.now())
                .build();
    }
    
    @Transactional
    public Transaction topUp(UUID walletID,BigDecimal amount){
              String transactionDescription = "Top up %.2f".formatted(amount.doubleValue());
           Wallet wallet = walletRepository.findById(walletID).orElseThrow(() ->new DomainException("Wallet not found"));
           if(!wallet.getStatus().equals(WalletStatus.ACTIVE)){
               return transactionService.createTransaction(wallet.getOwner(),"UGA_BUGA",walletID.toString(),amount,wallet.getBalance(),wallet.getCurrency(), TransactionType.DEPOSIT, TransactionStatus.FAILED,transactionDescription,"Inactive_wallet");
           }
           wallet.setBalance(wallet.getBalance().add(amount));
           wallet.setUpdatedOn(LocalDateTime.now());
           walletRepository.save(wallet);
           Transaction transaction = transactionService.createTransaction(wallet.getOwner(),"UGA_BUGA",walletID.toString(),amount,wallet.getBalance(),wallet.getCurrency(), TransactionType.DEPOSIT, TransactionStatus.SUCCEEDED,transactionDescription,"null");
        return  transaction;
    }
}
