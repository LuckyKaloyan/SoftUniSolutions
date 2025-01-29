package SoftUniJavaOOP.OOP.Encapsulation.Exercise.Box;

public class Box {
    private double length;
    private double width;
    private double height;


    public Box(double length, double width, double height){
        this.setLength(length);
        this.setWidth(width);
        this.setHeight(height);
    }

    private void setLength(double length) {
        if(length<=0){throw new IllegalArgumentException("Length cannot be zero or negative.");
        }
        else{
            this.length = length;}
    }

    private void setHeight(double height) {
        if(height<=0){throw new IllegalArgumentException("Height cannot be zero or negative.");}
        else {
            this.height = height;
        }
    }

    private void setWidth(double width) {
        if(width<=0){throw new IllegalArgumentException("Width cannot be zero or negative.");}
        else{
            this.width = width;}
    }
    public double calculateSurfaceArea(){
        return (2*(length*width+length*height+width*height));
    }
    public double calculateLateralSurfaceArea (){
        return 2*(length*height+width*height);
    }
    public double calculateVolume(){
        return width*length*height;
    }
}
