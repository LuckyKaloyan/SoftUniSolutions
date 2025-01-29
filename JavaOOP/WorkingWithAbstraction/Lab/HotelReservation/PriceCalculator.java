package SoftUniJavaOOP.OOP.WorkingWithAbstraction.Lab.HotelReservation;

public class PriceCalculator {
    double pricePerDay;
    int numberOfDays;
    String season;
    String discountType;



      PriceCalculator(double pricePerDay, int numberOfDays, String season, String discountType){
          this.pricePerDay = pricePerDay;
          this.numberOfDays = numberOfDays;
          this.season = season;
          this.discountType = discountType;
      }

      public String calculated(PriceCalculator calculator){
          double initialPrice = pricePerDay;
          switch(season){
              case "Autumn" : initialPrice=initialPrice*1;break;
              case "Spring" : initialPrice=initialPrice*2;break;
              case "Winter" : initialPrice=initialPrice*3;break;
              case "Summer" : initialPrice=initialPrice*4;break;
          }
          initialPrice=initialPrice*numberOfDays;
          switch(discountType){
              case "VIP" : initialPrice=initialPrice*0.8;break;
              case "SecondVisit" : initialPrice=initialPrice*0.9;break;
              default : break;
          }

          return String.format("%.2f",initialPrice);
      }

}
