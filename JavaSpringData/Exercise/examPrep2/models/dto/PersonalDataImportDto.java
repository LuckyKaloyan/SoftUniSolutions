package softuni.exam.models.dto;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Size;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="personal_data")
@XmlAccessorType(XmlAccessType.FIELD)
public class PersonalDataImportDto {

        @XmlElement
        @Min(1)
        @Max(100)
        private int age;
        @XmlElement(name = "birth_date")
        private String birthDate;
        @XmlElement(name = "card_number")
        @Size(min = 9, max = 9)
        private String cardNumber;
        @XmlElement
        @Size(min =1, max =1)
        private String gender;

        public int getAge(){
            return this.age;
        }
        public String getBirthDate(){
            return this.birthDate;
        }
        public String getCardNumber(){
            return this.cardNumber;
        }
        public String getGender(){
            return this.gender;
        }
        public void setAge(int age){
            this.age = age;
        }
        public void setBirthDate(String birthDate){
            this.birthDate = birthDate;
        }
        public void setCardNumber(String cardNumber){
            this.cardNumber = cardNumber;
        }
        public void setGender(String gender){
            this.gender = gender;
        }

    }

