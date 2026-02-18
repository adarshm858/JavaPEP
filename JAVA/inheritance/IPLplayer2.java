package inheritance;

public class IPLplayer2  extends Player{
//    String name;
//    int age;
    int run;
//    int experience;
    int jerseyno;
    int matchplayed;
    boolean isAllrounder;

    public IPLplayer2(int age, int experience, int matchPlayed, String name, boolean isAllrounder, int jerseyno,
                      int matchplayed, int run) {
        super(age, experience, matchPlayed, name); //super call to the IMMEDIATE Parent constructor should
        // be the 1st statement
        //this(name,age,experience,matchPlayed,gender); //don't put super and this



        // in the same constructor as they will fight for the 1st positions
        //parent constructor should be the 1st statement
        this.isAllrounder = isAllrounder;
        this.jerseyno = jerseyno;
        this.matchplayed = matchplayed;
        this.run = run;
    }

    public IPLplayer2(int age, int experience, int matchPlayed, String name) {
        super(age, experience, matchPlayed, name);
    }

    void average(){
        System.out.println("Average:"+(run/matchplayed));
    }

}
