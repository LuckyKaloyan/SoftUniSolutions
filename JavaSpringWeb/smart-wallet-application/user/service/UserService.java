package app.user.service;


import app.exception.DomainException;
import app.subscription.service.SubscriptionService;
import app.user.model.User;
import app.user.model.UserRole;
import app.user.repository.UserRepository;
import app.wallet.service.WalletService;
import app.web.dto.LoginRequest;
import app.web.dto.RegisterRequest;
import jakarta.transaction.Transactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Slf4j
@Service
public class UserService {


     private final UserRepository userRepository;
     private final PasswordEncoder passwordEncoder;
     private final SubscriptionService subscriptionService;
     private final WalletService walletService;

    @Autowired
   public UserService(UserRepository userRepository, PasswordEncoder passwordEncoder, SubscriptionService subscriptionService, WalletService walletService) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
        this.subscriptionService = subscriptionService;
        this.walletService = walletService;
    }

@Transactional
    public User register(RegisterRequest registerRequest) {

        if(userRepository.findByUsername(registerRequest.getUsername()).isPresent()) {
            throw new DomainException("Username %s already exist".formatted(registerRequest.getUsername()));
        }

        User user = initializeUser(registerRequest);
        subscriptionService.createDefaultSubscription(user);
        walletService.createNewWallet(user);


        userRepository.save(user);
        log.info("Successfully registered user {}.", user.getUsername());
      return user;
    }

    public User login(LoginRequest loginRequest) {


        if(userRepository.findByUsername(loginRequest.getUsername()).isEmpty()) {
            throw new DomainException("BAD COMBO PASS USER");
        }
        User user = userRepository.findByUsername(loginRequest.getUsername()).get();
        if(!passwordEncoder.matches(loginRequest.getPassword(), user.getPassword())) {
            throw new DomainException("BAD COMBO PASS USER");
        }

        return user;


    }

    private User initializeUser(RegisterRequest registerRequest) {
        return User.builder().username(registerRequest.getUsername())
                .password(passwordEncoder.encode(registerRequest.getPassword()))
                .role(UserRole.USER)
                .isActive(true)
                .country(registerRequest.getCountry())
                .updatedOn(LocalDate.now())
                .createdOn(LocalDate.now())
                .build();
    }

}
