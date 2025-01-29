package AdvancedModule.SetsAndMaps.Lab;
import java.util.*;
public class SoftuniParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            String guest = scanner.nextLine();
            Set<String> set = new TreeSet<>();
            Set<String> vipset = new TreeSet<>();
            while(!guest.equals("PARTY")){
                if(Character.isDigit(guest.charAt(0))){
                    vipset.add(guest);
                }else{
                    set.add(guest);
                }
                guest = scanner.nextLine();
            }
            guest = scanner.nextLine();
            while(!guest.equals("END")){
                    set.remove(guest);
                    vipset.remove(guest);
                guest = scanner.nextLine();
            }
        System.out.println(set.size()+vipset.size());
            for(String s:vipset){
                System.out.println(s);
            }
            for(String s:set){
                System.out.println(s);
            }
    }
}