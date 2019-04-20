package Generics.genericClass.Player;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Player
        //Football Player
        FootBallPlayer nikhil = new FootBallPlayer("Nikhil");
        FootBallPlayer nikhil2 = new FootBallPlayer("Nikhil2");

        //Basket Player
        BasketBallPlayer ritu = new BasketBallPlayer("Ritu");
        BasketBallPlayer ritu2 = new BasketBallPlayer("Ritu2");

        //Volleyball Player
        VolleyBallPlayer menu = new VolleyBallPlayer("Menu");
        VolleyBallPlayer menu2 = new VolleyBallPlayer("Menu2");


        // Team
        Team<FootBallPlayer> footBallTeam1 = new Team<>("Kolkata Night Riders");
        footBallTeam1.setWon(10);
        footBallTeam1.add(nikhil);

        Team<FootBallPlayer> footBallTeam2 = new Team<>("Bangalore Royal Challengers");
        footBallTeam2.setWon(20);
        footBallTeam2.add(nikhil2);

        String result = footBallTeam1.match(footBallTeam2);
        System.out.println(result);

        Team<BasketBallPlayer> basketBallTeam1 = new Team<>("Uttar Pradesh Kheladi");
        basketBallTeam1.setWon(40);
        basketBallTeam1.add(ritu);


        Team<BasketBallPlayer> basketBallTeam2 = new Team<>("Delhi Players");
        basketBallTeam2.setWon(30);
        basketBallTeam1.add(ritu2);

        String basketBallResult = basketBallTeam1.match(basketBallTeam2);
        System.out.println(basketBallResult);


        // Error condition - when playing match between one football team versus one basketball team
        //footBallTeam1.match(basketBallTeam1);

        int rankingcomparison = basketBallTeam1.compareTo(basketBallTeam2);
        System.out.println(rankingcomparison);

        List<Team<BasketBallPlayer>> basketBallTeams = new ArrayList<>();
        basketBallTeams.add(basketBallTeam2);
        basketBallTeams.add(basketBallTeam1);

        System.out.println("Before Collections.sort... ");
        for (Team<BasketBallPlayer> basketBallPlayerTeam : basketBallTeams) {
            System.out.println(basketBallPlayerTeam.getName());
        }
        Collections.sort(basketBallTeams);

        System.out.println("After Collections.sort... ");
        for (Team<BasketBallPlayer> basketBallPlayerTeam : basketBallTeams) {
            System.out.println(basketBallPlayerTeam.getName());
        }

        // League

        League<Team<FootBallPlayer>> footballLeague = new League<>("Indian Premier League");
        footballLeague.addTeam(footBallTeam1);
        footballLeague.addTeam(footBallTeam2);


        System.out.println("League Before Collections.sort... ");
        for (Team<FootBallPlayer> footBallPlayerTeam : footballLeague.getTeamList()) {
            System.out.println(footBallPlayerTeam.getName() + " :: " + footBallPlayerTeam.getRanking());
        }

        footballLeague.showLeagueTable();

        System.out.println("League After Collections.sort... ");
        for (Team<FootBallPlayer> footBallPlayerTeam : footballLeague.getTeamList()) {
            System.out.println(footBallPlayerTeam.getName() + " :: " + footBallPlayerTeam.getRanking());
        }
    }
}
