package FundamentalsModule.FinalExamPreparation;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FancyBarcodes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int times = Integer.parseInt(scanner.nextLine());

        String regex = "@#+[A-Z][A-Za-z0-9]{4,}[A-Z]@#+";
        Pattern pattern = Pattern.compile(regex);
        String input;
        for(int i=0; i<times; i++){
            input = scanner.nextLine();
            Matcher matcher = pattern.matcher(input);
            if(matcher.find()){
                StringBuilder code = new StringBuilder();
                for(int j=0; j<matcher.group().length(); j++){
                    if(Character.isDigit(matcher.group().charAt(j))){
                        code.append(matcher.group().charAt(j));
                    }
                }
                if(code.toString().equals("")){
                    System.out.println("Product group: 00");
                }else {
                    System.out.println("Product group: "+code);
                }
            }else{
                System.out.println("Invalid barcode");
            }
        }













    }
}
