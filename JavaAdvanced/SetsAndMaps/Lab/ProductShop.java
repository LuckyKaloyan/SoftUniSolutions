package AdvancedModule.SetsAndMaps.Lab;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class ProductShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      TreeMap<String, LinkedHashMap<String,Double>> mapche = new TreeMap<>();

      String input = scanner.nextLine();
      while(!input.equals("Revision")){
          String[] splitted = input.split(", ");
          String shopname = splitted[0];
          String productname = splitted[1];
          double price = Double.parseDouble(splitted[2]);

          if(!mapche.containsKey(shopname)){
              LinkedHashMap<String,Double> products = new LinkedHashMap<>();
              products.put(productname,price);
              mapche.put(shopname,products);
          }else{
              mapche.get(shopname).put(productname,price);
          }
          input = scanner.nextLine();
      }
      for(Map.Entry<String,LinkedHashMap<String,Double>>entry: mapche.entrySet()){
          System.out.println(entry.getKey()+"->");
          for(Map.Entry<String,Double> entry1:entry.getValue().entrySet()){
              System.out.printf("Product: %s, Price: %.1f",entry1.getKey(),entry1.getValue());
              System.out.println();
          }
      }
    }
}