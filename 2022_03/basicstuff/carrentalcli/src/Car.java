public class Car {
    private String make;
    private String model;
    private String isRented;
    
    public Car(String make, String model) {
        this.make = make;
        this.model = model;
        this.isRented = false;
    }

    public String getMake() {
        return this.make;
    }

    public String getModel() {
        return this.model;
    }


    public boolean isIsRented() {
        return this.isRented;
    }

    public void setIsRented(boolean isRented) {
        this.isRented = isRented;
    }

    @Override
    public String toString() {
        return "{" +
            " make = '" + getMake() + "'" +
            ", model = '" + getModel() + "'" +
            ", isRented = '" + isIsRented() + "'" +
            "}";
    }

}
