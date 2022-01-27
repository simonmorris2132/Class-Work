package factory;

public class Fruit {
    private String name;
    private String color;
    private boolean hasSeeds;

    public Fruit(String name, String color, boolean hasSeeds) {
        this.name = name;
        this.color = color;
        this.hasSeeds = hasSeeds;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isHasSeeds() {
        return this.hasSeeds;
    }

    public boolean getHasSeeds() {
        return this.hasSeeds;
    }

    public void setHasSeeds(boolean hasSeeds) {
        this.hasSeeds = hasSeeds;
    }

    @Override
    public String toString() {
        return "{" +
            " name = '" + getName() + "'" +
            ", color = '" + getColor() + "'" +
            ", hasSeeds = '" + isHasSeeds() + "'" +
            "}";
    }


}
