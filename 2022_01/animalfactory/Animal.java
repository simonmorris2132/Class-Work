package animalfactory;

public class Animal {
    public String species;
    public short legs;
    public boolean livesOnLand;

    public Animal(String species, short legs, boolean livesOnLand) {
        this.species = species;
        this.legs = legs;
        this.livesOnLand = livesOnLand;
    }

    public String getSpecies() {
        return this.species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public short getLegs() {
        return this.legs;
    }

    public void setLegs(short legs) {
        this.legs = legs;
    }

    public boolean isLivesOnLand() {
        return this.livesOnLand;
    }

    public boolean getLivesOnLand() {
        return this.livesOnLand;
    }

    public void setLivesOnLand(boolean livesOnLand) {
        this.livesOnLand = livesOnLand;
    }

    @Override
    public String toString() {
        return "{" +
            " species='" + getSpecies() + "'" +
            ", legs='" + getLegs() + "'" +
            ", livesOnLand='" + isLivesOnLand() + "'" +
            "}";
    }


}
