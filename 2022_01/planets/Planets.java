package planets;

public class Planets {
    private String type;
    private int radius;
    private String gravity;


    public Planets(String type, int radius, String gravity) {
        this.type = type;
        this.radius = radius;
        this.gravity = gravity;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getRadius() {
        return this.radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public String getGravity() {
        return this.gravity;
    }

    public void setGravity(String gravity) {
        this.gravity = gravity;
    }

}
