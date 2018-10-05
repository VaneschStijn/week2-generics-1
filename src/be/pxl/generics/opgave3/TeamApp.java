package be.pxl.generics.opgave3;

public class TeamApp {
    public static void main(String[] args) {
        Team<VolleybalPlayer> team = new Team("OVV");
        VolleybalPlayer volley = new VolleybalPlayer("Tom");
        BaseballPlayer base = new BaseballPlayer("Tom");

        team.addPlayer(volley);
        //team.addPlayer(base);

        Team<VolleybalPlayer> team2 = new Team("Kaulille");
        team.matchResult(team2, 2, 1);

        System.out.println(team.getName());
        System.out.println(team.getWon());
        System.out.println(team.getLost());
        System.out.println(team.getTied());
        System.out.println(team.getPlayed());
        System.out.println(team.ranking());

        System.out.println(team2.getName());
        System.out.println(team2.getWon());
        System.out.println(team2.getLost());
        System.out.println(team2.getTied());
        System.out.println(team2.getPlayed());
        System.out.println(team2.ranking());
    }
}
