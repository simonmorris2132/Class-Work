package carfactory;

public class Car {
    public String make;
    public String model;
    public int mileage;
    public float gasTankPercent;

    public Car(String make, String model, int mileage, float gasTankPercent) {
        this.make = make;
        this.model = model;
        this.mileage = mileage;
        this.gasTankPercent = gasTankPercent;
    }

    public String getMake() {
        return this.make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMileage() {
        return this.mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public float getGasTankPercent() {
        return this.gasTankPercent;
    }

    public void setGasTankPercent(float gasTankPercent) {
        this.gasTankPercent = gasTankPercent;
    }

    @Override
    public String toString() {
        return "{" +
            " make='" + getMake() + "'" +
            ", model='" + getModel() + "'" +
            ", mileage='" + getMileage() + "'" +
            ", gasTankPercent='" + getGasTankPercent() + "'" +
            "}";
    }

}
