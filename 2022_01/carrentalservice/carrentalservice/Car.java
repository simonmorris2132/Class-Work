package carrentalservice;

public class Car {
    private String make;
    private String model;
    private boolean isRented;

    public Car(String make, String model, boolean isRented) {
        this.make = make;
        this.model = model;
        this.isRented = isRented;
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

    public boolean isIsRented() {
        return this.isRented;
    }

    public boolean getIsRented() {
        return this.isRented;
    }

    public void setIsRented(boolean isRented) {
        this.isRented = isRented;
    }

    @Override
    public String toString() {
        return "{" +
            " make= '" + getMake() + "'" +
            ", model= '" + getModel() + "'" +
            ", isRented= '" + isIsRented() + "'" +
            "}";
    }

}
