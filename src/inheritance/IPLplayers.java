package inheritance;

public class IPLplayers {
    boolean isCaptain;
    String name;
    int age;
    int run;
    int experience;
    int jerseyno;
    int matchplayed;
    boolean isAllrounder;


    public IPLplayers(String name, int age, int run, int jerseyno, int experience, int matchplayed, boolean isAllrounder
            , boolean isCapitain) {
        this.name = name;
        this.age = age;
        this.run = run;
        this.jerseyno = jerseyno;
        this.experience = experience;
        this.matchplayed = matchplayed;
        this.isAllrounder = isAllrounder;
        this.isCaptain = isCapitain;}
        void average () {
            System.out.println("Average" + (run / matchplayed));

        }
        public String info () {
            return "IPLplayers{" +
                    "age=" + age +
                    ", isCaptain=" + isCaptain +
                    ", name='" + name + '\'' +
                    ", run=" + run +
                    ", experience=" + experience +
                    ", jerseyno=" + jerseyno +
                    ", matchplayed=" + matchplayed +
                    ", isAllrounder=" + isAllrounder +
                    '}';
        }

    }
