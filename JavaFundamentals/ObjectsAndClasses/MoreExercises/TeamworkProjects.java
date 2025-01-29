package FundamentalsModule.ObjectsAndClasses.MoreExercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TeamworkProjects {
    String name;
    String creator;
    List<String> members;

    public TeamworkProjects(String name, String creator) {
        this.name = name;
        this.creator = creator;
        this.members = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getCreator() {
        return creator;
    }

    public List<String> getMembers() {
        return members;
    }

    public void addMember(String member) {
        members.add(member);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int teamsCount = Integer.parseInt(scanner.nextLine());
        List<TeamworkProjects> teams = new ArrayList<>();

        for (int i = 0; i < teamsCount; i++) {
            String word = scanner.nextLine();
            String[] teamsData = word.split("-");

            String creatorName = teamsData[0];
            String teamName = teamsData[1];

            boolean isTeamNameExist = teams.stream().anyMatch(team -> team.getName().equals(teamName));
            boolean isCreatorExist = teams.stream().anyMatch(team -> team.getCreator().equals(creatorName));

            if (!isTeamNameExist && !isCreatorExist) {
                TeamworkProjects team = new TeamworkProjects(teamName, creatorName);
                teams.add(team);
                System.out.printf("Team %s has been created by %s!\n", teamName, creatorName);
            } else if (isTeamNameExist) {
                System.out.printf("Team %s was already created!\n", teamName);
            } else if (isCreatorExist) {
                System.out.printf("%s cannot create another team!\n", creatorName);
            }
        }

        while (true) {
            String word = scanner.nextLine();
            if (word.equals("end of assignment")) {
                break;
            }
            String[] clubMember = word.split("->");

            String memberName = clubMember[0];
            String teamName = clubMember[1];

            boolean isTeamExist = teams.stream().anyMatch(team -> team.getName().equals(teamName));
            boolean isCreatorCheating = teams.stream().noneMatch(team -> team.getCreator().equals(memberName));
            boolean isAlreadyMember = teams.stream().anyMatch(team -> team.getName().equals(teamName) && team.getMembers().contains(memberName));

            if (!isTeamExist) {
                System.out.printf("Team %s does not exist!\n", teamName);
            } else if (isAlreadyMember || !isCreatorCheating) {
                System.out.printf("Member %s cannot join team %s!\n", memberName, teamName);
            } else {
                for (TeamworkProjects team : teams) {
                    if (team.getName().equals(teamName)) {
                        team.addMember(memberName);
                        break;
                    }
                }
            }
        }

        List<TeamworkProjects> teamWithMembers = new ArrayList<>();
        List<TeamworkProjects> notValidTeams = new ArrayList<>();

        for (TeamworkProjects team : teams) {
            if (!team.getMembers().isEmpty()) {
                teamWithMembers.add(team);
            } else {
                notValidTeams.add(team);
            }
        }

        Collections.sort(teamWithMembers, (team1, team2) -> team1.getName().compareTo(team2.getName()));
        Collections.sort(notValidTeams, (team1, team2) -> team1.getName().compareTo(team2.getName()));

        for (TeamworkProjects team : teamWithMembers) {
            System.out.println(team.getName());
            System.out.println("- " + team.getCreator());
            List<String> members = team.getMembers();
            Collections.sort(members);
            for (String member : members) {
                System.out.println("-- " + member);
            }
        }

        System.out.println("Teams to disband:");
        for (TeamworkProjects team : notValidTeams) {
            System.out.println(team.getName());
        }
    }
}
