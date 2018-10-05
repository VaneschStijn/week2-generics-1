package be.pxl.generics.opgave3;

import java.util.ArrayList;

public class Team<T extends Player> {
    private String name;
    private int played, won, lost, tied;
    private ArrayList<T> members = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getPlayed() {
        return played;
    }

    public int getWon() {
        return won;
    }

    public int getLost() {
        return lost;
    }

    public int getTied() {
        return tied;
    }

    public ArrayList<T> getMembers() {
        return members;
    }

    public void addPlayer(T player) {
        if(!members.contains(player)){
            members.add(player);
        }
    }

    public int numberOfPlayers() {
        return members.size();
    }

    public void matchResult(Team<T> opponent, int ourScore, int theirScore) {
        if (ourScore > theirScore) {
            won++;
        } else if (ourScore < theirScore) {
            lost++;
        } else {
            tied++;
        }

        played++;

        if(opponent != null){
            opponent.matchResult(null, theirScore, ourScore);
        }
    }

    public int ranking(){
        int result;

        result = won * 3 + tied;
        return result;
    }
}

