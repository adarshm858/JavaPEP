package Encapsulations;

public class student {
    private int roll;
    private String name;
    String collageName;

    public String getName() {
        return name;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public void setName(String name) {
        this.name = name;
    }

    public student(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }


    String info() {
        return "Students{" +
                "roll=" + roll +
                ", name='" + name + '\'' +
                '}';
    }
}
