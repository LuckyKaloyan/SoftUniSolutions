package FundamentalsModule.Regex.Exercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatePassword {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int times = Integer.parseInt(scanner.nextLine());


        for(int i=0; i<times; i++){
            String text = scanner.nextLine();
            String loop;
            String concat = "";
            int one;

            String regex = "(_[.]+)([^_.])+(_[.]+)";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(text);
            if(matcher.matches()){
                loop=matcher.group();
                for(int j=0; j<loop.length(); j++){


                    try{one=Integer.parseInt(String.valueOf(loop.charAt(j)));
                        concat = concat+String.valueOf(one);

                    }catch(Exception e){}
                }

                if(Character.isLowerCase(matcher.group(2).charAt(matcher.group(2).length()-1))) {
                    System.out.println("Invalid pass!");
                }else if(concat.equals("")){
                    System.out.println("Group: default");
                }else {
                    System.out.println("Group: "+concat);}

                concat = "";
            }else{
                System.out.println("Invalid pass!");
            }

        }
    }
}
