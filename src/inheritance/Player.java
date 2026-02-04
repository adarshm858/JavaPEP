package inheritance;

public class Player {
    String  name ;
    int age;
    int experience;
    int matchPlayed;
    Gender gender;

    public Player(int age, int experience, int matchPlayed, String name) {
        this.age = age;
        this.experience = experience;
        this.matchPlayed = matchPlayed;
        this.name = name;
        this.gender= gender;
    }


    public String info() {
        return "Player{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", experience=" + experience +
                ", matchPlayed=" + matchPlayed +
                '}';
    }
}
