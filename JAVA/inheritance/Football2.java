package inheritance;

public class Football2  extends Player {
    int goal;
    int jerseyNo;
    boolean matchPlayed;
    boolean isCaptain;

    public Football2(int age, int experience, int matchPlayed, String name, int goal, boolean isCaptain,
                     int jerseyNo, boolean matchPlayed1) {
        super(age, experience, matchPlayed, name);
        this.goal = goal;
        this.isCaptain = isCaptain;
        this.jerseyNo = jerseyNo;
        this.matchPlayed = matchPlayed1;
    }
}

