package app.user.model;


import app.subscription.model.Subscription;
import app.wallet.model.Wallet;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;


@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(nullable = false,unique = true)
    private String username;

    private String firstName;

    private String lastName;

    private String profilePicture;

    @Column(unique = true)
    private String email;
    @Column(nullable = false)
    private String password;
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private UserRole role;
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Country country;

    @Column(nullable = false)
    private LocalDate createdOn;
    @Column(nullable = false)
    private LocalDate updatedOn;

    private boolean isActive;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "owner")
    private List<Subscription> subscriptions;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "owner")
    private List<Wallet> wallets;






}
