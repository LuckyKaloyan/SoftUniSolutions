package bg.softuni.productshop.data.entities;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name= "users")
public class User extends BaseEntity {

    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name", nullable = false)
    private String lastName;
    @Column
    private int age;
@ManyToMany(fetch = FetchType.EAGER)
@JoinTable(name = "users_friends",
                joinColumns = @JoinColumn(name = "friend_id",referencedColumnName = "id"),
                inverseJoinColumns = @JoinColumn(name="users_id",referencedColumnName = "id"))
    private Set<User> friends;

    public User() {}
    public User(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
}
