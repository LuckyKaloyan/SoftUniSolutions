package SoftUniJavaOOP.OOP.Encapsulation.Exercise.PizzaCalories;

public class Dough {
    private String flourType;
    private String bakingTechnique;
    private double weight;


    public Dough(String flourType, String bakingTechnique, double weight){
        setFlourType(flourType);
        setBakingTechnique(bakingTechnique);
        setWeight(weight);
    }

    public void setWeight(double weight) {
        if(weight>200 || weight<1){
            throw new IllegalArgumentException("Dough weight should be in the range [1..200].");
        }else {this.weight = weight;}
    }
    public void setFlourType(String flourType) {
        if(!flourType.equals("White") && !flourType.equals("Wholegrain")){
            throw new IllegalArgumentException("Invalid type of dough.");
        }else{
            this.flourType = flourType;
        }
    }
    public void setBakingTechnique(String bakingTechnique) {
        if(!bakingTechnique.equals("Crispy")
                && !bakingTechnique.equals("Chewy") && !bakingTechnique.equals("Homemade")){
            throw new IllegalArgumentException("Invalid type of dough.");
        }else {
            this.bakingTechnique = bakingTechnique;
        }
    }
    public double calculateCalories(){
        double calories = 2;
        switch(bakingTechnique){
            case "Crispy" : calories=calories*0.9;break;
            case "Chewy" : calories=calories*1.1; break;
            case "Homemade" : calories=calories*1;break;
        }
        switch(flourType){
            case "Wholegrain" : calories=calories*1;break;
            case "White": calories=calories*1.5; break;
        }

        return calories*weight;
    }
}
