package softuni.exam.models.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name ="agents")
public class Agent extends BaseEntity {

    @Column(name = "first_name", unique = true, nullable = false)
    private String firstName;
    @Column(name = "last_name", nullable = false)
    private String lastName;
    @Column(unique = true, nullable = false)
    private String email;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "town_id", referencedColumnName = "id")
    private Town town;
    @OneToMany(mappedBy = "agent", fetch = FetchType.EAGER)
    private List<Offer> offers;

}
