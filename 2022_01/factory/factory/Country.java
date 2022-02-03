package factory.factory;

public class Country {
    public String name;
    public long population;
    public String capital;

    public Country(String name, long population, String capital) {
        this.name = name;
        this.population = population;
        this.capital = capital;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPopulation() {
        return this.population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    public String getCapital() {
        return this.capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    @Override
    public String toString() {
        return "{" +
            " name = '" + getName() + "'" +
            ", population = '" + getPopulation() + "'" +
            ", capital = '" + getCapital() + "'" +
            "}";
    }

}
