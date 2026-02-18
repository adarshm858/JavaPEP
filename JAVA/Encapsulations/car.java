package Encapsulations;

import java.lang.invoke.StringConcatFactory;

public class car {
   // final private String name="TOYOTA";
    private String name;
    private String noPlate;
    private float mielage;

    public float getMielage() {
        return mielage;
    }

    public void setMielage(float mielage) {
        this.mielage = mielage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNoPlate() {
        return noPlate;
    }

    public void setNoPlate(String noPlate) {
        this.noPlate = noPlate;
    }
}
