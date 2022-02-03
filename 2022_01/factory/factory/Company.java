package factory.factory;

public class Company {
    public String name;
    public short yearEstab;
    public double marketCap;

    public Company(String name, short yearEstab, double marketCap) {
        this.name = name;
        this.yearEstab = yearEstab;
        this.marketCap = marketCap;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public short getYearEstab() {
        return this.yearEstab;
    }

    public void setYearEstab(short yearEstab) {
        this.yearEstab = yearEstab;
    }

    public double getMarketCap() {
        return this.marketCap;
    }

    public void setMarketCap(double marketCap) {
        this.marketCap = marketCap;
    }

    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", yearEstab='" + getYearEstab() + "'" +
            ", marketCap='" + getMarketCap() + "'" +
            "}";
    }

}
