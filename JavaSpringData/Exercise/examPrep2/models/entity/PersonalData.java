package softuni.exam.models.entity;


import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import org.hibernate.validator.constraints.Length;
import softuni.exam.models.Gender;

import java.time.LocalDate;

@Entity
@Table(name = "personal_datas")
public class PersonalData extends BaseEntity {
    @Column
    private int age;
    @Column(name = "birth_date")
    private LocalDate birthDate;
    @Column(name = "card_number", unique = true, nullable = false)
    private String cardNumber;
    @Column(length = 1)
    @Enumerated(EnumType.STRING)
    private Gender gender;



    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
}
