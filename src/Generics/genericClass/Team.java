package Generics.genericClass;

import java.util.ArrayList;
import java.util.List;


public class Team<T extends Player> implements Comparable<Team<T>>{
    private List<T> players;
    private String name;
    private int won = 0;
    private int lost = 0;
    private int drew = 0;

    public Team(String name) {
        this(10);
        this.name=name;
    }

    String getName() {
        return name;
    }

    public Team(int capacity) {
        players = new ArrayList<>(capacity);
    }

    public boolean add(T player) {
        //can't add if player is null
        if (player == null) {
            return false;
        }

        //don't add duplicate
        if (!findPlayer(player)) {
            //add to next player
            players.add(player);
            return true;
        }
        return false;
    }


    public boolean remove(T player) {
        if (player == null)
            return false;

        return players.remove(player);
    }

    public boolean findPlayer(T player) {
        for (int i = 0; i < players.size(); i++) {
            if (players.get(i).equals(player))
                return true;
        }
        return false;
    }

    public String match(Team<T> opponent){

        if(opponent==null)
            return null;

        String result;

        if(won<opponent.getWon()){
            result= " lost to ";
            lost++;
        }
        else if(won>opponent.getWon()){
            result = " won to ";
            won++;
        }
        else {
            result = " drew to ";
            drew++;
        }

        return this.getName() + result + opponent.getName();

    }

    public int getWon() {
        return won;
    }

    public int getDrew() {
        return drew;
    }

    public void setWon(int won) {
        this.won = won;
    }

    public int getRanking(){
        return 2*getWon() + drew;
    }

    @Override
    public int compareTo(Team<T> opponent) {

        if(this.getRanking()>opponent.getRanking())
            return -1;
        else if (this.getRanking() < opponent.getRanking())
            return 1;

        return 0;
    }

    @Override
    public String toString() {
        return "Team{" +
                "players=" + players +
                ", name='" + name + '\'' +
                '}';
    }
}

