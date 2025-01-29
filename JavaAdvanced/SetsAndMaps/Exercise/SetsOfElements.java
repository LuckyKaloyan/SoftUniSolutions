package AdvancedModule.SetsAndMaps.Exercise;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
public class SetsOfElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      int[] splitche = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
      LinkedHashSet<Integer> set1 = new LinkedHashSet<>();
      LinkedHashSet<Integer> set2 = new LinkedHashSet<>();
      LinkedHashSet<Integer> set3 = new LinkedHashSet<>();
      for(int i=0; i<splitche[0]; i++){
          set1.add(Integer.parseInt(scanner.nextLine()));
      }
      for(int i=0; i<splitche[1]; i++){
          set2.add(Integer.parseInt(scanner.nextLine()));
      }
      int length = Math.min(set1.size(),set2.size());
      if(length==set1.size()){
          for(int s:set1){
              if(set2.contains(s)){
                  set3.add(s);
              }
          }
      }else{
          for(int s:set2){
              if(set1.contains(s)){
                  set3.add(s);
              }
          }
      }
      for(int i:set3){
          System.out.print(i+" ");
      }
    }
}