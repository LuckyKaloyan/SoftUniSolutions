package SoftUniJavaOOP.OOP.InterfacesAndAbstraction.Exercise.Telephony;

import java.util.List;

public class Smartphone implements Callable,Browsable{

    private List<String> numbers;
    private List<String> urls;


    public Smartphone(List<String> numbers, List<String> urls){
        this.numbers = numbers;
        this.urls = urls;
    }

    @Override
    public String call() {
        String output = "";
        for(String number:numbers){
            boolean callable = true;
            for(int i=0; i<number.length(); i++){
                if(!Character.isDigit(number.charAt(i))){
                    callable=false;
                }
            }
            if(callable) {
                output = output + "Calling... " + number + System.lineSeparator();
            }else{
                output  = output+ "Invalid number!"+System.lineSeparator();
            }
        }
        return output;
    }

    @Override
    public String browse() {
        String output = "";
        for(String url:urls){
            boolean browsable = true;
            for(int i=0; i<url.length(); i++){
                if(Character.isDigit(url.charAt(i))){
                    browsable=false;
                }
            }

            if(browsable) {
                output = output + "Browsing: " + url + "!"+System.lineSeparator();
            }else{
                output = output+"Invalid URL!"+System.lineSeparator();
            }
        }
        return output;
    }


}
