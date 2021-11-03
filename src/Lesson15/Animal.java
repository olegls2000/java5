package Lesson15;

public class Animal implements Comparable<Animal> {
    private String name;
    private String kind;
    private int weight;
    private int lifeDuration;

    public Animal() {
    }

    public Animal(String name, String kind, int weight, int lifeDuration) {
        this.name = name;
        this.kind = kind;
        this.weight = weight;
        this.lifeDuration = lifeDuration;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getLifeDuration() {
        return lifeDuration;
    }

    public void setLifeDuration(int lifeDuration) {
        this.lifeDuration = lifeDuration;
    }

    @Override
    public int compareTo(Animal o) {
        return this.lifeDuration - o.getLifeDuration();
    }
}
