package bg.softuni.productshop.data.entities;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    protected BaseEntity() {}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
