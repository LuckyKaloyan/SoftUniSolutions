package FundamentalsModule.ObjectsAndClasses.Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Songs {
    String name;
    String type;
    String time;

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public Songs(String name, String type, String time) {
        this.name = name;
        this.type = type;
        this.time = time;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Songs> songsList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] songsArr = scanner.nextLine().split("_");
            String type = songsArr[0];
            String name = songsArr[1];
            String time = songsArr[2];

            Songs currentSong = new Songs(type, name, time);

            songsList.add(currentSong);
        }

        String typee = scanner.nextLine();

        if (typee.equals("all")) {
            for (Songs song : songsList) {
                System.out.println(song.getName());
            }
        } else {
            for (Songs song : songsList) {
                if (song.getType().equals(typee)) {
                    System.out.println(song.getName());
                }
            }
        }
    }
}
