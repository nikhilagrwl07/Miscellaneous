package Generics.genericClass.Player;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class League<T extends Team>{

    private String leagueName;

    private List<T> teamList;

    public League(String leagueName) {
        this.leagueName = leagueName;
        this.teamList = new ArrayList<>();
    }

    boolean addTeam(T team){
        if(team==null)
            return false;

        if(this.getTeamList().contains(team))
            return false;

        teamList.add(team);
        return true;
    }

    public List<T> getTeamList() {
        return teamList;
    }

    void showLeagueTable(){
       Collections.sort(teamList);
    }
}
