package softuni.exam.models.entity;

import softuni.exam.models.ApartmentType;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "apartments")
public class Apartment extends BaseEntity {

    @Column(name = "apartment_type", nullable = false)
    @Enumerated(EnumType.STRING)
    private ApartmentType apartmentType;
    @Column(nullable = false)
    private double area;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "town_id", referencedColumnName = "id")
    private Town town;
    @OneToMany(mappedBy = "apartment", fetch = FetchType.EAGER)
    private List<Offer> offers;


    public ApartmentType getApartmentType() {
        return apartmentType;
    }

    public void setApartmentType(ApartmentType apartmentType) {
        this.apartmentType = apartmentType;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public Town getTown() {
        return town;
    }

    public void setTown(Town town) {
        this.town = town;
    }

    public List<Offer> getOffers() {
        return offers;
    }

    public void setOffers(List<Offer> offers) {
        this.offers = offers;
    }
}
