package app.subscription.service;

import app.subscription.model.Subscription;
import app.subscription.model.SubscriptionPeriod;
import app.subscription.model.SubscriptionStatus;
import app.subscription.model.SubscriptionType;
import app.subscription.repository.SubscriptionRepository;
import app.user.model.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDate;

@Slf4j
@Service
public class SubscriptionService {

      private final SubscriptionRepository subscriptionRepository;

      @Autowired
      public SubscriptionService(SubscriptionRepository subscriptionRepository) {
            this.subscriptionRepository = subscriptionRepository;
      }

      public void createDefaultSubscription(User user) {

            Subscription subscription = initilizeSubscription(user);
            subscriptionRepository.save(subscription);
            log.info("Subscription created: " + subscription+subscription.getId()+" id");
      }


      private static Subscription initilizeSubscription(User user) {
            LocalDate now = LocalDate.now();
            return Subscription.builder()
                    .owner(user)
                    .status(SubscriptionStatus.ACTIVE)
                    .period(SubscriptionPeriod.MONTHLY)
                    .type(SubscriptionType.DEFAULT)
                    .price(new BigDecimal("0.00"))
                    .renewalAllowed(true)
                    .createdOn(now)
                    .completedOn(now.plusMonths(1))
                    .build();
      }
}
