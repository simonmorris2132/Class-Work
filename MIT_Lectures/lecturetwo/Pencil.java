package lecturetwo;

public class Pencil {
    private String color;
    private int length;
    private float diameter;
    private static long nextID = 0;

    public Pencil(String color, int length, float diameter) {
        this.color = color;
        this.length = length;
        this.diameter = diameter;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getLength() {
        return this.length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public float getDiameter() {
        return this.diameter;
    }

    public void setDiameter(float diameter) {
        this.diameter = diameter;
    }

}
