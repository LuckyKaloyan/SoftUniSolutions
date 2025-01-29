package FundamentalsModule.ObjectsAndClasses.Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
public class AdvertisementMessage {

    public AdvertisementMessage(String author, String city, String event, String phrase){
        this.author = author;
        this.city = city;
        this.event = event;
        this.phrase = phrase;
    }
    String phrase;
    String event;
    String author;
    String city;




    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int times = Integer.parseInt(scanner.nextLine());

        List<String> phrases = new ArrayList<>();
        phrases.add("Excellent product.");
        phrases.add("Such a great product.");
        phrases.add("Best product of its category.");
        phrases.add("Exceptional product.");
        phrases.add("I can’t live without this product.");

        List<String> events = new ArrayList<>();
        events.add("Now I feel good.");
        events.add("I have succeeded with this product.");
        events.add("Makes miracles. I am happy of the results!");
        events.add("I cannot believe but now I feel awesome.");
        events.add("Try it yourself, I am very satisfied.");
        events.add("I feel great!");

        List<String> authors = new ArrayList<>();
        authors.add("Diana");
        authors.add("Diana");
        authors.add("Stella");
        authors.add("Elena");
        authors.add("Katya");
        authors.add("Iva");
        authors.add("Annie");
        authors.add("Eva");

        List<String> city = new ArrayList<>();
        city.add("Burgas");
        city.add("Sofia");
        city.add("Plovdiv");
        city.add("Varna");
        city.add("Ruse");

        for(int i=0; i<times; i++){
            Random rphrase = new Random();
            Random revents = new Random();
            Random rauthors = new Random();
            Random rcity = new Random();

            int numberphrase = rphrase.nextInt(phrases.size());
            int numberevents = revents.nextInt(events.size());
            int numberauthors = rauthors.nextInt(authors.size());
            int numbercity = rcity.nextInt(city.size());



            System.out.printf("%s. %s. %s - %s", phrases.get(numberphrase),events.get(numberevents), authors.get(numberauthors)
                    , city.get(numbercity));
            System.out.println();}



    }
}
